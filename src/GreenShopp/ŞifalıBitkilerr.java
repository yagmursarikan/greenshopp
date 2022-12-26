package GreenShopp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ŞifalıBitkilerr implements Bitki{
      Scanner scanner = new Scanner(System.in);
    @Override
    public void isim(int b) {
        String [] şifisim = {"ISIRGAN OTU 47TL","ŞEVKETİ BOSTAN 51TL","EŞEK DİKENİ 110TL\n"+
        "MÜRVER ÇİÇEĞİ 118TL","ARAP SAÇI 55TL","LABADA 45TL","MİS OTU 70TL","LEYLEK GAGASI 105TL"};
        for ( int i=0; i<şifisim.length; i++){
            System.out.println(şifisim[i]);
        }
    }

    @Override
    public double fiyat(int a) {
        int [] Şiffiyat = {47,51,110,118,55,45,70,105};

        return Şiffiyat [a];
    }

    @Override
    public void Bitki_Bilgileri(int bitkino) {
        ArrayList<String> Şifbitkileri=new ArrayList<>();
        Şifbitkileri.add("---ISIRGAN OTU---\n");
        Şifbitkileri.add("Fiyatı 47tl\n");
        Şifbitkileri.add("Bağışıklık sistemini güçlendirir. Kanser önleyici ve gerileticidir \n");
        Şifbitkileri.add("Kanı temizler, idrar söktürür, böbrek taşlarının oluşumunu önler.\n");
        Şifbitkileri.add("Egzama, sedef, saçkıran ve saç dökülmesi gibi problemleri tedavi eder.\n");

        List<String> Şifbitkileri2 = new ArrayList<>();
        Şifbitkileri2.add(("---ŞEVKETİ BOSTAN---\n"));
        Şifbitkileri2.add("Fiyatı 51tl\n");
        Şifbitkileri2.add("Hazmı kolaylaştırır, bağırsakları çalıştırır, idrar söktürücüdür.\n");
        Şifbitkileri2.add(" Haşlama suyu sabah aç karnına içilirse karaciğer, böbrek taşı ve kumuna etkili\n");
        Şifbitkileri2.add(" Ayrıca spazm giderici, kas gevşetici ve ağrı kesici özelliği de var.\n");

        List<String> Şifbitkileri3 = new ArrayList<>();
        Şifbitkileri3.add(("---EŞEK DİKENİ---\n"));
        Şifbitkileri3.add("Fiyatı 110tl\n");
        Şifbitkileri3.add("Karaciğer ve böbreklerin daha iyi çalışmasına katkıda bulunur.\n");
        Şifbitkileri3.add("Mide güçlendirici, iştah açıcı, kuvvet verici, süt artırıcı, hazmı kolaylaştırıcı,"+
                " safra akışını düzenleyicidir.\n");
        Şifbitkileri3.add(" Ayrıca spazm giderici, kas gevşetici ve ağrı kesici özelliği de var.\n");

        List<String> Şifbitkileri4 = new ArrayList<>();
        Şifbitkileri4.add(("---MÜRVER ÇİÇEĞİ---\n"));
        Şifbitkileri4.add("Fiyatı 118tl\n");
        Şifbitkileri4.add(" Gözeneklerinizi açıp bol miktarda terleterek,"+
                " ateşinizin düşmesine yardımcı olan uçucu yağlar içerir.\n");
        Şifbitkileri4.add("Fincan başına 1 çorba kaşığı kullanarak civanperçemi çayı yapın ve "+
                "10 dakika boyunca kapalı bir kapta demlenmeye bırakın\n");
        Şifbitkileri4.add(" Bu çaydan bir ya da iki fincan içince terlemeye başlarsınız."+
                " Terlemeye başlayınca yeteri kadar içmişsiniz demektir.\n");

        List<String> Şifbitkileri5 = new ArrayList<>();
        Şifbitkileri5.add(("---ARAP SAÇI---\n"));
        Şifbitkileri5.add("Fiyatı 55tl\n");
        Şifbitkileri5.add("aprakları, spazm giderici, safra söktürücü, süt artırıcı, iştah açıcı,"+
                " idrar söktürücü ve gaz giderici etki gösterir.\n");
        Şifbitkileri5.add("Kökü, safra taşlarına ve idrar azlığına iyi gelir");
        Şifbitkileri5.add("Yaprakları, hazmı zor olan besinlerin hazmını kolaylaştırmada kullanılır.");

        List<String> Şifbitkileri6 = new ArrayList<>();
        Şifbitkileri6.add(("---LABADA---\n"));
        Şifbitkileri6.add("Fiyatı 45 tl\n");
        Şifbitkileri6.add("Kanı ve bağırsakları temizler, iştah açıcıdır.\n");
        Şifbitkileri6.add("Yaprakları bedeni güçlendirici bir toniktir\n");
        Şifbitkileri6.add("Kökü müshil etkisi gösterir\n");
        Şifbitkileri6.add("Haşlama harici sarma, yemek, kavurma, ve böreklerde kullanılır.");

        List<String> Şifbitkileri7 = new ArrayList<>();
        Şifbitkileri7.add(("---MİS OTU---\n"));
        Şifbitkileri7.add("Fiyatı 70tl\n");
        Şifbitkileri7.add("Sinirleri uyarır, aybaşı tutukluğunu giderir, iştah açar, safra ifrazatını artırır.\n");
        Şifbitkileri7.add("Haşlama harici her şekilde tüketilir.\n");

        List<String> Şifbitkileri8 = new ArrayList<>();
        Şifbitkileri8.add(("---LEYLEK GAGASI---\n"));
        Şifbitkileri8.add("Fiyatı 105tl\n");
        Şifbitkileri8.add("En belirgin özelliği cilde tazelik ve güzellik kazandırmasıdır.\n");
        Şifbitkileri8.add("İshali keser. Boğazdaki ağrıların geçmesine yardımcı olur. \n");
        Şifbitkileri8.add(" Mide ve bağırsaklarda meydana gelen gazların giderilmesini sağlar.\n");


        if (bitkino == 1){
            System.out.println(Şifbitkileri+"\n\n");
            System.out.println("Satın almak için 1'e Diğer bitkilerin bilgilerini görmek için 2'ye basınız");
            int cevap = scanner.nextInt();
            switch (cevap){
                case 1:
                    Login.sepet(bitkino);
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
                    Login.sepet(bitkino);
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
                    Login.sepet(bitkino);
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
                    Login.sepet(bitkino);
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
                    Login.sepet(bitkino);
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
