package org.example;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class User {
    public static void main(String[] args) {
        Reader med = new Reader("Калькулятор");
        med.setVisible(true);
        med.setResizable(false);
        med.setLocationRelativeTo(null);
    }
}

