package loop02;

public class L21 {
    public static void main(String[] args) {
   /*
        21) Bir tamsayının benzersiz(tekrarsız) basamaklarının toplamını bulmak için kodu yazınız.
         Örnek:12133455 ´ 2+4=
    */
        int a=12133455;
        int top=0;
        String a1=String.valueOf(a);
        for (int i = 0; i <a1.length(); i++) {
            String b=a1.substring(i,i+1);
            if(a1.indexOf(b)==a1.lastIndexOf(b)){
                top+=Integer.valueOf(b); //top=top+Integer.valuefOf();
            }

        }
        System.out.println(top);



    }
}
