package L1;

public class Teenager extends Human{
    private int school;
    double progress;

    public Teenager(){
        super();
        school = 0;
        progress = 0;
    }
    public Teenager(String _FIO, String _gender, int _age, int _school, double _progress){
        super(_FIO, _gender, _age);
        this.school = _school;
        this.progress = _progress;
    }

    public int getSchool(){
        return school;
    }
    public double getProgress(){
        return progress;
    }

    public void Name() {
        String name = "";
        for (int i = 0; i < FIO.length(); i++){
            name = name + FIO.charAt(i);
            if (FIO.charAt(i) == ' ')
                break;
        }
        System.out.println("Имя подростка: "+ name);
    }
}
