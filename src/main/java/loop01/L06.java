package loop01;

public class L06 {
    /*
        20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sekilde aralarında bosluk
        bırakarak yazdırmak için gereken kodu yazınız.
    */
    public static void main(String[] args) {

        for (int i = 20; i > 2; i--){
            if (i%2==1){
                System.out.print(i + " ");
            }
         }
    }
}
