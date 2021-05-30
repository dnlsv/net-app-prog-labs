package L;
import L1.*;

public class Main {
    public static void main(String[] args) {
        Kid k1 = new Kid("Петр Анатольевич Курильчик", "Мужской", 4, 10);
        System.out.println("\nФИО: "+k1.getFIO()+"\nПол: "+k1.getGender()+"\nВозраст: "+k1.getAge()+"\nНомер детского сада: "+k1.getKindergarten());
        k1.Name();

        Kid k2 = new Kid("Анна Викторовна Шукало", "Женский", 3, 7);
        System.out.println("\nФИО: "+k2.getFIO()+"\nПол: "+k2.getGender()+"\nВозраст: "+k2.getAge()+"\nНомер детского сада: "+k2.getKindergarten());
        k2.Name();

        Kid k3 = new Kid("Вадим Сергеевич Пискун", "Мужской", 5, 4);
        System.out.println("\nФИО: "+k3.getFIO()+"\nПол: "+k3.getGender()+"\nВозраст: "+k3.getAge()+"\nНомер детского сада: "+k3.getKindergarten());
        k3.Name();

        Teenager t1 = new Teenager("Кирилл Романович Рыдевский", "Мужской", 14, 1,7.3);
        System.out.println("\nФИО: "+t1.getFIO()+"\nПол: "+t1.getGender()+"\nВозраст: "+t1.getAge()+"\nНомер школы: "+t1.getSchool()+"\nУспеваемость: "+t1.getProgress());
        t1.Name();

        Teenager t2 = new Teenager("Антон Васильевич Миронов", "Мужской", 15, 1,6.2);
        System.out.println("\nФИО: "+t2.getFIO()+"\nПол: "+t2.getGender()+"\nВозраст: "+t2.getAge()+"\nНомер школы: "+t2.getSchool()+"\nУспеваемость: "+t2.getProgress());
        t2.Name();

        Teenager t3 = new Teenager("Ольга Валерьевна Кукушкина", "Женский", 15, 3,9.2);
        System.out.println("\nФИО: "+t3.getFIO()+"\nПол: "+t3.getGender()+"\nВозраст: "+t3.getAge()+"\nНомер школы: "+t3.getSchool()+"\nУспеваемость: "+t3.getProgress());
        t3.Name();

        Parent p1 = new Parent("Наталья Иосифовна Реброва", "Женский", 38, 2,"ОАО Елочки");
        System.out.println("\nФИО: "+p1.getFIO()+"\nПол: "+p1.getGender()+"\nВозраст: "+p1.getAge()+"\nКоличество детей: "+p1.getKids()+"\nМесто работы: "+p1.getWork());
        p1.Name();

        Parent p2 = new Parent("Дмитрий Олегович Купреянов", "Мужской", 41, 3,"ЗАО МетФетСетГетКалий");
        System.out.println("\nФИО: "+p2.getFIO()+"\nПол: "+p2.getGender()+"\nВозраст: "+p2.getAge()+"\nКоличество детей: "+p2.getKids()+"\nМесто работы: "+p2.getWork());
        p2.Name();

        Parent p3 = new Parent("Мария Ивановна Дмитрова", "Женский", 45, 2,"ООО РубСтройТехСбыт");
        System.out.println("\nФИО: "+p3.getFIO()+"\nПол: "+p3.getGender()+"\nВозраст: "+p3.getAge()+"\nКоличество детей: "+p3.getKids()+"\nМесто работы: "+p3.getWork());
        p3.Name();
    }

}

