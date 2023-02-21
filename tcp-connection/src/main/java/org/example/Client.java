package org.example;

import java.io.*;
import java.net.*;

public class Client {
    public static void main(String[] arg){
        try {
            System.out.println("Подключение к серверу...");
            Socket cSocket = new Socket("127.0.01", 2524);
            System.out.println("Соединение установлено...");
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            ObjectOutputStream cOutput = new ObjectOutputStream(cSocket.getOutputStream());
            ObjectInputStream cInput = new ObjectInputStream(cSocket.getInputStream());
            System.out.println("Введите строку для отправки на сервер");
            String str = stdin.readLine();
            System.out.println("Ваша строка: " + str);
            cOutput.writeObject(str);
            System.out.println(cInput.readObject());
            cInput.close();
            cOutput.close();
            cSocket.close();
        } catch(Exception e){
            e.printStackTrace();
        }
    }
}