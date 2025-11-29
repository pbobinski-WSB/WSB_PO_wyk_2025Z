package wsb.po.piec.pokaz;

import java.util.Objects;

public class NadKlasa {

    int wartosc = 0;

    String nazwa = "";

    public NadKlasa () {
        System.out.println("konstruktor 0 nadklasy");
    }

    public NadKlasa(int wartosc, String nazwa) {
        this.wartosc = wartosc;
        this.nazwa = nazwa;
        System.out.println("konstruktor 2 nadklasy");
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void metoda(String str) {
        System.out.println(str);
        System.out.println("metoda nadlkasy");
    }

    @Override
    public String toString() {
        return "NadKlasa{" +
                "wartosc=" + wartosc +
                ", nazwa='" + nazwa + '\'' +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof NadKlasa nadKlasa)) return false;

        return getWartosc() == nadKlasa.getWartosc() && Objects.equals(getNazwa(), nadKlasa.getNazwa());
    }

    @Override
    public int hashCode() {
        int result = getWartosc();
        result = 31 * result + Objects.hashCode(getNazwa());
        return result;
    }
}
