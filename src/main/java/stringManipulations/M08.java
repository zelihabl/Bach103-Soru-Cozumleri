package stringManipulations;

public class M08 {
    /*
      Bir String değişkeni oluşturunuz ve son karakteri dışındaki tüm karakterlerini konsolda büyük harfle yazdırınız.
      Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız
  */
    public static void main(String[] args) {
        String x = "Java";
        String y = x.toUpperCase().substring(0,x.length()-1);
        System.out.println(y);
    }



}
