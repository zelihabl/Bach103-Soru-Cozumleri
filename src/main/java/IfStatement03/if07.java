package IfStatement03;

public class if07 {
    public static void main(String[] args) {



    /*
   7) Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
a) Kodunuz "ali Can", "Ali can", "ali can" için "Baş harflerinde hata" yazmalıdır.
b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
yazmalıdır.
e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
yazmalıdır.


    */
        String isim = "Ali Can?";
        String adinIlkHarfi = isim.substring(0, 1);
        String soyAd = isim.substring(0, 1);

        if ((!(isim.substring(0, 1) == "A-Z")) && (!(isim.split(" ")[1].substring(0, 1) == "A-Z"))) {
            System.out.println("Baş harflerinde hata");

            boolean adınİlkHarfB = (adinIlkHarfi.charAt(0) >= 'A' && adinIlkHarfi.charAt(0) <= 'Z');
            boolean soyAdİlkB = (soyAd.charAt(0) >= 'A' && soyAd.charAt(0) <= 'Z');
            if (!adınİlkHarfB || !soyAdİlkB) {
                System.out.println("Bas harflerinden hata");
            }
            if (isim.equals(isim.toUpperCase())) {
                System.out.println("farmat hatası");
            }
            if (isim.replaceAll("\\s", "").length() == 0) {
                System.out.println("isim girilmedi");
            }
            if (isim.replaceAll("\\s", "").replaceAll("\\w", "").length() > 0) {
                System.out.println("Gecersiz ad");
            }
        }
    }
}

