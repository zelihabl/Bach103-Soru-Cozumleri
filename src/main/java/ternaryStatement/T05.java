package ternaryStatement;

public class T05 {
    public static void main(String[] args) {


        /*
        5) Nested Ternary kullanarak;
           Şifreyi kontrol etmek için kodu yazınız.
           8'den fazla karakter içeriyorsa, baş harfi 'i' olmalıdır.
           8 karakterden fazla içermiyorsa, baş harfi 'K' olmalıdır.
         */

        String pwd = "iabcd1234";
        String w= pwd.length()>8 ? pwd.startsWith("i") ? "gecerli şifre": "gecersiz sifre":
                pwd.startsWith("K") ?"gecerli sefre" : "gecersiz sifre";
        System.out.println(w);

    }
}
