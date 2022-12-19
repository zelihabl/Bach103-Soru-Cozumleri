package IfStatement03;

public class If10 {
    public static void main(String[] args) {

         /*
    10) Verilen BMI değerleri için Vücut Kitle İndeksi (BMI) ile ilgili mesajları yazdırmak için kod
       yazınız.
       Geçersiz BMI değeri < 0
       Zayıf = <18.5
       Normal ağırlık = 18.5–24.9
       Fazla kilolu = 25–29.9
       Obezite = 30 veya daha büyük BMI
     */

        double bmı= 19;
        if(bmı<0){
            System.out.println("gecersiz");
        } else if(bmı<=18.5) {
            System.out.println("zayıf");
        }else if(bmı>=18.5 && bmı<24.9){
            System.out.println("normal");
        } else if(bmı<29.9 && bmı>=25){
            System.out.println("fazla kilolu");
        }else if(bmı>=30){
            System.out.println("obezite");
        }

    }
}
