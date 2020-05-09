public class KomandSorev extends Sorevnov {
    private String nameKomand; //наименование команды
    private int numPoint; //кол-во очков
    private Boolean won; //выиграли или нет

    public KomandSorev() {//конструктор KomandSorev без параметров
        super();  // вызываем конструктор класса-родителя без параметров
        nameKomand = "noname"; // добавляем инициализацию новых членов // наименование команды noname
        numPoint = 2;      // кол-во команд 2
        won = false;  // выиграли false
    }

    public KomandSorev(String name, int w, int l, int h, String nameK, int n, Boolean f) {//конструктор KomandSorev с параметрами
        super(name, w, l, h);// вызываем конструктор класса-родителя с параметрами
        this.nameKomand =  nameK;  // добавляем инициализацию новых членов
        this.numPoint = n;
        this.won = f;
    }

    public void setNameKomand(String name) {
        this.nameKomand = name;
    }

    public String getNameKomand() {
        return nameKomand;
    }

    public void setNumPoint(int n) {
        numPoint = n;
    }

    public int getNumPoint() {
        return numPoint;
    }

    public void setWon(Boolean b) {
        this.won = b;
    }

    public Boolean isFullTime() {
        return won;
    }

    public String toString() {
        return getVidSorevnov() + " " + getRun() + " " + getJumping() + " " + nameKomand + " " + numPoint + " " + won;
    }
}