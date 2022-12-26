package GreenShopp;

import GreenShopp.Girişler;

import java.util.Scanner;

public class Login extends Girişler {
    private int cevap3;

    public int getCevap3() {
        return cevap3;
    }

    public void setCevap3(int cevap3) {
        this.cevap3 = cevap3;
    }

    static Scanner scanner = new Scanner(System.in);
    static DekorasyonBitkilerii dekobje = new DekorasyonBitkilerii();
    static Hesap Hesabım= new Hesap("yağmur sarıkan","748596",1230);
    @Override
    public void giriş (){

        int girişhakkı = 3;
        for(int i=1; i<2; i--){
            System.out.println("Adınızı ve soy adınızı giriniz: ");
            String isimm = scanner.nextLine();
            //scanner.nextLine();
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
             setCevap3(scanner.nextInt());
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

        // System.out.println("Kullanıcı adınız: "+Hesabım.getKullanici_adi());

       sepetim += dekobje.fiyat(sepet-1);
        System.out.println("Sepetinizin tutarı = "+sepetim);

        System.out.println("Bakiyeniz = "+Hesabım.getBakiye()+"tl");

        if (Hesabım.getBakiye() > sepetim){
         //   Hesabım.getBakiye()-= sepetim;
            Hesabım.setBakiye(Hesabım.getBakiye()-sepetim);
            System.out.println("Yeni bakiyeniz "+Hesabım.getBakiye()+"tl");
        } else if (Hesabım.getBakiye() < sepetim) {
            Hesabım.setBakiye(Hesabım.getBakiye()-sepetim);
            System.out.println(-(Hesabım.getBakiye()-sepetim)+"tl yüklemeniz gerekiyor.");
            System.out.println("Para yatırmak için 1'e Ana menü için 2'ye basın");
            int para = scanner.nextInt();
            if(para==1){
                System.out.println("Yatırmak istediğiniz parayı girin");
                int parayatır = scanner.nextInt();
                Hesabım.setBakiye(parayatır);
                System.out.println("Yeni bakiyeniz "+Hesabım.getBakiye());
            }
        }
    }



}