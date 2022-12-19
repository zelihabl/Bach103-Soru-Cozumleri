package ternaryStatement;

public class T01 {
    public static void main(String[] args) {

        /*
        ternary
        condition    ?   condition doğruysa      :   condition doğrı değil ise uygulanacak kod
         */

        /*
        1) Ternary kullanarak, aşağıdaki kodları konsolda yazdırınız.
        Parola boşluk karakterinden farklı olarak en az 8 karakter içeriyorsa, "Geçerli Parola",
        Parola boşluk karakterinden farklı olarak 8 karakterden daha az ise, "Geçersiz Parola"
         */
        String sifre="abc2345";
        String gecerlimi=sifre.replaceAll("\\s","").length()>7 ? "Gecerli sifre": "Gecersiz sifre";
        System.out.println(gecerlimi);


















    }
}
