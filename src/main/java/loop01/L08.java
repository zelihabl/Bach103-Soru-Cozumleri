package loop01;

public class L08 {
    /*
        String içindeki tüm küçük harfleri yıldız isaretiyle yazdırmak için gereken kodu yazınız.
        Örnegin; 'Ali Can?' ==> l*i*a*n*
     */
    public static void main(String[] args) {
        String str = "Ali Can?";
        str = str.replaceAll("[^a-z]", "");

        for (int i = 0; i<str.length(); i++){
            char c = str.charAt(i);
            System.out.print(c+"*");
        }
    }
}
