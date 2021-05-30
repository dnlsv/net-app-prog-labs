package Lab;

import java.awt.event.*;
import java.io.*;
import javax.swing.*;

public class User {
    public static void main(String[] args) {
        Reader med = new Reader("Регистрация в сети");
        med.setVisible(true);
        med.setResizable(false);
        med.setLocationRelativeTo(null);
    }
}

