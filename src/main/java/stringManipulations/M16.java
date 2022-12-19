package stringManipulations;

public class M16 {
    /*
     Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
     Not: İkinci isim kapsam dışındadır.
     Örnek: Tom Hanks ==> TH, Mary Star ==> MS
 */
    public static void main(String[] args) {
        String x = "Tom Hanks";
        char isim = x.charAt(0);
        char soyIsim = x.split(" ")[1].charAt(0);
        System.out.println("" + isim+soyIsim);

        x = x.substring(0,1)+x.split(" ")[1].charAt(0);
        System.out.println(x);
    }
}

