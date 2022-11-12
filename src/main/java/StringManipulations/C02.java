package StringManipulations;

import java.util.Scanner;

public class C02 {
    public static void main(String[] args) {

        //8) Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda
        //büyük harfle yazdırınız.
        //Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız

        String x="Java";
        Integer sonindex = x.length()-1;
        String y =x.substring(0,sonindex).toUpperCase();
        System.out.println(y);

        //Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm
        //karakterleri büyük harflerle yazdırınız.
        //Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.


        String a ="Java";
        Integer son =a.length()-1;
        String sonuc = a.substring(1,son).toUpperCase();
        System.out.println(sonuc);


        //10) Bir String in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup
        //olmadığını kontrol etmek için kod yazınız.
        //Örnek:‘Ali Can’ için konsolda false yazmalıdır.
        // ‘ Ali Can ’ için konsolda false yazmalıdır.
        // ‘ Ali Can ’ için konsolda false yazmalıdır.
        // ‘Ali Can’ için konsolda true yazmalıdır.

        String isim = "   Ali Can"   ;
        String sil =isim.trim();
        String y1= isim.replaceAll("\\s","");
        Boolean sonuc3 = sil.length()-y1.length()==1;
        System.out.println(sonuc3);


        //13)Aşağıdaki koşullar için bir parolanın geçerli olup olmadığını kontrol etmek için kod yazınız;
        //Şifre boşluk karakterinden farklı olacak şekilde en az 8 karakter içermelidir. Şifrede en az 1
        //sembol olmalıdır.
        //Örnek:'A2b!' için kodunuz konsolda false yazdırmalıdır.
        // 'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
        // '!1a23b4' için kodunuz konsolda false yazdırmalıdır.
        // '!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
        // '! a b 3 k' kodunuz konsolda false yazdırmalıdır


        String pwd ="A2b!";
        Boolean bosluksuz=pwd.replaceAll("\\s","").length()>=8;
        Boolean karakter= pwd.replaceAll("[A-Za-z0-9]","").length()>0;
        System.out.println(karakter&&bosluksuz);




        //15) String gomlekFiyat = ‘$12.99’;
        //String kitapFiyat = ‘$35.99’;
        //Gömlek ve kitap fiyatlarının toplamını bulmak için gereken kodu yazınız

        String gömlek ="$12.99";
        String g = gömlek.replaceAll("[$]","");
        String kitap ="$35.99";
        String k =kitap.replaceAll("[$]","");
        double j = Double.valueOf(g);
        double b = Double.valueOf(k);
        System.out.println(j+b);

        //Verilen bir ismin adının ve soyadının baş harflerini almak için kodu yazınız.
        //Not: İkinci isim kapsam dışındadır.
        //Örnek: Tom Hanks ==> TH, Mary Star ==> MS

        Scanner input =new Scanner(System.in);

   /*
        System.out.println("İlk iisminizi giriniz");
        char ilkHarf=input.next().charAt(0);
        System.out.println(ilkHarf);
        System.out.println("Soy isimizi giriniz");
        char soyisim =input.next().charAt(0);
        System.out.println("ilk ve son harf:"+ilkHarf+soyisim);
        */



        //2.yol

        System.out.println("Lütfen tam isminizi giriniz");
        String tamIsım=input.nextLine();
        char ilk =tamIsım.charAt(0);
        char sonharf = tamIsım.split(" ")[1].charAt(0);
        System.out.println(""+ilk+sonharf);



        //Bir String’ de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
        String s = "Vay be! Ali 13 yaşında ama üniversite öğrencisi.";
        int karakter1 = s.length();
        int n= s.replaceAll("\\p{Punct}","").length();

        System.out.println(karakter1-n);








    }
}
