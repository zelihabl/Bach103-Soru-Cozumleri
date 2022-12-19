package swich;

public class S05 {
    public static void main(String[] args) {

        /*
        5) Belirli bir yılın belirli bir ayındaki gün sayısını görüntülemek için bir kod yazınız.
           Örnek: 2000 yılının Şubat ayında gün sayısı 29
         */
        int yil = 2023;
        String ay = "Subat";
        boolean leapMi = yil % 100 == 0 ? (yil % 400 == 0 ? true : false) : (yil % 4 == 0 ? true : false);

        switch (ay.toLowerCase()) {
            case "ocak":
            case "temmuz":
            case "mart":
            case "agustos":
            case "mayis":
            case "ekim":
            case "aralik":
                System.out.println("Gün sayisi 31 ");
                break;
            case "nisan":
            case "kasim":
            case "haziran":
            case "eylül":
                System.out.println("Gün sayisi 30 ");
                break;
            case "subat":
                if (leapMi) {
                    System.out.println("Gün sayisi 29");
                } else
                    System.out.println("Gün sayisi 28");
                break;
}


    }
}
