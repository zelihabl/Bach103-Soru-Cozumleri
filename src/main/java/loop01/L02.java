package loop01;

public class L02 {
    /*
    Benzersiz (Tekrarsız) rakamları bir tamsayı olarak yazdırmak için kod yazınız.
    Örnek: 223878==>37
    */
    public static void main(String[] args) {

        String x = "223878";
        for (int i = 0; i <x.length() ; i++) {
            String ch = x.substring(i,i+1);
            if(x.indexOf(ch)==x.lastIndexOf(ch)){
                System.out.print(Integer.parseInt(ch));//37
            }
        }
    }
}
