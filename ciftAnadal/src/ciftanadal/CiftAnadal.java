
package ciftanadal;
import java.util.Scanner;
public class CiftAnadal {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Ogrencinin agnosunu girin: ");
        double agno=klavye.nextDouble();
        if ( agno >= 2.75 ) 
        {
            System.out.println("Ögrencinin dönemini girin: ");
            int donem=klavye.nextInt();
            if(donem>3 && donem<5)
            {
                System.out.println("Ögrenci çap yapabilir.");
            }
            else
            {
                System.out.println("Öğrenci çap yapamaz.");
            }
        }
        else
        {
            System.out.println("Çap yapamaz,agno yetersiz.");
        }
        
    }
    
}
