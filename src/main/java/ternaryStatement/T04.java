package ternaryStatement;

public class T04 {
    public static void main(String[] args) {

         /*
        4) Nested Ternary kullanarak Apex kodunu yazınız.
           Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
           Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
           Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */

        int yıl=1998;
        String artıkYıl= yıl%100==0 ? yıl%400==0 ? "Artıl yıl":"Artık yıl değil"
                : yıl%4==0 ? "Artık yıl":"Artık yıl değil";
        System.out.println(artıkYıl);
    }
}
