package udemy;

import java.util.Scanner;

public class constructortest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad ve Soyad giriniz:");
        String isim = scanner.nextLine();
        System.out.println("Telefon numaranizi giriniz: ");
        double telefonno = scanner.nextDouble();
        System.out.println("Bakiyenizi giriniz: ");
        double bakiye = scanner.nextDouble();
        System.out.println("Yapmak istediginiz islemi giriniz: ");
        int islem = scanner.nextInt();
        System.out.println("Islem yapacaginiz miktari giriniz: ");
        double miktar = scanner.nextDouble();

        constructor account = new constructor(bakiye, miktar, isim, telefonno);
        account.merhaba(isim);
        if ( islem == 1){
         account.paracekme(bakiye,miktar);
        }
        else if (islem == 2){
            account.parayatırma(bakiye,miktar);
        }
        account.bilgilerigöster();
}
}
