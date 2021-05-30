package L1;

public class Kid extends Human{
    private int kindergarten;

    public Kid(){
        super();
        this.kindergarten = 0;
    }
    public Kid(String _FIO, String _gender, int _age, int _kindergarten){
        super(_FIO, _gender, _age);
        this.kindergarten = _kindergarten;
    }

    public int getKindergarten(){
        return kindergarten;
    }

    public void Name() {
        String name = "";
        for (int i = 0; i < FIO.length(); i++){
            name = name + FIO.charAt(i);
            if (FIO.charAt(i) == ' ')
                break;
        }
        System.out.println("Имя ребенка: "+ name);
    }
}
