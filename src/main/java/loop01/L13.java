package loop01;

public class L13 {
    /*
            120'den 11'e kadar 4 ile bölüneb!len ve 6 ile bölüneb!len tüm tam sayıları aynı satırda iki
    ardısık tam sayı arasında bosluk bırakarak yazınız.
     */
    public static void main(String[] args) {
        //    for (int i=120; i>10;i--){
        //        if ((i%4==0)&&(i%6==0)){
        //            System.out.print(i+" ");
        //        }

        //    }

        // int i=120;
        // while (i>10){
        //     if ((i%4==0)&&(i%6==0)){
        //         System.out.print(i+" ");
        //     }
        //     i--;
        // }
        int a =120;
        do {
            if ((a%4==0)&&(a%6==0)){
                System.out.print(a+" ");
            }
            a--;

        }while(a>10);







    }
}
