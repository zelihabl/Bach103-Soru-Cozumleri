package StringManipulations;

public class C01 {

    public static void main(String[] args) {

       /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir

        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda
        yazdırınız.
        Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaM Miamivb

        */

        String sehir = "mIAMI";
        String sehir2 = sehir.toLowerCase();
        sehir2 = sehir2.substring(0, 1).toUpperCase() + sehir2.substring(1);
        System.out.println(sehir2);

        //Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.
        //Örnek: İsimler, , Mark Tom ise konsold2görmelisiniz

        String name = " Ali Can";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";
        int toplam = name.replaceAll("\\s", "").length() + name2.replaceAll("\\s", "").length() + name3.replaceAll("\\s", "").length();
        System.out.println(toplam);
        /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını
        konsolda yazdırınız.
       Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */

        String isim = " Miami 33018!!!";
        int toplam2 = isim.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").length();
        System.out.println(toplam2);

        /*
        Bir String değişkeni oluşturunuz, String'deki rakam olmayan karakterlerin sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanıgerekir
         */
        String p = "1a3Bcf4!";
        int toplam3 = p.replaceAll(("[0-9]"), "").length();
        System.out.println(toplam3);


        /*Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan son
       karakteri yazdırınız.
      Örnek:'Ali Can' için n yazdırmalısınız.
       ‘Miami’ için i yazdırmalısınız.

        Scanner input = new Scanner(System.in);
        System.out.println("isminizi giriniz");
         String son= input.nextLine();
         int bosluksuz=son.trim().length()-1;
        System.out.println(bosluksuz);
         String eski= son.substring(bosluksuz);
        System.out.println(eski);



         */


       // String = "Ali Veli";

       // String bosluk = v.trim();
        //System.out.println(bosluk);



/*
        int boslukOlmayanSonKrkIndex= g.trim().length()-1;
        String boslukOlmayanSonKrk = x.substring(boslukOlmayanSonKrkIndex,
        boslukOlmayanSonKrk Index +1);

 */


        //System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);


        String s = "Miami ";
        int boslukOlmayanSonKrkIndex= s.trim().length()-1;
        String boslukOlmayanSonKrk = s.substring(boslukOlmayanSonKrkIndex,
                boslukOlmayanSonKrkIndex +1);
        System.out.println("Bosluk olmayan son karakter: " + boslukOlmayanSonKrk);



    }
}

