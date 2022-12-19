package loop01;

public class L11 {
    /*
    3 ile 14 arasındaki tam sayıların toplamını bulmak için kodu yazınız.
    */
    public static void main(String[] args) {
        int sum=0;
        for (int i=3; i<15; i++){
            sum=sum+i;
        }
        System.out.println(sum);

    }
}
