package org.example;

import javax.swing.*;
import javax.swing.plaf.basic.BasicOptionPaneUI;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class Reader extends JFrame {
    String mem;
    double a, b;
    boolean flagSum = false, flagSub = false, flagMul = false, flagDiv = false;
    static JButton zero, one, two, three, four, five, six, seven, eight, nine, sum, sub, mul, div, memory, mread, erase, sign, point, equality;
    static JTextField text;

    public Reader(String str) {
        super(str);
        setSize(400, 540);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        zero = new JButton("0");
        one = new JButton("1");
        two = new JButton("2");
        three = new JButton("3");
        four = new JButton("4");
        five = new JButton("5");
        six = new JButton("6");
        seven = new JButton("7");
        eight = new JButton("8");
        nine = new JButton("9");
        sum = new JButton("+");
        sub = new JButton("-");
        mul = new JButton("*");
        div = new JButton("/");
        memory = new JButton("M");
        mread = new JButton("MR");
        erase = new JButton("AC");
        sign = new JButton("+/-");
        point = new JButton(".");
        equality = new JButton("=");
        text = new JTextField(9);

        setLayout(null);

        text.setSize(300, 60);
        text.setLocation(40, 20);

        erase.setSize(60, 60);
        erase.setLocation(40, 100);
        erase.setBackground(Color.lightGray);
        memory.setSize(60, 60);
        memory.setLocation(120, 100);
        memory.setBackground(Color.lightGray);
        mread.setSize(60, 60);
        mread.setLocation(200, 100);
        mread.setBackground(Color.lightGray);
        div.setSize(60, 60);
        div.setLocation(280, 100);
        div.setBackground(Color.orange);

        seven.setSize(60, 60);
        seven.setLocation(40, 180);
        seven.setBackground(Color.gray);
        eight.setSize(60, 60);
        eight.setLocation(120, 180);
        eight.setBackground(Color.gray);
        nine.setSize(60, 60);
        nine.setLocation(200, 180);
        nine.setBackground(Color.gray);
        mul.setSize(60, 60);
        mul.setLocation(280, 180);
        mul.setBackground(Color.orange);

        four.setSize(60, 60);
        four.setLocation(40, 260);
        four.setBackground(Color.gray);
        five.setSize(60, 60);
        five.setLocation(120, 260);
        five.setBackground(Color.gray);
        six.setSize(60, 60);
        six.setLocation(200, 260);
        six.setBackground(Color.gray);
        sub.setSize(60, 60);
        sub.setLocation(280, 260);
        sub.setBackground(Color.orange);

        one.setSize(60, 60);
        one.setLocation(40, 340);
        one.setBackground(Color.gray);
        two.setSize(60, 60);
        two.setLocation(120, 340);
        two.setBackground(Color.gray);
        three.setSize(60, 60);
        three.setLocation(200, 340);
        three.setBackground(Color.gray);
        sum.setSize(60, 60);
        sum.setLocation(280, 340);
        sum.setBackground(Color.orange);

        zero.setSize(60, 60);
        zero.setLocation(120, 420);
        zero.setBackground(Color.gray);
        sign.setSize(60, 60);
        sign.setLocation(40, 420);
        sign.setBackground(Color.lightGray);
        point.setSize(60, 60);
        point.setLocation(200, 420);
        point.setBackground(Color.gray);
        equality.setSize(60, 60);
        equality.setLocation(280, 420);
        equality.setBackground(Color.orange);

        add(seven);
        add(eight);
        add(nine);
        add(four);
        add(five);
        add(six);
        add(one);
        add(two);
        add(three);
        add(zero);
        add(erase);
        add(sign);
        add(div);
        add(mul);
        add(sub);
        add(sum);
        add(point);
        add(equality);
        add(memory);
        add(mread);
        add(text);

        zero.addActionListener(new NumberActionListener());
        one.addActionListener(new NumberActionListener());
        two.addActionListener(new NumberActionListener());
        three.addActionListener(new NumberActionListener());
        four.addActionListener(new NumberActionListener());
        five.addActionListener(new NumberActionListener());
        six.addActionListener(new NumberActionListener());
        seven.addActionListener(new NumberActionListener());
        eight.addActionListener(new NumberActionListener());
        nine.addActionListener(new NumberActionListener());
        point.addActionListener(new NumberActionListener());
        erase.addActionListener(new EraseActionListener());
        sign.addActionListener(new SignActionListener());
        sum.addActionListener(new SumActionListener());
        sub.addActionListener(new SubActionListener());
        mul.addActionListener(new MulActionListener());
        div.addActionListener(new DivActionListener());
        equality.addActionListener(new EqualityActionListener());
        memory.addActionListener(new MemoryActionListener());
        mread.addActionListener(new MreadActionListener());
    }

    public class NumberActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String number;
            number = text.getText() + e.getActionCommand();
            text.setText(number);
        }
    }

    public class EraseActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText("");
        }
    }

    public class MemoryActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            mem = text.getText();
            text.setText("");
        }
    }

    public class MreadActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            text.setText(mem);
        }
    }

    public class SignActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String number;
            number = text.getText();
            if(number.charAt(0) != '-')
                number = "-" + text.getText();
            else
                number = number.substring(1, number.length());
            text.setText(number);
        }
    }

    public class SumActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(text.getText());
            text.setText("");
            flagSum = true;
        }
    }

    public class SubActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(text.getText());
            text.setText("");
            flagSub = true;
        }
    }

    public class MulActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(text.getText());
            text.setText("");
            flagMul = true;
        }
    }

    public class DivActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            a = Double.parseDouble(text.getText());
            text.setText("");
            flagDiv = true;
        }
    }

    public class EqualityActionListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            double result = 0;
            b = Double.parseDouble(text.getText());
            if (flagSum){
                result = a + b;
                flagSum = false;
            }
            if (flagSub){
                result = a - b;
                flagSub = false;
            }
            if (flagMul){
                result = a * b;
                flagMul = false;
            }
            if (flagDiv){
                result = a / b;
                flagDiv = false;
            }
            String number;
            number = Double.toString(result);
            text.setText(number);
        }
    }
}
