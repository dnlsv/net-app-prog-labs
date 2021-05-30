package L1;

public class Teenager implements Object,Human{
    private int school;
    double progress;

    public Teenager(int _school, double _progress){
        this.school = _school;
        this.progress = _progress;
    }

    public int getSchool(){
        return school;
    }
    public double getProgress(){
        return progress;
    }

    public String Name() {
        String name = "";
        //for (int i = 0; i < FIO.length(); i++){
        //    name = name + FIO.charAt(i);
        //    if (FIO.charAt(i) == ' ')
        //        break;
        //}
        name = "Подросток";
        return name;
    }

    public void printInfo() {
        System.out.println("\nНомер школы: " + getSchool() + "\nУспеваемость: " + getProgress() +"\nИмя подростка: " + Name());
    }
}
