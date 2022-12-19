package loop02;

public class L15 {
    public static void main(String[] args) {

        /*
        15) Do-while döngüsünü kullanarak konsolda 'C' ile 'A' arasındaki karakterleri yazdırmak için
            kod yazınız.
         */

        char harf='C';
        String f="";
        do{
            f=f+harf;
            harf--;
        }while (harf>='A');
        System.out.println(f);


        //2.yol
        char c = 'C';
        do {
            System.out.print(c+" ");
            c--;
        }while(c>='A');
    }



    }



