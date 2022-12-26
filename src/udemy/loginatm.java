package udemy;

import java.util.Scanner;

public class loginatm {
    public  boolean login(hesap hesap){
        Scanner scanner= new Scanner(System.in);
        String kullanici_ad;
        String password;

        System.out.println("Kullanici adinizi giriniz: ");
        kullanici_ad = scanner.nextLine();
        System.out.println("Sifrenizi giriniz: ");
        password = scanner.nextLine();

        if(hesap.getKullanici_ad().equals(kullanici_ad) && hesap.getPassword().equals(password)){
            return true;
        }
        else
            return false;
    }
}