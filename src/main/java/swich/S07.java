package swich;

import java.util.Scanner;

public class S07 {
    public static void main(String[] args) {

         /*
 7) Switch ifadesini kullanarak, mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir
dönüştürücü oluşturmak için kod yazınız. Google'dan dönüşümler için formülleri bulunuz.

a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, konsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
d) Kullanıcı mildenKmye, saniyedenSaate, fahrenaytdanSantigarata ‘dan farklı bir işlem girdiğinde, kodunuz "Bu operatör, o dönüştürücü için tanımlanmadı" yazmalıdır
         */

        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen milden km'ye için 1, \n saniyeden saate için 2, \n fahrenhayttan santigrata için 3, \n dönüşümlerinden birini seçiniz");
        int secenek=input.nextInt();
        //(mil*1.60934)
        //saniye/60)/60
        //(fahrenayt-32)*5/9)
        System.out.println("Dönüştürülecek değeri giriniz:");
        double dns=input.nextDouble();
        switch (secenek){
            case 1:
                System.out.println((dns * 1.6)+"km'dir");
                break;
            case 2:
                System.out.println(((dns /60)/60)+"saat'tir");
                break;
            case 3:
                System.out.println((dns -32)*5/9+"santigrat'tir");
                break;
            default:
                System.out.println("Bu operatör, o dönüştürücü için tanımlanmadı");
            }



    }
}
