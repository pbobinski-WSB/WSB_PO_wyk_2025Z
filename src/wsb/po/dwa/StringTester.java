package wsb.po.dwa;

public class StringTester {

    public static void main(String[] args) {

        String str1 = "Przykładowy napis";

  //      String str2 = "Przykładowy napis";
        String str2 = new String("Przykładowy napis");

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

        String strBig = str1.toUpperCase();
        System.out.println(str1);
        System.out.println(strBig);




    }
}
