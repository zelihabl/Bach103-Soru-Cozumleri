package loop01;

public class L05 {

    /*
        Asagıdaki çarpım tablosunu olusturmak için kod yazınız.
        3x1=3 3x2=6 3x3=9 3x4=12 3x5=15 3x6=18 3x7=21 3x8=24 3x9=27 3x10=30
    */
    public static void main(String[] args) {
        int s = 3;
        for (int i = 1; i<11; i++){
            System.out.print(s +"x"+i+"="+(s*i) + " ");
        }
    }
}
