import java.util.Scanner;
import java.util.Scanner;
public class Atmuygulaması {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
         String islemSecenekleri="Bakiye sorgulama -->1"
                 +"Para çekmek -->2"
                 +"Para yatırmak -->3"
                 +"Çıkış için q tuşuna basın.";
         
        double bilalBakiye=2450;
        String bilalIban="TR1265 0780 127 985 345 7572 13 89";
        String bilalKullanici="bilal12";
        String bilalSifre="123";
        
        double enesBakiye=1550;
        String enesIban="TR1265 0780 127 985 345 7572 14 90";
        String enesKullanici="enes55";
        String enesSifre="456";
        
        System.out.println("ATM'ye Hoşgeldiniz.");
        System.out.println("lÜTFEN BİLGİLERİNİZİ DOĞRU GİRİNİZ.");
        
        System.out.println("Kullanıcı adı: ");
        String kullaniciAdi= klavye.nextLine();
        
        System.out.println("Şifre: ");
        String sifre=klavye.nextLine();
        
        if(kullaniciAdi.equals("bilal12") && sifre.equals("123"))
        {
            System.out.println("Bilal Çamur hesabına giriş yapıldı.");
            System.out.println("İşlem Seçenekleri");
            
            System.out.println("Lütfen bir seçim yapınız: ");
            String secim=klavye.nextLine();
            
            switch(secim)
            {
                case "1":System.out.println("Bakiyeniz: "+bilalBakiye);break;
                case "2":System.out.println("Çekmek istediğiniz tutarı girin: ");
                int cekilecekTutar=klavye.nextInt();
                if(bilalBakiye>=cekilecekTutar)
                {
                    bilalBakiye-=cekilecekTutar;
                    System.out.println("Kalan bakiye: "+bilalBakiye);
                }
                else
                {
                    System.out.println("Bakiyenizden fazla para cekemezsiniz.");
                } 
                break;
        case "3":
        System.out.println("Ne kadar yatırmak istiyorsunuz:");
        int yatirilacakTutar=klavye.nextInt();
        if(yatirilacakTutar<=bilalBakiye)
        {
            System.out.println("İBAN girin: ");
            String yatirilacakIban=klavye.nextLine();
            if(yatirilacakIban.equals("enesIban"))
            {
                System.out.println("Enes Bayram adlı kişiye para yatırıldı.");
                bilalBakiye-=yatirilacakTutar;
                enesBakiye+=yatirilacakTutar;   
            }  
        }
        break;
        case "q":System.out.println("Hatalı giriş.");break;
            }
        }
        
        else if (kullaniciAdi.equals("enes55") && sifre.equals("456"))
        {
            System.out.println("Enes Bayram hesabına giriş yapıldı.");
            System.out.println("İşlem Seçenekleri");
            
            System.out.println("Lütfen bir seçim yapınız: ");
            String secim=klavye.nextLine();
            
            switch(secim)
            {
                case "1":System.out.println("Bakiyeniz: "+enesBakiye);break;
                case "2":System.out.println("Çekmek istediğiniz tutarı girin: ");
                int cekilecekTutar=klavye.nextInt();
                if(enesBakiye>=cekilecekTutar)
                {
                    bilalBakiye-=cekilecekTutar;
                    System.out.println("Kalan bakiye: "+enesBakiye);
                }
                else
                {
                    System.out.println("Bakiyenizden fazla para cekemezsiniz.");
                } 
                break;
        case "3":
        System.out.println("Ne kadar yatırmak istiyorsunuz:");
        int yatirilacakTutar=klavye.nextInt();
        if(yatirilacakTutar<=bilalBakiye)
        {
            System.out.println("İBAN girin: ");
            String yatirilacakIban=klavye.nextLine();
            if(yatirilacakIban.equals("bilalIban"))
            {
                System.out.println("Bilal Çamur adlı kişiye para yatırıldı.");
                enesBakiye-=yatirilacakTutar;
                bilalBakiye+=yatirilacakTutar;   
            }  
        }
        break;
        case "q":System.out.println("Hatalı giriş.");break;
            }
        }
        else
        {
          System.out.println("Hatalı giriş! Tekrar deneyiniz.");      
        }
       
    }
    
}
