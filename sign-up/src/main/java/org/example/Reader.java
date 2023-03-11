package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Reader extends JFrame {
    static JLabel l1, l2, l3, l4, l5, l6, l7, l8;
    static JButton clear, register;
    static JTextField name, surname, number, login, password;
    static String[] box1 = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};
    static String[] box2 = {"январь", "февраль", "март", "апрель", "май", "июнь", "июль", "август", "сентябрь", "октябрь", "ноябрь", "декабрь"};
    static String[] box3 = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020"};
    static String[] box4 = {"Беларусь", "Россия", "Украина"};
    int flag;
    Object boxA, boxB, boxC, boxD;
    File file = new File("./src/main/resources/log.txt");
    JComboBox box_1, box_2, box_3, box_4;
    JRadioButton flag1, flag2;
    ButtonGroup bg;

    public Reader(String str) {
        super(str);
        setSize(490, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Font font = new Font("TimesRoman", Font.ROMAN_BASELINE, 16);
        Font fontB = new Font("TimesRoman", Font.BOLD, 16);


        clear = new JButton("Очистить");
        register = new JButton("Зарегистрироваться");
        name = new JTextField(9);
        surname = new JTextField(9);
        number = new JTextField(9);
        login = new JTextField(9);
        password = new JTextField(9);
        l1 = new JLabel("Имя");
        l2 = new JLabel("Фамилия");
        l3 = new JLabel("Дата рождения");
        l4 = new JLabel("Пол");
        l5 = new JLabel("Страна");
        l6 = new JLabel("Телефон");
        l7 = new JLabel("Логин");
        l8 = new JLabel("Пароль");
        box_1 = new JComboBox(box1);
        box_2 = new JComboBox(box2);
        box_3 = new JComboBox<Object>(box3);
        box_4 = new JComboBox<Object>(box4);
        flag1 = new JRadioButton("Мужской");
        flag2 = new JRadioButton("Женский");
        bg = new ButtonGroup();
        bg.add(flag1);
        bg.add(flag2);

        setLayout(null);

        l1.setSize(200, 30);
        l1.setLocation(30, 20);
        l1.setFont(fontB);
        name.setSize(230, 30);
        name.setLocation(210, 20);
        name.setFont(font);

        l2.setSize(220, 30);
        l2.setLocation(30, 70);
        l2.setFont(fontB);
        surname.setSize(230, 30);
        surname.setLocation(210, 70);
        surname.setFont(font);

        l3.setSize(200, 30);
        l3.setLocation(30, 120);
        l3.setFont(fontB);
        box_1.setSize(40, 30);
        box_1.setLocation(210, 120);
        box_1.setFont(font);
        box_2.setSize(100, 30);
        box_2.setLocation(260, 120);
        box_2.setFont(font);
        box_3.setSize(70, 30);
        box_3.setLocation(370, 120);
        box_3.setFont(font);

        l4.setSize(200, 30);
        l4.setLocation(30, 170);
        l4.setFont(fontB);
        flag1.setSize(100, 30);
        flag1.setLocation(210, 170);
        flag1.setFont(font);
        flag2.setSize(100, 30);
        flag2.setLocation(330, 170);
        flag2.setFont(font);

        l5.setSize(200, 30);
        l5.setLocation(30, 220);
        l5.setFont(fontB);
        box_4.setSize(160, 30);
        box_4.setLocation(210, 220);
        box_4.setFont(font);

        l6.setSize(200, 30);
        l6.setLocation(30, 270);
        l6.setFont(fontB);
        number.setSize(220, 30);
        number.setLocation(210, 270);
        number.setFont(font);

        l7.setSize(200, 30);
        l7.setLocation(30, 320);
        l7.setFont(fontB);
        login.setSize(220, 30);
        login.setLocation(210, 320);
        login.setFont(font);

        l8.setSize(200, 30);
        l8.setLocation(30, 370);
        l8.setFont(fontB);
        password.setSize(220, 30);
        password.setLocation(210, 370);
        password.setFont(font);

        clear.setSize(120, 40);
        clear.setLocation(30, 435);
        clear.setFont(font);
        register.setSize(220, 40);
        register.setLocation(210, 435);
        register.setFont(fontB);

        add(name);
        add(surname);
        add(number);
        add(login);
        add(password);
        add(l1);
        add(l2);
        add(l3);
        add(l4);
        add(l5);
        add(l6);
        add(l7);
        add(l8);
        add(box_1);
        add(box_2);
        add(box_3);
        add(box_4);
        add(flag1);
        add(flag2);
        add(clear);
        add(register);

        register.addActionListener(new ButtonActionListener());
        flag1.addActionListener(new FlagActionListener());
        flag2.addActionListener(new FlagActionListener());
        clear.addActionListener(new ClearActionListener());
        box_1.addActionListener(new BoxActionListener());
        box_2.addActionListener(new BoxActionListener());
        box_3.addActionListener(new BoxActionListener());
        box_4.addActionListener(new BoxActionListener());
    }

    public class ButtonActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            try {
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter out = new FileWriter(file, true);
                try {
                    out.write(name.getText() + " ");
                    out.write(surname.getText() + "\n");
                    out.write("Дата рождения: " + boxA + " " + boxB + " " + boxC + "\n");
                    if (flag == 1)
                        out.write("Пол: мужской " + "\n");
                    else if (flag == -1)
                        out.write("Пол: женский " + "\n");
                    out.write("Страна: " + boxD + "\n");
                    out.write("Телефон: " + number.getText() + "\n");
                    out.write("Логин: " + login.getText() + "\n");
                    out.write("Пароль: " + password.getText() + "\n\n");
                } finally {
                    out.close();
                }
            } catch (IOException e1) {
                throw new RuntimeException(e1);
            }
        }
    }

    public class FlagActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            flag = 0;
            if (e.getSource() == flag1) {
                flag++;
            } else if (e.getSource() == flag2) {
                flag--;
            }
        }
    }

    public class ClearActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == clear) {
                name.setText(null);
                surname.setText(null);
                number.setText(null);
                login.setText(null);
                password.setText(null);
                box_1.setSelectedIndex(0);
                box_2.setSelectedIndex(0);
                box_3.setSelectedIndex(0);
                box_4.setSelectedIndex(0);
                bg.clearSelection();
            }
        }
    }

    public class BoxActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (e.getSource() == box_1) {
                boxA = box_1.getSelectedItem();
            }
            if (e.getSource() == box_2) {
                boxB = box_2.getSelectedItem();
            }
            if (e.getSource() == box_3) {
                boxC = box_3.getSelectedItem();
            }
            if (e.getSource() == box_4) {
                boxD = box_4.getSelectedItem();
            }
        }
    }
}
