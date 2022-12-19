package IfStatement03;

public class if05 {
    public static void main(String[] args) {
        /*
        5) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
        a) Bir üçgenin iki kenarının uzunluğu eşitse "İkizkenar Üçgen".
        b) Bir üçgenin tüm kenarlarının uzunluğu eşitse "Eşkenar Üçgen".
        c) a ve b koşulları sağlanmıyorsa "Çeşit Kenar Üçgen"
         */
        int a=12;
        int b=12;
        int c=12;
        if(a==b && b!=c|| a==c && c!=b || b==c && a!=b){
            System.out.println("İkizkenar Ücgen");
        }else if(a==b && a==c ){
            System.out.println("Eskenar");
        }else{
            System.out.println("ceşitkenar");
        }


    }
}
