package loop02;

import java.util.Scanner;

public class L23 {
    public static void main(String[] args) {
        /*
        23) Asal sayı olup olmadığını kontrol etmek için kullanıcıdan bir tam sayı girmesini isteyiniz.
       Örnek: kullanıcı 43 girerse çıktı “43 bir asal sayıdır”, kullanıcı 120 girerse “120 asal değildir”
        olur, kullanıcı negatif tam sayılar girerse çıktı “Pozitif bir tam sayı giriniz” şeklinde kullanıcıyı
        yönlendiriniz
        (sadece kendisine ve 1'e bölünebilen
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Asal olup olmadigini kontrol etmek icin pozitif bir tamsayi giriniz: ");
        int number = scan.nextInt();
    }
}
