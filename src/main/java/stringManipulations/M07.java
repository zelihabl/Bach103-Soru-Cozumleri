package stringManipulations;

public class M07 {
    /*
     Bir String değişkeni oluşturunuz ve ilk karakteri dışındaki tüm karakterleri konsolda yazdırınız.
     Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız
 */
    public static void main(String[] args) {
        String x = "Java";
        System.out.println(x.substring(1));

        //2.YOL
        String y = x.replace(x.substring(0,1), "");
        System.out.println(y);
    }


}
