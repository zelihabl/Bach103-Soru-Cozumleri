package stringManipulations;

public class M06 {
     /*
        Bir String değişkeni oluşturunuz ve String'in ilk ve son karakterlerinin ASCII değerlerinin toplamını bulunuz.
    */

    public static void main(String[] args) {
        String z = "dsad asşld aşs";
        int ilk = z.charAt(0);
        System.out.println(ilk);
        int son = z.charAt(z.length()-1);
        System.out.println(son);
        System.out.println(ilk+son);


        //Esroş
        String a = "Gürkay Esrayı Seviyor";
        char ilkharf = a.charAt(0);
        char sonharf = a.charAt(a.length()-1);

        System.out.println(ilkharf+sonharf);


        //Mustafa
        String str = "Mustafaaa";

        int x =str.charAt(0)+str.charAt(str.length()-1);
        System.out.println(x);


    }
}


