import java.util.ArrayList;//нужно для работы с классом ArrayList

public class Champions {
    private ArrayList<Sorevnov> masSor = new ArrayList<Sorevnov>();//массив с соревнованиями

    public void addSor(Sorevnov m){//метод для добавления мебели в комнату
        masSor.add(m);              //добавляет элемент m
    }

    public void removeSor(Sorevnov m){//метод для удаления мебели из комнаты
        masSor.remove(m);              //удаляет элемент m
    }

    public Champions(){ // конструктор
    }

    public Boolean findSor(Sorevnov m){ //для выяснения – есть ли мебель m в комнате
        return masSor.contains(m);
    }

    public Champions(ArrayList< Sorevnov> n){//конструктор для внесения существующего списка мебели в комнату
        masSor=n;
    }

    public void printChampions() { //для вывода на экран списка соревнований чемпионов
        System.out.println("В чемпионате: ");
        for (Sorevnov a:masSor){                 //цикл для массива masSor
            System.out.println("\t"+a.toString());//вывод для текущего эл-та masSor
            if (a instanceof KomandSorev) {
                System.out.println("    - командное соревнование ");
                System.out.println();
            }
            if (a instanceof PersonalSorev) {
                System.out.println("    - личное соревнование ");
                System.out.println();
            }
        }
    }
}
