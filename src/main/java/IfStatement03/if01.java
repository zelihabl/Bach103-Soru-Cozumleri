package IfStatement03;

public class if01 {

    public static void main(String[] args) {

          /*
        1)Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
       a) Aralık, Ocak, Şubat için "Kış"
       b) Mart, Nisan, Mayıs için "İlkbahar"
       c) Haziran, Temmuz, Ağustos için "Yaz"
       d) Eylül, Ekim, Kasım için "Sonbahar"
       e) Diğerleri için "Geçersiz ay adı"

         */
        String ay = "Eylül";
        ay=ay.toLowerCase();

        if (ay.equals("Aralık") || ay.equals("Ocak") || ay.equals("Şubat")) {
            System.out.println("Kış");
        } else if (ay.equals("Mart") || ay.equals("Nisan") || ay.equals("Mayıs")) {
            System.out.println("İlkbahar");
        } else if (ay.equals("Haziran") || ay.equals("Temmuz") || ay.equals("Ağustos")) {
            System.out.println("Yaz");
        } else if (ay.equals("Eylül") || ay.equals("Ekim") || ay.equals("Kasım")) {
            System.out.println("Sonbahar");
        } else {
            System.out.println("gecersiz ay");



        }
    }
}








