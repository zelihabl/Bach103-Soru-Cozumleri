package swich;

public class SeasonsRunner_09 {
    public static void main(String[] args) {


        String mevsimler = Seasons_09.SUMMER.toString();

        switch (mevsimler) {

            case "WİNTER":
                System.out.println("Snowboard yapmak");
                break;
            case "SUMMER":

            case "FALL":
                System.out.println("Balik tutmak'");
                break;
            case "SPRING":
                System.out.println("Doga yuruyusu yapmak'");
                break;
            default:
                System.out.println("Gecersiz data");
        }
    }

}
