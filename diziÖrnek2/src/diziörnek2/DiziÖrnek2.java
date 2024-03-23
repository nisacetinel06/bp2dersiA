
package diziörnek2;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class DiziÖrnek2 {

    public static void main(String[] args) {
        Scanner klavye=new Scanner(System.in);
        /*
        // DİZİ ELEMANLARINI İSTENİLEN KADAR KAYDIRMA
        System.out.println("Lutfen bir sayı girin: ");
        int hedefSayi=klavye.nextInt();
        
        int[] dizi=new int[10];
        for (int i = 0; i < 10; i++)
        {
            System.out.println((i+1)+".Sayiyi girin: (ikilik tabanda) ");      
            dizi[i]=klavye.nextInt();
            
        }
        System.out.println("Kaydırma yönü (saga/sola): ");
        String yon=klavye.next().toLowerCase();
        if (!yon.equals("saga")&& !yon.equals("sola"))
        {
            System.out.println("Geçersiz!");
            return;
        }
        System.out.println("Kaç adım kaydırılacak: ");
        int adim=klavye.nextInt();
        
        int[] sonucDizi=ikilikKaydir(dizi,adim,yon);
        System.out.println("Kaydırılmış dizi("+yon+""+adim+"adım): ");
        printDizi(sonucDizi);
        klavye.close();
        
    }
    public static int[] ikilikKaydir(int[] dizi,int adim,String yon)
    {
        int n=dizi.length;
        int[] kaydirilmisDizi=new int[n];
        
        if (yon.equals("saga"))
        {
            for (int i = 0; i <n; i++) 
            {
                kaydirilmisDizi[(i+adim)%n]=dizi[i];
            }
        }
        else if (yon.equals("sola"))
        {
            for (int i = 0; i <n; i++)
            {
                kaydirilmisDizi[i]=dizi[(i-adim+n)%n];
            }
        }
        return kaydirilmisDizi;
    }  
    public static void printDizi(int[] dizi)
    {
        for (int bit : dizi)
        {
            System.out.println(bit);    
        }
        System.out.println( );
    }
*/
 //RASTGELE OLUŞTURULAN DİZİ ELEMANLARINI SIRALAMA
 /*
   int[] dizi=rastgeleDizi(10);
        System.out.println("Oluşturulan dizi: "+ Arrays.toString(dizi));
        Arrays.sort(dizi);
        System.out.println("Sıralanmış dizi: "+ Arrays.toString(dizi));
   }
    public static int[] rastgeleDizi(int boyut)
    {
    int[] dizi=new int[boyut];
    Random random=new Random();
        for (int i = 0; i <boyut; i++)
        {
        dizi[i]=random.nextInt(100);
        }
        return dizi;
    }
*/
 //RASTGELE OLUŞTURULAN DİZİYİ TERSTEN YAZDIRMA
 /*
   int[] orijinalDizi=rastgeleDizi(5);
    System.out.println("Orijinal dizi: "+Arrays.toString(orijinalDizi));
    int[] tersDizi=terstenKopyala(orijinalDizi);
    System.out.println("Tersten kopyalanan dizi: "+Arrays.toString(tersDizi));
    
    }
    public static int[] rastgeleDizi(int boyut)
    {
        int[] dizi=new int[boyut];
        Random random=new Random();
        for (int i = 0; i <boyut; i++) 
        {
        dizi[i]=random.nextInt(100);
        }
        return dizi;
    }
    public static int[] terstenKopyala(int[] orijinalDizi)
    {
     int boyut=orijinalDizi.length;
     int[] tersDizi=new int[boyut];
        for (int i = 0; i <boyut; i++)
        {
        tersDizi[i]=orijinalDizi[boyut-1-i];
        
        }
        return tersDizi;
    }
//İSTENİLEN BOYUTTA RASTGELE OLUŞTURULAN DİZİDE SAYI ARAMA
        System.out.println("Dizi kaç boyutlu olsun: ");
        int boyut=klavye.nextInt();
        int[] dizi=rastgeleDizi(boyut);
        System.out.println("Aranacak sayı: ");
        int aranan=klavye.nextInt();
        
        boolean bulundu=false;
        for(int eleman:dizi)
        {
            if(eleman==aranan)
            {
                bulundu=true;
                break;
            }
        }
        if (bulundu)
        {
            System.out.println(aranan+" Dizide bulundu"); 
        }
        else
        {
            System.out.println(aranan+" Dizide bulunamadı");
        }
    }
    public static int[] rastgeleDizi(int boyut)
    {
        int[] dizi=new int[boyut];
        Random random=new Random();
        for (int i = 0; i <boyut; i++)
        {
        dizi[i]=random.nextInt();
        }
        return dizi;
    }
*/
 int[][] notlar=new int[4][2];
        for (int i = 0; i < 4; i++)
        {
            System.out.println((i+1)+".Ögrencinin vize ve final notlarını girin:");
            System.out.println("Vize: ");
            notlar[i][0]=klavye.nextInt();
            System.out.println("Final: ");
            notlar[i][1]=klavye.nextInt();
        }
        System.out.println("\nÖgrencinin Vize ve Final Ortalama ");
        System.out.println("-------------------------------------");
        for (int i = 0; i <4; i++)
        {
            int vize=notlar[i][0];
            int finalNot=notlar[i][1];
            double ortalama=(vize*0.4+(finalNot*0.6));
            System.out.printf("%-8d%-6d%-7d%.2f\n",(i+1),vize,finalNot,ortalama);
        }
 
 
 
 
 
 
 
 
 
 
    }
    
 }
