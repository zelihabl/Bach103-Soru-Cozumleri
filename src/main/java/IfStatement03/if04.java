package IfStatement03;

public class if04 {
     /*
    4) Aşağıdaki seçenekler doğrultusunda gereken kodu yazınız.
    a) Son basamak 5 ‘e eşit ve 5 den büyükse, yuvarlama işlemi: “Son basamağı bir üst ondalığa yuvarla”
    b) Son basamak 5 den küçükse, yuvarlama işlemi: “Son basamağı bir alt ondalığa yuvarla”
     */

    public static void main(String[] args) {
        int sayı= 127;
        if(sayı%10>=5){
            System.out.println("üst ondalığa yuvarla"+(sayı/10+1)*10);
        }else{
            System.out.println("alt ondalığa yuvarla" + (sayı/10)*10);
        }

    }
}

