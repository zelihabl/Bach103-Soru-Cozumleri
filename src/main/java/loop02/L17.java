package loop02;

public class L17 {
    public static void main(String[] args) {


        /*
        17) Bir tamsayıdaki rakamların toplamını bulmak için kodu yazınız.
         */

        int x=721;
        int sum=0;
        for (int i = x; i>0 ; i=i/10) {
            sum=sum+i%10;
        }
        System.out.println(sum);

    }
}
