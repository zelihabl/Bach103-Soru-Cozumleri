package loop01;

public class L01 {

    public static void main(String[] args) {

    /*
       Bir String‘in palindrom olup olmadıgını kontrol etmek için kod yazınız. Bir String, tersi ile
       aynıysa, buna palindrom denir.
       Örnegin; “anna”, “123321” palindromlardır.
    */

            String str = "anna";
            String tersStr = "";
            for (int i = str.length() - 1; i > -1; i--) {
                String harf = str.substring(i, i + 1);
                tersStr = tersStr + harf;
            }
            if (str.equals(tersStr)) {
                System.out.println("Palindromdur");
            } else System.out.println("Palindrom değildir");


        String a="223878";
        String b="";
        int counter = 0;
        for(int i=0;i<=a.length()-1;i++){
            String f=a.substring(i,i+1);
            counter = 0;
            //  System.out.println(" forloop1 "+i+" f harfi "+ f );
            for(int j=0;j<a.length();j++){
                String e=a.substring(j,j+1);
                //System.out.println(" forloop2 "+ j +" e harfi "+ e+" f harfi "+ f);
                if(i==j){
                    continue;
                } else if(f.equals(e)){
                    // System.out.println("stop");
                    break;

                } else if(!f.equals(e)){
                    counter++;
                    //System.out.println("HERE "+counter);
                    if(counter==a.length()-1)
                        b=b+f;
                    //  System.out.println(b);
                }

            }

        }
        //System.out.println(b);
        System.out.println(b);
        }
    }