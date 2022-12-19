package swich;

public class S04 {
    public static void main(String[] args) {

        /*
        4) Cinsiyet "Erkek" ise "Erkek" yazdırınız.
           Cinsiyet "Kadın" ise "Kız" yazdırınız.
           Cinsiyet "Erkek" ve "Kadın"dan farklıysa "Diğerleri" yazdırınız.
           Not : Bu seçenekler dışındakilerini yoksayınız.
         */

         String cinsiyet="erkek";

         switch (cinsiyet.toLowerCase()){
             case"erkek":
                 System.out.println("Erkek");
                 break;
             case"kadın":
                 System.out.println("kız");
                 break;
             default:
                 System.out.println("Diğerleri");
         }


    }
}
