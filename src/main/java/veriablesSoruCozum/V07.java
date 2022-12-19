package veriablesSoruCozum;

import java.util.Scanner;

public class V07 {
    public static void main(String[] args) {

            //İki tamsayıyı değiştirmek için bir kod yazınız.

            //1.YOL (Geçici bir değişken oluşturarak)
            int a = 10;
            int b = 5;
            int c;

            c = a; // 10
            a = b; // 5
            b = c; // 10

            System.out.println(a);
            System.out.println(b);


            //2.YOL (Geçici bir değişken oluşturmadan)
            int x = 10;
            int y = 30;

            x = x+y; //40
            y = x-y; //10
            x = x-y; //30

            System.out.println(x);
            System.out.println(y);

            Scanner in = new Scanner(System.in);
            System.out.println("sss");
            char input=in.nextLine().charAt(8);
            System.out.println(input);


        }
    }
