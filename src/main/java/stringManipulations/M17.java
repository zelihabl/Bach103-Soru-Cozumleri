package stringManipulations;

public class M17 {
    /*
      Bir String’de kullanılan noktalama işaretlerinin sayısını bulmak için bir kod yazınız.
      String s = "Vay be! Ali, 13 yaşında ama üniversite öğrencisi...";
  */
    public static void main(String[] args) {
        String s = "Vay be! Ali 13, yaşında ama; üniversite öğrencisi...";
        s = s.replaceAll("[^\\p{Punct}]", "");
        System.out.println(s.length());
    }
}
