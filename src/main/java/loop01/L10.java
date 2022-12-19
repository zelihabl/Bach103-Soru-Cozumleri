package loop01;

public class L10 {
    /*
    Asagıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                 A A A A A A A A
                 A X X X X X X A
                 A X X X X X X A
                 A X X X X X X A
    */
    public static void main(String[] args) {
        int satir = 4;
        int sutun = 8;

        for (int i = 1; i<=satir; i++){
            if (i!=1){
                for (int k = 1; k<=sutun; k++){
                    if (k!=1 && k!=sutun){
                        System.out.print("X ");
                    }else {
                        System.out.print("A ");
                    }
                }
            }else {
                for (int j = 1; j <= sutun; j++){
                    System.out.print("A ");
                }
            }
            System.out.println();
        }
    }
}
