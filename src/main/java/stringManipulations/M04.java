package stringManipulations;

public class M04 {
       /*
    Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını konsolda yazdırınız.
    Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir
    */

    public static void main(String[] args) {
        String x = "1a3Bcf4!...";
        System.out.println(x.replaceAll("[0-9]", "").length());


        //Sevda
        String sifre="1a3Bcf4!...";
        int t=sifre.replaceAll(("\\d"),"").length();
        System.out.println(t);// 8






    }

}
