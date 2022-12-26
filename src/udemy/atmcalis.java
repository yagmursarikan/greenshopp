package udemy;

import java.util.Scanner;

public class atmcalis {
    public void calis(hesap hesap){
        loginatm login = new loginatm();
        Scanner scanner=new Scanner(System.in);
        System.out.println("BANKAMIZA HOSGELDİNİZ");
        System.out.println("***************");
        System.out.println("Kullanici girisi");
        System.out.println("");
        int girishakki = 3;
        while (true){
            if(login.login(hesap)){
                System.out.println("giris basarili");
                break;
            }
            else {
                girishakki--;
                System.out.println("Giris basarisiz. ");
                System.out.println("Kalan giris hakkinizi="+girishakki);
            }
            if (girishakki==0){
                System.out.println("Giris hakkiniz doldu programdan cikiliyor..");
                return;
            }
        }
        String islemler = "1.Bakiye sorgulama/n"
                          +"2.Para cekme/n"
                          +"3.Para yatırma/n"
                          +"Cıkıs için q'ya basın";
        System.out.println(islemler);
        String islem = scanner.next();
        scanner.nextLine();
        while (true) {
            if (islem.equals("q")) {
                break;
            } else if (islem == "1") {
                System.out.println("Bakiyeniz = " + hesap.getBakiye());
            } else if (islem == "2") {
                System.out.println("Islem yapmak istediginiz tutarı giriniz: ");
                double tutar = scanner.nextDouble();
                hesap.para_cekme(tutar);
            } else if (islem == "3") {
                System.out.println("Islem yapmak istediginiz tutarı giriniz:");
                double tutar = scanner.nextDouble();
            } else {
                System.out.println("Gecersiz karakter girdiniz:");

            }
        }
    }

}
