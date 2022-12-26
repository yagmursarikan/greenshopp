package YedekProje;

import GreenShopp.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ŞifalıBitkileriYedek implements BitkiYedek{
    Scanner scanner = new Scanner(System.in);
    @Override
    public void isim(int b) {
        String [] şifisim = {"KEKİK","IHLAMUR"};
        for ( int i=0; i<şifisim.length; i++){
            System.out.println(şifisim[i]);
        }
    }

    @Override
    public double fiyat(int a) {
        int [] Dekfiyat = {120,110};

        return Dekfiyat [a];
    }

    @Override
    public void Bitki_Bilgileri(int bitkino) {
        ArrayList<String> Şifbitkileri=new ArrayList<>();
        Şifbitkileri.add("---ISIRGAN OTU---\n");
        Şifbitkileri.add("Fiyatı  tl\n");
        Şifbitkileri.add("Bağışıklık sistemini güçlendirir. Kanser önleyici ve gerileticidir \n");
        Şifbitkileri.add("Kanı temizler, idrar söktürür, böbrek taşlarının oluşumunu önler.\n");
        Şifbitkileri.add("Egzama, sedef, saçkıran ve saç dökülmesi gibi problemleri tedavi eder.\n");

        List<String> Şifbitkileri2 = new ArrayList<>();
        Şifbitkileri2.add(("---ŞEVKETİ BOSTAN---\n"));
        Şifbitkileri2.add("Fiyatı 11tl\n");
        Şifbitkileri2.add("Hazmı kolaylaştırır, bağırsakları çalıştırır, idrar söktürücüdür.\n");
        Şifbitkileri2.add(" Haşlama suyu sabah aç karnına içilirse karaciğer, böbrek taşı ve kumuna etkili\n");
        Şifbitkileri2.add(" Ayrıca spazm giderici, kas gevşetici ve ağrı kesici özelliği de var.\n");

        List<String> Şifbitkileri3 = new ArrayList<>();
        Şifbitkileri3.add(("---EŞEK DİKENİ---\n"));
        Şifbitkileri3.add("Fiyatı 11tl\n");
        Şifbitkileri3.add("Karaciğer ve böbreklerin daha iyi çalışmasına katkıda bulunur.\n");
        Şifbitkileri3.add("Mide güçlendirici, iştah açıcı, kuvvet verici, süt artırıcı, hazmı kolaylaştırıcı,"+
                " safra akışını düzenleyicidir.\n");
        Şifbitkileri3.add(" Ayrıca spazm giderici, kas gevşetici ve ağrı kesici özelliği de var.\n");

        List<String> Şifbitkileri4 = new ArrayList<>();
        Şifbitkileri4.add(("---MÜRVER ÇİÇEĞİ---\n"));
        Şifbitkileri4.add("Fiyatı 11tl\n");
        Şifbitkileri4.add(" Gözeneklerinizi açıp bol miktarda terleterek,"+
                " ateşinizin düşmesine yardımcı olan uçucu yağlar içerir.\n");
        Şifbitkileri4.add("Fincan başına 1 çorba kaşığı kullanarak civanperçemi çayı yapın ve "+
                "10 dakika boyunca kapalı bir kapta demlenmeye bırakın\n");
        Şifbitkileri4.add(" Bu çaydan bir ya da iki fincan içince terlemeye başlarsınız."+
                " Terlemeye başlayınca yeteri kadar içmişsiniz demektir.\n");

        List<String> Şifbitkileri5 = new ArrayList<>();
        Şifbitkileri5.add(("------\n"));
        Şifbitkileri5.add("Fiyatı 11tl\n");
        Şifbitkileri5.add("Gözenekleri açıp terlemeye yol açması nedeniyle, yüksek ateş için birebirdir.\n");
        Şifbitkileri5.add("Ayrıca mürver çiçeği özü, genellikle üşütme ve nezle nedenli yüksek ateşle birlikle görülen"+
                " burun tıkanıklığını açmaya yardımcı olan bileşenler içerir\n");
        Şifbitkileri5.add(" Bu çaydan bir ya da iki fincan içince terlemeye başlarsınız."+
                " Terlemeye başlayınca yeteri kadar içmişsiniz demektir.\n");
        Şifbitkileri5.add(" Kurutulmuş mürver çiçeğinden çay yapmak için, bir fincana koyduğunuz \n"+
                "2 çay kaşığı bitkinin üzerini kaynar suyla doldurun. Üstünü bir bezle kapatarak 15-20 dakika\n"+
                " demlenmeye bırakın. İhtiyaca göre, günde üç fincan için.");

        List<String> Şifbitkileri6 = new ArrayList<>();
        Şifbitkileri6.add(("------\n"));
        Şifbitkileri6.add("Fiyatı 11tl\n");
        Şifbitkileri6.add("Gözenekleri açıp terlemeye yol açması nedeniyle, yüksek ateş için birebirdir.\n");
        Şifbitkileri6.add("Ayrıca mürver çiçeği özü, genellikle üşütme ve nezle nedenli yüksek ateşle birlikle görülen"+
                " burun tıkanıklığını açmaya yardımcı olan bileşenler içerir\n");
        Şifbitkileri6.add(" Bu çaydan bir ya da iki fincan içince terlemeye başlarsınız."+
                " Terlemeye başlayınca yeteri kadar içmişsiniz demektir.\n");
        Şifbitkileri6.add(" Kurutulmuş mürver çiçeğinden çay yapmak için, bir fincana koyduğunuz \n"+
                "2 çay kaşığı bitkinin üzerini kaynar suyla doldurun. Üstünü bir bezle kapatarak 15-20 dakika\n"+
                " demlenmeye bırakın. İhtiyaca göre, günde üç fincan için.");



        if (bitkino == 1){
            System.out.println(Şifbitkileri+"\n\n");
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(1);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }

        } else if (bitkino == 2) {
            System.out.println(Şifbitkileri2);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(1);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 3) {
            System.out.println(Şifbitkileri3);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(1);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 4) {
            System.out.println(Şifbitkileri4);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(1);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }
        else if (bitkino == 5) {
            System.out.println(Şifbitkileri5);
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(1);
                    break;
                case 2:
                    isim(1);
                    System.out.println("Bilgisini görmek istediğiniz bitkinin numarasını giriniz: ");
                    int cevap2 = scanner.nextInt();
                    Bitki_Bilgileri(cevap2);
                    break;
            }
        }

    }
}
