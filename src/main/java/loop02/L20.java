package loop02;

public class L20 {
    public static void main(String[] args) {
        /*Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.

                   * * * * * *
                   * * * * *
                   * * * *
                   * * *
                   * *
                   *
        */
        int satir = 6;
        int sutun = 6;

        for (int i = 1; i <= satir; i++) {   //imleci aşağı indirmak için ilk for
            for (int k=sutun; k>=i; k--){
                System.out.print("* ");
            }
            System.out.println();

            }
         }

    }

