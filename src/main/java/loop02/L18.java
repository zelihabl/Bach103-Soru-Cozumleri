package loop02;

public class L18 {

    public static void main(String[] args) {
        /*
        18) Bir String’ de benzersiz(tekrarsız) karakterler yazdırmak için kod yazınız.
          Örneğin; Hello ==> Heo
         */
            String s = "Hello";
           for(int i=0;i<s.length();i++){
           String z= s.substring(i,i+1);
            if(s.indexOf(z)==s.lastIndexOf(z)){
           System.out.print(z);
            }
       }

    }
}
