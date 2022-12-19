package ternaryStatement;

public class T09 {

    public static void main(String[] args) {

         /*
        9) Ternary kullanarak; konsolda tek sayılar için “Tek” , çift sayılar için “Çift” yazdırınız
         */

        int say= 13;
        String kontrol= say%2==0 ?"cif":"tek sayı";
        System.out.println(kontrol);

    }
}
