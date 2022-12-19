package swich;

public class EnumRunner_08 {

    public static void main(String[] args) {

        String tarayıcı = Tarayıcı_08.YANDEX.toString();

       switch (tarayıcı){
           case"CHROME":
               System.out.println("ben chrome kullanıyorum");
               break;
           case"SAFARİ":
               System.out.println("ben safari kullanıyorum");
               break;
           case"IE":
               System.out.println("ben IE kullanıyorum");
               break;
           case"FIREFOX":
               System.out.println("ben firefox kullanıyorum");
           case"YANDEX":
               System.out.println("ben yandex kullanıyorum");
               break;


       }



    }
}
