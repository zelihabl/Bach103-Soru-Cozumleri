package stringManipulations;

public class M11 {
      /*
        Bir String’in başında ve sonunda boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
        Örnek:‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
    */

    public static void main(String[] args) {
        String x = "Ali ";
        String y = x.trim();
        boolean z = x.equals(y);
        System.out.println(z);

        //2.Yol
        String a = "Ali ";
        String b = a.trim();
        boolean c= b.length()-a.length()==0;
        System.out.println(c);
    }



}


