package YedekProje;

import GreenShopp.DekorasyonBitkilerii;
import GreenShopp.Hesap;

import java.util.Scanner;

public class LoginYedek extends GirişlerYedek{
    Scanner scanner = new Scanner(System.in);
    static DekorasyonBitkilerii dekobje = new DekorasyonBitkilerii();
    static Hesap Hesabım= new Hesap("yağmur sarıkan","748596",1230);
    @Override
    public void giriş (){

        int girişhakkı = 3;
        for(int i=1; i<2; i--){
            System.out.println("Adınızı ve soy adınızı giriniz: ");
            String isimm = scanner.nextLine();
            System.out.println("Şifrenizi giriniz: ");
            String password = scanner.nextLine();

            if(isimm.equalsIgnoreCase(Hesabım.getKullanici_adi())&& password.equals(Hesabım.getPassword())){
                System.out.println("Giriş başarılı");
                break;
            }
            else if (girişhakkı>0) {
                System.out.println("Giriş başarısız"+" Kalan giriş hakkınız "+girişhakkı);
                girişhakkı--;
                continue;
            } else if (girişhakkı==0) {
                System.out.println("Giriş hakkınız kalmadı. Programdan çıkılıyor");
                break;
            }
            break;
        }
    }
    @Override
    public void seçenek() throws InterruptedException {
        System.out.println("Bitkiyi satın almak için 1'e Bitkilerin bilgilerini görmek için 2'ye basınız");
        int cevap = scanner.nextInt();
        if (cevap == 1){
            System.out.println("Satın almak istediğiniz bitkinin numarasını giriniz: ");
            int cevap3 = scanner.nextInt();
            sepet(cevap3);
            Thread.sleep(3000);
        } else if (cevap==2) {
            System.out.println("Kaçıncı bitkinin bilgisini görmek istiyorsunuz? ");
            int cevap2=scanner.nextInt();
            dekobje.Bitki_Bilgileri(cevap2);
            Thread.sleep(3000);
        }
    }
    //@Override
    public static void sepet(int sepet){
        double sepetim=0;
        sepetim += dekobje.fiyat(sepet-1);
        System.out.println("Sepetinizin tutarı = "+sepetim);
        System.out.println("Bakiyeniz = "+Hesabım.getBakiye()+"tl");
        if (Hesabım.getBakiye() > sepetim){
            //   Hesabım.getBakiye()-= sepetim;
            System.out.println();
        }
        System.out.println();
    }
    /*@Override
    public void ödeme() {

        System.out.println(Hesabım.getBakiye()+"tl Bakiyeniz bulunuyor");
        System.out.println();
    }*/
}
