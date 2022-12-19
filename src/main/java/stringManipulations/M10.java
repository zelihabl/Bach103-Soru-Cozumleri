package stringManipulations;

public class M10 {
    /*
      Bir String'in ortadaki herhangi bir konumda yalnızca tek bir boşluk karakteri olup olmadığını kontrol etmek için kod yazınız.
      Örnek: ‘Ali    Can’ için konsolda false yazmalıdır.
             ‘ Ali Can ’ için konsolda false yazmalıdır.
             ‘ Ali    Can ’ için konsolda false yazmalıdır.
             ‘Ali Can’ için konsolda true yazmalıdır.
  */
    public static void main(String[] args) {
        String x = "Ali Can";
        String y = x.trim().replaceAll("\\s+", " ");
        boolean z = x.equals(y);
        System.out.println(y);
        System.out.println(z);
    }

}
