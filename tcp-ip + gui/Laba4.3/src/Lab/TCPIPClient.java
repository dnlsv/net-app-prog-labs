package Lab;

import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.*;
import java.net.*;

class TCPIPClient extends Frame implements ActionListener, WindowListener {
    TextField tf, tf1, tf2;
    TextArea ta;
    Label la, la1, la2, la3, la4;
    Socket cSocket  = null;
    InputStream cInput  = null;
    OutputStream   cOutput  = null;

    public static void main(String args[]) {
        TCPIPClient abc = new TCPIPClient();
        abc.GUI();
    }

    private void GUI() {
        setTitle("КЛИЕНТ");

        tf = new TextField("127.0.0.1");
        tf1 = new TextField("1024");
        tf2 = new TextField();

        ta = new TextArea();

        la = new Label("IP ADRESS");
        la1 = new Label("PORT");
        la2 = new Label("Sending line");
        la3 = new Label("Result ");
        la4 = new Label(" ");

        Button btn = new Button("Connect ");
        Button btn1 = new Button("Send ");

        tf.setBounds(200, 50, 70, 25);
        tf1.setBounds(330, 50, 70, 25);
        tf2.setBounds(150, 200, 200, 25);

        ta.setBounds(150, 300, 300, 100);

        btn.setBounds(50, 50, 70, 25);
        btn1.setBounds(50, 200, 70, 25);

        la.setBounds(130, 50, 150, 25);
        la1.setBounds(280, 50, 150, 25);
        la2.setBounds(150, 150, 150, 25);
        la3.setBounds(160, 250, 150, 25);
        la4.setBounds(600, 10, 150, 25);

        add(tf);
        add(tf1);
        add(tf2);
        add(btn);
        add(btn1);
        add(ta);
        add(la);
        add(la1);
        add(la2);
        add(la3);
        add(la4);

        setSize(600, 600);
        setVisible(true);

        addWindowListener(this);
        btn.addActionListener(al);
        btn1.addActionListener(this);
    }

    public void windowClosing(WindowEvent we) {
        if (cSocket  != null && !cSocket .isClosed()) {
            try {
                cSocket .close();
            } catch (IOException e) {
            }
        }
        this.dispose();
    }

    public void windowActivated(WindowEvent we) {} ;
    public void windowClosed(WindowEvent we) {};
    public void windowDeactivated(WindowEvent we) {};
    public void windowDeiconified(WindowEvent we) {} ;
    public void windowIconified(WindowEvent we) {};
    public void windowOpened(WindowEvent we) { } ;
    public void actionPerformed(ActionEvent e) {
        if (cSocket == null) {
            return;
        }
        try {
            cInput  = cSocket .getInputStream();
            cOutput  = cSocket .getOutputStream();
            String str = "";
            str += tf2.getText();
            cOutput .write(str.getBytes());
            byte[] bytes = new byte[1024];
            cInput .read(bytes);
            String resultStr = new String(bytes, "UTF-8");
            ta.append(resultStr + "\n");
        }
        catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                cOutput .close();
                cInput .close();
                cSocket .close();
            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }

    public void actionPerformed2(ActionEvent e) {}
    ActionListener al = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent arg0) {
            try {
                cSocket  = new Socket(InetAddress.getByName(tf.getText()), Integer.parseInt(tf1.getText()));
            } catch (NumberFormatException e) {
            } catch (UnknownHostException e) {
            } catch (IOException e) {
            }
        }
    };
}