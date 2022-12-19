package stringManipulations;

public class M09 {
    /*
       Bir String değişkeni oluşturunuz ve konsolda ilk karakter ve son karakter dışındaki tüm karakterleri büyük harflerle yazdırınız.
       Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
   */
    public static void main(String[] args) {
        String x = "Java";
        String y = x.substring(1, x.length()-1).toUpperCase();
        System.out.println(y);
    }



}
