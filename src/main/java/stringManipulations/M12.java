package stringManipulations;

public class M12 {
     /*
        Bir String’in başında büyük harf ve sonunda nokta olup olmadığını kontrol etmek için kod yazınız.
            Örnek:‘Ali’ için kodunuz konsolda false yazdırmalıdır
            ‘ali.’ için kodunuz konsolda false yazdırmalıdır
            ‘  Ali.  ’ için kodunuz konsolda false yazdırmalıdır
            ‘Ali.’ için kodunuz konsolda true yazdırmalıdır
            ‘ALI.’ için kodunuz konsolda true yazdırmalıdır
            String s = "Tom Hanks.";
    */

    public static void main(String[] args) {
        String str= "Tom Hanks.";
        char ilk = str.charAt(0);
        char son = str.charAt(str.length()-1);

        Boolean control = (ilk >='A' && son <='Z') && son =='.';
        System.out.println("Kontrol = " + control);


        //2.YOL
//        String str= "Tom Hanks.";
//        char ilk = str.charAt(0), son = str.charAt(str.length()-1);
//        Boolean ilkControl = ilk >='A' && son <='Z';
//        Boolean sonControl= son =='.';
//        Boolean ilkSonControl = ilkControl && sonControl;
//        System.out.println("ilkSonControl = " + ilkSonControl);
    }

}
