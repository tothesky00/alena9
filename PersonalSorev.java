import java.util.Scanner;
public class PersonalSorev extends Sorevnov{
    private String namePer;   //наименование участника
    private int numParticipants;      //кол-во участников
    private Boolean woon ; //выиграл или нет

    public PersonalSorev(){// конструктор Truck без параметров
        super();// вызываем конструктор класса-родителя без параметров
        namePer = "";   //наименование личного соревнования не указано
        numParticipants = 4;    //кол-во участников личного соревнования 4
        woon = false;//проигрыш
    }

    public PersonalSorev(String name, int w, int l, int h, String nameP, int n, Boolean f){// конструктор Truck с параметров
        super(name,w,l,h);// вызываем конструктор класса-родителя с параметрами
        namePer = name;
        numParticipants = n;
        woon = f;
    }

    public void setNamePer(String name){
        namePer = name;
    }
    public String getNamePer(){
        return namePer;
    }

    public void setNumParticipants(int n){
        numParticipants = n;
    }
    public int getNumParticipants(){
        return numParticipants;
    }

    public void setWoon(Boolean b){
        woon = b;
    }
    public Boolean isWoon(){
        return woon;
    }

    public void setAllInfo(){//ввод всей информации для PersonalSorev

        Scanner in = new Scanner(System.in);

        System.out.print("Введите вид соревнований: ");
        String nazv=in.next(); //метод next() позволяет вводить строки, но без пробелов
        setVidSorevnov(nazv);

        System.out.print("Введите дистанцию бега: ");
        int w=in.nextInt(); //Ввод дистанцию бега
        setRun(w);

        System.out.print("Введите дистанцию прыжка: ");
        int l = in.nextInt(); //Ввод дистанцию прыжка
        setJumping(l);

        System.out.print("Введите дистанцию заплыва: ");
        int h = in.nextInt(); //Ввод дистанцию заплыва
        setSwimming(h);

        System.out.print("Введите наименование участника:");
        namePer = in.next();

        System.out.print("Введите кол-во участников соревнования: ");
        numParticipants = in.nextInt();

        System.out.print("Введите выиграл или нет (true/false): ");
        woon = in.nextBoolean();

        System.out.println();//пустая строка
    }

    public String toString(){
        return "\n\t"+"Личные соревнования"+"\n\t"+"Вид соревнования: "+getVidSorevnov()+"\n\t"+"Бег: "
                +getRun()+ "\n\t"+"Прыжки: "+getJumping()+"\n\t"+"Плавание: "+getSwimming()+"\n\t"+"Наименование участников: "+namePer+"\n\t"+"Кол-во участников: "+numParticipants+"\n\t"+"Выиграл: "
                +woon+"\n";
    }
}
