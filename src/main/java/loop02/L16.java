package loop02;

public class L16 {

    public static void main(String[] args) {


        /*
        16) Bir String de, ilk 'm' karakterinden önceki tüm karakterleri yazınız.
         */
        String s = "Annemin Mustafası";
        for(int i=0;i<s.length();i++){
            String c=s.substring(i,i+1); //sırayla alması için
            if(c.equals("m")){
                break;
            }
            System.out.print(c);
            }

        }




    }

