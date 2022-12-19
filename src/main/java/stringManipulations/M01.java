package stringManipulations;

public class M01 {
      /*
        Sadece tek bir kelimeden oluşan şehir isimleri için bir String değişkeni oluşturun. Şehir
        ismini, baş harfi büyük ve diğer tüm karakterleri küçük harfler olacak şekilde konsolda yazdırınız.
        Örnek: mIAMI - Miami
        miami - Miami
        MIAMI - Miami
        mIaMi - Miami vb.
    */

    public static void main(String[] args) {
        String sehirIsmi = "aNkaRA";
        String yeniSehirIsmi = sehirIsmi.toLowerCase(); //ankara
        System.out.println(yeniSehirIsmi);

        yeniSehirIsmi = yeniSehirIsmi.substring(0,1).toUpperCase()+yeniSehirIsmi.substring(1);
        System.out.println(yeniSehirIsmi);

        //2.YOL
        String sehir = "amasya";
        System.out.println(sehir.substring(0,1).toUpperCase()+sehir.substring(1).toLowerCase());

        //3.YOL
        String city ="ankara";
        String yeniCity= city.toUpperCase().trim();
        System.out.println(yeniCity.charAt(0)+yeniCity.substring(1).toLowerCase());



    }
}
