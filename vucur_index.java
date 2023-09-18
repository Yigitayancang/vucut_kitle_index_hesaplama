// kullanıcı verisi için kütüphane tanımı
import java.util.Scanner;
public class vucur_index {
    public static void main(String[] args) {
        // verileri tutmak için veri tipi tanımı
        int kilo  ;
        double boy , total;
        // kullanıcıdan veri alma 
        Scanner giris = new Scanner(System.in);
        System.out.println("BOYUNUZU GİRİNİZ : ");
        boy = giris.nextDouble();
        System.out.println("KİLONUZU GİRİNİZ ");
        kilo = giris.nextInt();
        // opretörler ile hesaplama 
        total = kilo / (boy  * boy);
        // ekrana bastırma 
        System.out.println("VÜCUT İNDEKSİ  : " + total);
        // İF BLOKLARI İLE ORAN HESAPLAMA 
        if ( total < 18.5){
            System.out.println("ZAYIF BİRİSİN");
        }
        else if (total < 24.9){
            System.out.println("NORMAL KİLODASIN ");
        }
        else if (total < 29.9){
            System.out.println("FAZLA KİLODASIN ");
        }
        else{
            System.out.println("OBEZİTE KISMINDASIN YARDIM AL. ");
        }

    }

}