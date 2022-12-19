package stringManipulations;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class M15 {
    /*
       String gomlekFiyat = ‘$12.99’;
       String kitapFiyat = ‘$35.99’;
       Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız.
   */
    public static void main(String[] args) {
        NumberFormat numberFormat = new DecimalFormat(".##");
        String gomlekFiyat = "$1200.99";
        String kitapFiyat = "$3500.99";

        String gomlek = gomlekFiyat.replace("$", "");
        String kitap = kitapFiyat.replace("$", "");

        double x = Double.parseDouble(gomlek);
        double y = Double.parseDouble(kitap);

        double toplam = x+y;
        System.out.printf("%5.2f",toplam);
        System.out.println();
        System.out.println(String.format("%,1f", toplam));
        System.out.println();
        System.out.println(numberFormat.format(toplam));


        String s = gomlekFiyat.replaceAll("[$.]","");
        String b = kitapFiyat.replaceAll("[$.]","");
        double x1 = Double.valueOf(s);
        double y1 = Double.valueOf(b);
        System.out.println("Toplam Fiyat : " + (x1+y1)/100);

    }


}
