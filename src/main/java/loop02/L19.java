package loop02;

public class L19 {

    public static void main(String[] args) {

         /*
        Bir String’ deki boşluk ve noktalama işaretleri dışındaki toplam karakter sayısını bulunuz.
         */


        //1.yol
        // String s="Annesinin Mustafa'sı,bugün annesini aradı.:";
        //s = s.replaceAll("\\s","").replaceAll("\\p{Punct}", "");
        //System.out.println(s.length());

        //2.yol
        String s = "Annesinin Mustafa'sı, bugün annesini aradı. :)!!!";
        String a="";

        for (int i = 0; i < s.length(); i++){
            char ch=s.charAt(i);
            if (ch>=32&&ch<=64){
                continue;
            }
            a+=ch;
        }
        System.out.println(a.length());



    }
}
