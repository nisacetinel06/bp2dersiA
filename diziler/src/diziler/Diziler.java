
package diziler;
import java.util.Scanner;
public class Diziler {

    public static void main(String[] args) {
      Scanner klavye= new Scanner(System.in);
        System.out.println("Dizi kaç elemanlı olsun: ");
        int diziUzunluk=klavye.nextInt();
        klavye.nextLine();
        String[] isimler= new String[diziUzunluk];
        for(int i=0;i<isimler.length;i++)
        {
            System.out.println("Dizinin"+(i)+". index degerini girin: ");
            isimler[i]=klavye.nextLine();
        }
        for(int i=0; i<isimler.length;i++)
        {
            System.out.println(isimler[i]);
        }
    }
    
}
