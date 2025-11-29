package wsb.po.piec.pokaz;

public class PodKlasa extends NadKlasa {

    String nowepole = "";

    public PodKlasa() {
        System.out.println("konstruktor 0 podklasy");
    }

    public PodKlasa(int wartosc, String nazwa, String nowepole) {
        super(wartosc, nazwa);
        this.nazwa = nazwa;
        System.out.println("konstruktor 2 podklasy");

    }

    public void metoda(String str) {
        super.metoda(str);
        System.out.println("metoda podklasy");
    }
}
