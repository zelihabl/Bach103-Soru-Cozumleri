package ternaryStatement;

public class T03 {
    public static void main(String[] args) {

        /*
        3) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
        b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”

       Örneğin; 127 yukarı yuvarlanacak ve değer 130 olacaktır.
       125 yukarı yuvarlanacak ve değer 130 olacaktır.
       123 aşağı yuvarlanacak ve değer 120 olacaktır
         */

        int sayı2= 133;
        String yuvarla= sayı2%10>=5 ? ("son basamağı yuvarla:"+(sayı2/10+1)*10):
                ("Son basamağı bir alt ondalığa yuvarla:" + (sayı2/10)*10);
        System.out.println(yuvarla);

        //2.yol

        int sayi =127;
        double sayi2=sayi/10;

        System.out.println(sayi % 10 >= 5 ? Math.ceil(sayi2) * 10 : Math.floor(sayi2) * 10);

        /*
            Math.ceil() --> Sayiyi kendinen büyük en küçük onluk sayıya yuvarlar.Ondalıklı sayı ile çalışır
            Math.floor() --> Sayiyi kendinen küçük en büyük onluk sayıya yuvarlar.Ondalıklı sayı ile çalışır
        */


    }
}
