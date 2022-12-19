package IfStatement03;

public class if06 {

    public static void main(String[] args) {


    /*
    6) Mili km'ye, saniyeyi saate, fahrenhaytı santigrata çeviren bir dönüştürücü oluşturmak için
kod yazınız. Google'dan dönüşümler için formülleri bulunuz.
a) Kullanıcı mile değerini 10 ve operatorü mildenKmye olarak girdiğinde, k
onsolda kodunuz "16 km" yazmalıdır (sayı dinamik olacak)
b) Kullanıcı saniye değerini 7200 ve operatorü saniyedenSaate olarak girdiğinde, konsolda
kodunuz "2" yazmalıdır (sayı dinamik olacak)
c) Kullanıcı fahrenheit değerini 83 ve operatorü fahrenaytdanSantigarata olarak
girdiğinde, konsolda kodunuz "28.3333 santigrat" yazmalıdır (sayı dinamik olacak)
     */
        double mil = 10;
        double saniye = 7200;
        double fahrenayt= 83;
        String operator = " fahrenaytdanSantigarata ";

        if(operator.equals("mildenKmye")){
            System.out.println(mil*1.60934);
        }else if(operator.equals("saniyedenSaate")){
            System.out.println((saniye/60)/60);

            }else if(operator.equals("fahrenaytdanSantigarata")){
                System.out.println((fahrenayt -32)*5/9);

                }
            }
        }























