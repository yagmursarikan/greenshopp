package GreenShopp;

import java.util.Scanner;

public class Main {
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
        obje2.giriş();
        Thread.sleep(2000);
        for (int i=0; i<1; i++){
            System.out.println(anamenu);
            System.out.println("Hangi işlemi yapmak istiyorsunuz");
            int islem = scanner.nextInt();
            if (islem == 1){

               obje.isim(1);
               obje2.seçenek();

               Thread.sleep(2000);
                i--;
            }
            else if (islem == 2) {
                obje1.isim(1);
                obje2.seçenek();
                i--;
            }
            else if (islem == 3) {
               System.out.println( "Kullanıcı adınız:"+obje2.Hesabım.getKullanici_adi());
               System.out.println(" Bakiyeniz: "+obje2.Hesabım.getBakiye());
               // obje2.sepet(1);
                Thread.sleep(2000);
                i--;
            }
            else if (islem == 4) {
              //  obje2.ödeme();
                obje2.sepet(obje2.getCevap3());
                i--;

            }
            else if(islem==5){
                System.out.println("Programdan çıkılıyor...");
                Thread.sleep(2000);
            break;
            }
            else {
                i--;
                break;
            }
           continue;
        }

    }

}
