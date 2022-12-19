package stringManipulations;

public class M05 {
      /*
        Bir String değişkeni oluşturunuz ve String değişkenin konsolda boşluk olmayan sonkarakteri yazdırınız.
        Örnek:'Ali Can' için n yazdırmalısınız.
        ‘Miami’ için i yazdırmalısınız
    */

    public static void main(String[] args) {
        String x = "Ali Can     ";
        x = x.trim();
        System.out.println(x.charAt(x.length()-1));


        //Mustafa
        String str = " Mustafa Halt Yemee ";
        str = str.trim();
        char m = str.charAt(str.length()-1);
        System.out.println(m);
    }

}
