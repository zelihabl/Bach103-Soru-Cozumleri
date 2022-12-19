package stringManipulations;

public class M13 {
     /*
        Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir.
        Şifrede en az 1 sembol olmalıdır.
            Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
            'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
            '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
            '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
            '! a b 3 k' kodunuz konsolda false yazdırmalıdır.
            String sifre = "!1a23b4?es";
    */

    public static void main(String[] args) {
        String sifre = "! a b 3 k";
        String bosluksuzSifre = sifre.replaceAll("\\s", "");

        boolean x = sifre.length()>7;
        boolean y = sifre.replaceAll("[0-9a-zA-Z ]", "").length() > 0;
        boolean z = sifre.replaceAll("\\s", "").length() > 7;
        boolean hepsi = x && y && z;
        System.out.println(bosluksuzSifre);
        System.out.println("Uzunluk: " + x);
        System.out.println("Sembol: " + y);
        System.out.println("Boşluk: " + z);
        System.out.println("Hepsi: " + hepsi);

    }
}


