package YedekProje;

import GreenShopp.DekorasyonBitkilerii;
import GreenShopp.Login;
import GreenShopp.ŞifalıBitkilerr;

import java.util.Scanner;

public class MainYedek {
    public static void main (String [] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        DekorasyonBitkilerii obje = new DekorasyonBitkilerii();
        ŞifalıBitkilerr obje1 = new ŞifalıBitkilerr();
        Login obje2 = new Login();
        String anamenu = "1.Dekarasyon bitkileri\n" +
                "2.Sifali bitkiler\n" +
                "3.Hesabim\n" +
                "4.Sepet ve Ödeme\n"+
                "5.Programdan cik ";
        System.out.println("\n****GREEN SHOP***\n");
        for (int i=0; i<1; i++){
            System.out.println(anamenu);
            System.out.println("Hangi işlemi yapmak istiyorsunuz");
            int islem = scanner.nextInt();
            if (islem == 1){

                obje.isim(1);
                obje2.seçenek();
                i--;
            }
            else if (islem == 2) {
                obje1.isim(1);
                obje2.seçenek();
                i--;
            }
            else if (islem == 3) {
                obje2.giriş();
                i--;
            }
            else if (islem == 4) {
                //  obje2.ödeme();
                obje2.sepet(1);
            }
            else{
                System.out.println("Programdan çıkılıyor...");
                break;}
            continue;
        }

    }

}
