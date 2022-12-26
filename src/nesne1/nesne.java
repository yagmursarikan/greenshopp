package nesne1;

import java.util.Scanner;

public class nesne {

    public static void borchesaplama(float borc, float ödeme) {
        double kalan = ödeme - borc;

        if (kalan >= 0) {
            System.out.println("Para ustunuz = " + kalan);

            int ikiyuzluk = (int) (kalan / 200);
            if (ikiyuzluk > 0) {
                kalan = kalan - ikiyuzluk*200;
                System.out.println(ikiyuzluk + "adet 200 tl'lik banknot");
            }
            int yuzluk = (int) (kalan / 100);
            if (yuzluk > 0) {
                kalan = kalan - yuzluk*100;
                System.out.println(yuzluk + "adet 100 tl'lik banknot");
            }
            int ellilik = (int) (kalan / 50);
            if (ellilik > 0) {
                kalan = kalan - ellilik*50;
                System.out.println(ellilik + "adet 50 tl'lik banknot");
            }
            int yirmilik = (int) (kalan / 20);
            if (yirmilik> 0) {
                kalan = kalan - yirmilik*20;
                System.out.println(yirmilik + "adet 20 tl'lik banknot");
            }
            int onluk = (int) (kalan / 10);
            if (onluk > 0) {
                kalan = kalan - onluk*10;
                System.out.println(onluk + "adet 10 tl'lik banknot");
            }
            int beslik = (int) (kalan / 5);
            if (beslik > 0) {
                kalan = kalan - beslik*5;
                System.out.println(beslik + "adet 5 tl'lik banknot");
            }
            int birlik = (int) (kalan / 1);
            if (birlik > 0) {
                kalan = kalan - birlik*1;
                System.out.println(birlik + "adet 1 tl'lik demir para");
            }
            int ellikurus = (int) (kalan / 0.5);
            if (ellikurus > 0) {
                kalan =  (kalan - ellikurus / 2);
                System.out.println(ellikurus + "adet 50 kurusluk demir para ");
            }
            int yirmibes = (int) (kalan / 0.25);
            if (yirmibes > 0) {
                System.out.println(yirmibes + "adet 25 kurusluk demir para");
            }
        }
    }


    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);

        System.out.println("Borcunuzu giriniz: ");
        Float borc = kullanici.nextFloat();
        System.out.println("Odeyeceginiz miktari giriniz : ");
        Float ödeme = kullanici.nextFloat();
        borchesaplama(borc, ödeme);

    }

}
