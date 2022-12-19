package ternaryStatement;

public class T02 {
    public static void main(String[] args) {


        /*
        2) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
           a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
           b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
           c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen
         */


        //1.yol
        int a=10,b=12,c=15;
        //String ücgensekli= a==b && a==c ? "Eskenar":a==b && b!=c|| a==c && c!=b || b==c && a!=b ? "İkizkenar":"ceşitkenar";
        // System.out.println(ücgensekli);

        //2.yol
        boolean ikizkenar = ((a==b) && (a!=c)) || ((b==c) && (c!=a)) || ((a==c)&&(a!=b));
        boolean eskenar = a==b && a==c;

        System.out.println(ikizkenar ? "ikizkenar" : (eskenar ? "Eşkenar" : "Ceşitkenar"));













    }
}
