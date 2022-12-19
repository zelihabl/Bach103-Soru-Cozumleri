package loop01;

public class L09 {
    /*
        Bir String’i tersine çevirmek için kod yazınız. Örnek; Mark ==> kraM
    */
    public static void main(String[] args) {
        String str = "Gürkay";
        String s = "";
        for (int i = str.length()-1; i>=0; i--){
            s = s + str.charAt(i);
        }
        System.out.println(s);
    }
}
