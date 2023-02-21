package org.example;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;

import javax.imageio.ImageIO;
import javax.swing.*;

public class DemoThread extends JFrame{

    private int smokeWidth = 88, smokeHeight = 92, smokeX = 100, smokeY = 28,
            windowsWidth = 134, windowsHeight = 65, windowsX = 372, windowsY = 442;

    private static Image house;
    private static Image smoke;
    private static Image windows;
    JButton start, stop;

    public DemoThread() {
        setTitle("Demo app");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(650, 650);
        setLocationRelativeTo(null);
        setResizable(false);

        setContentPane(new House());
        Container content = getContentPane();

        start = new JButton("Старт");
        start.setPreferredSize(new Dimension(650, 50));
        start.setBackground(Color.white);
        start.setForeground(Color.BLACK);
        start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                content.add(new SmokeWindows());
                start.setVisible(false);
                Thread smokeMove = new Thread(new SmokeThread());
                smokeMove.start();
            }
        });
        content.add(start);
    }

    private static class House extends JPanel{
        @Override
        protected void paintComponent(Graphics g){
            super.paintComponent(g);
            try {
                house = ImageIO.read(new File("./src/main/resources/house.png"));
            } catch (IOException e) {
                e.printStackTrace();
            }
            g.drawImage(house,0,0,null);
        }
    }

    private class SmokeWindows extends JPanel{
        public SmokeWindows() {
            setOpaque(false);
            setPreferredSize(new Dimension(650, 650));
            try {
                smoke =  ImageIO.read(new File("./src/main/resources/smoke.png"));
                windows =  ImageIO.read(new File("./src/main/resources/windows.png"));

            }
            catch (IOException exc) {};

        }

        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            Graphics2D graphics2D = (Graphics2D)g;

            graphics2D.drawImage(smoke, smokeX, smokeY, smokeWidth, smokeHeight, this);
            graphics2D.drawImage(windows, windowsX, windowsY, windowsWidth, windowsHeight, this);
        }
    }

    public class SmokeThread implements Runnable{
        @Override
        public void run() {
            while (true) {
                smokeY = smokeY - 2;
                smokeX = smokeX - 1;
                if (smokeY == -96) {
                    smokeY = 28;
                    smokeX = 100;
                }
                repaint();
                try {
                    Thread.sleep(60);
                }
                catch (Exception exc) {};
            }
        }
    }

    public static void main(String[] args) throws IOException {
        new DemoThread().setVisible(true);
    }
}
