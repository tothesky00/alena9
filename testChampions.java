public class testChampions {
    public static void main(String[] args) {
        Champions myChampions = new Champions(); //создаем нового чемпиона

        KomandSorev myKomand1 = new KomandSorev("Ivanov", 200, 214 , 100 , "Первая команда",2,false); //создаем команду

        myChampions.addSor(myKomand1); // добавляем команду в чемпионы

        myChampions.addSor(new KomandSorev("Popov", 100,228 , 100, "Вторая команда", 4, false));//добавляем еще команду

        PersonalSorev myPersonalSorev = new PersonalSorev("Stepanov",1000,206,200,"Третья команда",4,true);//создаем личное соревнование

        myChampions.addSor(myPersonalSorev); //добавляем его в чемпионы

        myChampions.printChampions(); //выводи на экран чемпионов
        if (myChampions.findSor(myKomand1)) { //ищем соревнования
            System.out.println("Да");
        }
        else {
            System.out.println("Нет");
        }

        System.out.println();
        System.out.println("Чемпионы после удаления первой команды");
        myChampions.removeSor(myKomand1);
        myChampions.printChampions();
    }
}
