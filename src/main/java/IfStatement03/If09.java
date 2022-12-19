package IfStatement03;

public class If09 {
    public static void main(String[] args) {

        /*
    9) Herhangi bir 2 sayıyla toplama, çıkarma, çarpma ve bölme yapan basit bir hesap makinesi
oluşturmak için kod yazınız.
a) Kullanıcı 10.2 ve 5 ve + işaretini girdiğinde kodunuz konsolda "Sonuç 15.2" yazmalıdır.
b) Kullanıcı 10 ve 5 ve - işaretini girdiğinde kodunuz konsolda "Sonuç 5.0" yazmalıdır.
c) Kullanıcı 10 ve 5.3 ve * işaretini girdiğinde kodunuz konsolda "Sonuç 53.0" yazmalıdır.
d) Kullanıcı 10 ve -5 ve / işaretini girdiğinde kodunuz konsolda "Sonuç -2.0" yazmalıdır.
     */

        double sayı1=10.2;
        double sayı2=5;
        String işlem="*";
        if(işlem.equals("+")) {
            System.out.println(sayı1 + sayı2);
        }else if(işlem.equals("-")){
            System.out.println(sayı1-sayı2);
        }else if(işlem.equals("*")){
            System.out.println(sayı1*sayı2);
        }else if(işlem.equals("/")){
            System.out.println(sayı1/sayı2);
        }

    }
}
