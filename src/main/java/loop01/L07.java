package loop01;

public class L07 {
    /*
        Verilen ondalık sayının sadece ondalık kısmındaki rakamlarını, kendisinden önce bir yıldız
        isaretiyle yazdırmak için gereken kodu yazınız.
        Örnegin; 75.4238 ´ *4*2*3*8
     */
    public static void main(String[] args) {
        double a = 75.4238;
        String s = String.valueOf(a);
        s = s.split("\\.")[1];
        for (int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            System.out.print("*"+c);
         }
    }
}
