package org.example;

public class Human {
    protected String FIO;
    String gender;
    int age;

    public Human(){
        FIO = "";
        gender = "";
        age = 0;
    }
    public Human(String _FIO, String _gender, int _age){
        FIO = _FIO;
        gender = _gender;
        age = _age;
    }

    public String getFIO(){
        return FIO;
    }
    public String getGender(){
        return gender;
    }
    public int getAge(){
        return age;
    }

    public void Name() {
       String name = "";
        for (int i = 0; i < FIO.length(); i++){
            name = name + FIO.charAt(i);
            if (FIO.charAt(i) == ' ')
                break;
        }
        System.out.println("Имя человека: "+ name);
    }
}
