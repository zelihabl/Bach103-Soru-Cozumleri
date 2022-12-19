package loop01;

public class L03 {
    /*
    Asagıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
                     A A A A A
                     A A A A A
                     A A A A A
     */

    public static void main(String[] args) {
        int satir = 3;
        int sutun = 5;

        for (int i = 1; i < 4; i++) {
            String k = "";
            for (int j = 1; j < 6; j++) {
                k = k + "A ";
            }
            System.out.println(k);
        }
    }
}
