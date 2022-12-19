package veriablesSoruCozum;

public class V06 {
    public static void main(String[] args) {


        //3 öğe (kitap, defter ve laptop) fiyatı için long data tipinde değişkenler oluşturunuz.
        //Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.

            long kitap = 50;
            long defter = 35;
            long laptop = 22000;

            long toplam = (2*kitap) + (4*defter) + (3*laptop);
            System.out.println("Toplam: " + toplam);
        }
    }