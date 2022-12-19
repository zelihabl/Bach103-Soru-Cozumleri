package loop01;

public class L04 {
    /*
    Asagıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                                A
                                A A
                                A A A
                                A A A A
     */
    public static void main(String[] args) {

        int satir=4;
        for(int i=1; i<=satir; i++){
            String k="";
            for(int j=1;j<=i; j++){
                k= k +"A ";
            }
            System.out.println(k);
         }
    }
}
