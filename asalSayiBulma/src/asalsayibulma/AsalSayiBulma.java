
package asalsayibulma;
import java.util.Scanner;
public class AsalSayiBulma {

   
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        System.out.println("Sayı girin: ");
        int sayi=klavye.nextInt();
        boolean asalMi=false;
       
        for( int i=2 ; i<=sayi ; i++)
        {
           
            if(sayi%i==0)
            {
                asalMi=false;break;
            }
            else
            {
                asalMi=true;          
            }    
        }
        if(asalMi)
        {
            System.out.println(sayi+" "+"sayisi asaldır.");
        }
        else
        {
            System.out.println(sayi+" " +"sayisi asal değildir.");
        }
    }
    }
        


