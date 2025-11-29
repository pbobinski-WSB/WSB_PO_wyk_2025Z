package wsb.po.piec.pokaz;

public class Test {

    public static void main(String[] args) {

        NadKlasa  nadKlasa = new NadKlasa(12, "cokolwiek");

        PodKlasa podKlasa1 = new PodKlasa(1, "nazwa1", "pole1");

        PodKlasa podKlasa2 = new PodKlasa(2, "nazwa2", "pole2");


        NadKlasa testowa = podKlasa1;

        podKlasa1.metoda("1");

        podKlasa2.metoda("2");

        testowa.metoda("3");

        nadKlasa.metoda("4");

    }

}
