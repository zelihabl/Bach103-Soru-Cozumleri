package swich;

import java.util.Scanner;

public class S03 {
    public static void main(String[] args) {
        /*
        3) Verilen ay numaralarından başlayarak tüm ay adlarını yazdıran bir kod yazınız.
           Örnek: Ay numarası 9 ise konsolda kodunuz Eylül Ekim Kasım Aralık olacaktır.
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir ay numarasi giriniz");
        int ay = input.nextInt();

        switch (ay) {
            case 1:
                System.out.println("Ocak");
            case 2:
                System.out.println("Şubat");
             case 3:
             System.out.println("Mart");
            case 4:
                System.out.println("Nisan");
            case 5:
                System.out.println("Mayıs");
            case 6:
                System.out.println("Haziran");
            case 7:
                System.out.println("Temmuz");
            case 8:
                System.out.println("Ağustos");
            case 9:
                System.out.println("Eylül");
            case 10:
                System.out.println("Ekim");
            case 11:
                System.out.println("Kasım");
            case 12:
                System.out.println("Aralık");
          }
        }



    }


