package IfStatement03;

public class if02 {
    public static void main(String[] args) {

        //2) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        //a) Şifre boşluk karakterinden farklı en az 8 karakter içeriyorsa "Geçerli Şifre"
        //b) Herhangi bir pozisyonda şifrede boşluk karakteri varsa "Şifrede boşluk karakteri kullamayınız"
        //c) a ve b koşullarının sağlanmaması durumunda "Geçersiz Şifre"


         //1.yol
        String pwd ="klm123459";
        if(pwd.replaceAll("\\S","").length()>0){
            System.out.println("Şifrede boşluk karakteri kullamayınız");
        }else if(pwd.replaceAll("\\s","").length()>=8){
            System.out.println("Gecerli sifre");
        }else{
            System.out.println("Gecersiz sifre");
        }
        //2.yol
        String sifre = "a1b2c3d4";
        if(sifre.contains(" ")){
            System.out.println("Şifrede boşluk karakteri kullanmayınız");
        }else if (sifre.length()>7 && !sifre.contains(" ")){
            System.out.println("Geçerli Şifre");
        }else {
            System.out.println("Geçersiz Şifre");
        }




    }
}


