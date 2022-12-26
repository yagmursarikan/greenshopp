package YedekProje;

import GreenShopp.Login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DekırarsyonBitkileriYedek implements BitkiYedek {
    Scanner scanner = new Scanner(System.in);
    //  Login logobje = new Login();

    @Override
    public void isim(int no) {
        String [] Dekisim = {"ANTROYUM","ZEZE BİTKİSİ"};
        for ( int i=0; i<Dekisim.length; i++){
            System.out.println(Dekisim[i]);
        }
    }

    @Override
    public double fiyat(int numara) {
        int [] Dekfiyat = {120,110};

        return Dekfiyat [numara];
    }


    @Override
    public void Bitki_Bilgileri(int bitkino) {
        ArrayList<String> Dekbitkileri=new ArrayList<>();
        Dekbitkileri.add("ANTROYUM\n");
        Dekbitkileri.add("Fiyatı 120 tl\n");
        Dekbitkileri.add("Antoryum haftalarca süren kalp şeklindeki çarpıcı" +
                " kırmızı veya pembe çiçeklere sahiptir. \n");
        Dekbitkileri.add("Çok fazla parlak, dolaylı ışığa ihtiyacı vardır.\n");
        Dekbitkileri.add("Sulamalar arasında toprağın biraz kurumasını bekleyin.\n");

        List<String> Dekbitkileri2 = new ArrayList<>();
        Dekbitkileri2.add(("---ZEZE BİTKİSİ---\n"));
        Dekbitkileri2.add("Fiyatı 110tl\n");
        Dekbitkileri2.add("Parlak, mumsu görünümlü yapraklara sahiptir.\n");
        Dekbitkileri2.add(" Karanlık köşelerde rahatlıkla bakılabilir\n");
        Dekbitkileri2.add("Birkaç hafta sulamayı unutsanız bile hayatta kalan en " +
                "sert ev bitkilerinden biridir.");

        List<String> Dekbitkileri3 = new ArrayList<>();
        Dekbitkileri2.add(("------\n"));
        Dekbitkileri2.add("Fiyatı 110tl\n");
        Dekbitkileri2.add(".\n");
        Dekbitkileri2.add(" \n");
        Dekbitkileri2.add(".");

        if (bitkino == 1){
            System.out.println(Dekbitkileri+"\n\n");
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
            System.out.println(Dekbitkileri2);
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
            System.out.println(Dekbitkileri3);
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
