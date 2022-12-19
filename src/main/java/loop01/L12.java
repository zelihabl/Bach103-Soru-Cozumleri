package loop01;

public class L12 {
    /*
    3 ile 9 arasındaki tam sayıların çarpımını bulmak için kodu yazınız.
     */
    public static void main(String[] args) {

        int carpim= 1;
        for (int i = 3; i <10 ; i++) {
            carpim= carpim*i;

        }
        System.out.println(carpim);

    }
}
