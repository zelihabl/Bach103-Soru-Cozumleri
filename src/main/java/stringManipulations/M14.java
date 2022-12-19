package stringManipulations;

public class M14 {
     /*
        Bir String’in belirli bir tek karaktere sahip olup olmadığını üç farklı şekilde kontrol etmek için kod yazınız.
        String s = "Java";
    */

    public static void main(String[] args) {
        String str = "Java";
        //1.
        boolean x = str.contains("v");
        System.out.println(x);

        //2.
        int idx = str.indexOf("v");
        boolean y = idx >=0;
        System.out.println(y);

        //3.
        String harf = str.replaceAll("v", "");
        boolean z = !str.equals(harf);
        System.out.println(z);

    }

}
