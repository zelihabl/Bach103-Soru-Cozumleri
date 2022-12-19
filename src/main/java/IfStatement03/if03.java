package IfStatement03;

public class if03 {
    public static void main(String[] args) {
        /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
         */
         /*
        Ayın numarasını girdiğinizde ayın adını yazdırmak için gereken kodu yazınız.
        Örnek; 1 için çıktı: "Ocak", 2 için çıktı: "Şubat" vb
    */
            int x = 4;
            if (x==1){
                System.out.println("Ocak");
            }else if (x==2){
                System.out.println("Şubat");
            }else if (x==3){
                System.out.println("Mart");
            }else {
                System.out.println("Geçersiz karakter");
            }
        }
    }