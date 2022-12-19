package stringManipulations;

public class M03 {
      /*
        Bir String değişkeni oluşturunuz, String'deki toplam alfabetik ve sayısal karakter sayısını konsolda yazdırınız.
        Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
    */

    public static void main(String[] args) {
        String a = " Miami 33018!!! ";
        String harfler = a.replaceAll("[^0-9A-Za-z]", "");
        System.out.println(harfler.length());

        //Esra
        String x = " Miami 33018!!! ";

        String harf= x.replaceAll("[^0-9a-zA-Z]","");
        System.out.println(harf.length());


        //Zeliha
        String isim = " Miami    33018!!!";
        int toplam2 = isim.replaceAll("\\s", "").replaceAll("\\p{Punct}", "").length();
        System.out.println(toplam2);

        //Mustafa
        String deger = " We are the     Champions ! ";

        int deger1=deger.trim().replaceAll("\\p{Punct}","").replaceAll("\\s","").length();
        System.out.println(deger1);

        //

    }
}

