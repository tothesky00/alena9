public class Sorevnov {
    private String vidSorevnov;  //создаем закрытый член нашего класса с вид соревнования
    private int run;       // закрытый член класса, содержащий дистанцию бег
    private int jumping;       // закрытый член класса, содержащий дистанцию прыжка
    private int swimming;       // закрытый член класса, содержащий высоту заплыва

    public void setVidSorevnov(String name){ //открытая функция (метод класса) для задания
        vidSorevnov = name;                    //значения вида соревнования
    }

    public void setRun(int w){ //открытая функция (метод класса) для задания
        run = w;               //значения дистанции бега
    }

    public void setJumping(int l){ //открытая функция (метод класса) для задания
        jumping = l;                //значения дистанции прыжка
    }

    public void setSwimming(int h){ //открытая функция (метод класса) для задания
        swimming = h;                //значения дистанции заплыва
    }

    public String getVidSorevnov(){ //открытая функция (метод класса) для вывода значения
        return vidSorevnov;         //наименования соревнования
    }

    public int getRun(){ //открытая функция (метод класса) для вывода значения
        return run;      //дистанция бега
    }

    public int getJumping(){ //открытая функция (метод класса) для вывода значения
        return jumping;      //дистанция прыжка
    }

    public int getSwimming(){ //открытая функция (метод класса) для вывода значения
        return swimming;      //дистанция заплыва
    }
    public Sorevnov(){ // конструктор класса (без параметров)
        vidSorevnov = "Без названия";
        run = 0;
        jumping = 0;
        swimming = 0;

    }

    public Sorevnov(String name, int w, int l, int h ){ //конструктор класса (с параметрами)
        vidSorevnov = name;
        run = w;
        jumping = l;
        swimming = h;
    }
}
