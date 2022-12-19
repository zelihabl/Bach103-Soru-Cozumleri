package ternaryStatement;

public class T08 {
    public static void main(String[] args) {

         /*
        8) Sayı 3 basamaklı ise konsolda kodunuz "Bu sayı 3 basamaklıdır" olacaktır. Aksi takdirde,
          kodunuz " Bu sayı 3 basamaklı değildir" olacaktır.
         */

        int b =-12;
        String basamak = b>99 && b<1000 || b>-1000 && b<-99  ? "3 basamaklı":"3 basamaklı değil";
        System.out.println(basamak);
    }
}
