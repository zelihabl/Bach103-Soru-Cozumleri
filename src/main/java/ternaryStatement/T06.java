package ternaryStatement;

public class T06 {
    public static void main(String[] args) {


          /*
        6) Bir sayının mutlak değerini hesaplamak için kodu yazınız.
           Pozitif sayılar ve sıfır mutlak değer için sayı ile aynıdır.
           Negatif sayıların mutlak değerini bulmak için sayıyı -1 ile çarpınız
         */

        int sayı =-4;
        int mutlak=sayı<0 ? -1*sayı :sayı;
        System.out.println(mutlak);

    }
}
