package stringManipulations;

public class M02 {
     /*
        Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        karakter sayısının toplamını yazdırınız.
        Örnek: İsimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
    */

    public static void main(String[] args) {
        String a = "Ali Can";
        String b = "Merve Star";
        String c = "Mark Tom";

        a = a.replace(" ", "");
        b = b.replace(" ", "");
        c = c.replace(" ", "");
        System.out.println(a.length() + b.length() + c.length());

        //Mustafa
        String kisi1="Ali Kemal";
        String kisi2="Mustafa Bugra";
        String kisi3="Gürkay Yavuz";

        System.out.println(kisi1.replaceAll(" ","").length()
                +kisi2.replaceAll(" ","").length()+
                kisi3.replaceAll(" ","").length());

        //Esra
        String a1= "Ali Can";
        String b1 = "Merve Star";
        String c1 = "Mark Tom";

        a1 = a1.replaceAll(" ", ""); //AliCan
        System.out.println(a1);

        b1 = b1.replaceAll(" ", "");//MerveStar
        System.out.println(b1);

        c1 = c1.replaceAll(" ", "");//MarkTom
        System.out.println(c1);

        System.out.println(a1.length()+b1.length()+c1.length()); //22

        //Zeliha
        String name = " Ali Can";
        String name2 = "Merve Star";
        String name3 = "Mark Tom";

        int değer=(name+name2+name3).replaceAll("\\s", "").length();
        System.out.println(değer);

        //Ramazan
        String isim1 ="Ali Can", isim2 = "Merve Star", isim3="Mark Tom";
        String satir=(""+isim1+isim2+isim3).replace(" ", "");
        System.out.println(satir.length());



    }
}

