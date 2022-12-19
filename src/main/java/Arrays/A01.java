package Arrays;

import java.util.Arrays;

public class A01 {

    public static void main(String[] args) {
        //5) String’ lerden oluşan bir arrayde kullanılan öğelerin toplam karakter sayısını bulunuz.
        //Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26

        String names[] = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        System.out.println(Arrays.toString(names));
        int sum = 0;
        for (String w : names) {
            sum = sum + w.length();
        }
        System.out.println(sum);


/*
            Scanner scan = new Scanner(System.in);

            int [] dizi = new int[10];

            for(int i = 0; i < dizi.length; i++)
            {
                System.out.print("Dizinin " + (i+1) + ". elemanını giriniz: ");
                dizi[i] = scan.nextInt();
            }
            System.out.println("Dizinin tersten yazılmıs hali\n");

            for(int i = dizi.length-1; i >= 0; i--)
            {
                System.out.println("Dizinin " + (dizi.length-i) + ". elemanı = " + (dizi[i]));
            }
        }
    }
    */



        int arr[] = {10, 9, 11};
        Arrays.sort(arr);


        for (int i = arr.length - 1; i >= 0; i--){
            System.out.println(Arrays.toString(arr));

        }


        }


    }


