package ders;

import java.util.Scanner;

public class sayiii {
    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);
        int i =0;
        int [] sayilar = new int [10];
        int kontrolsayi;
        int sayac = 0;

        for ( i=0; i<10; i++){
            System.out.println(i+1+".sayiyi giriniz: ");
            sayilar [i] = kullanici.nextInt();
        }
        System.out.println("Kontrol etmek istediginiz sayiyi giriniz: ");
        kontrolsayi = kullanici.nextInt();

        for ( int j=0; j<10; j++){
            if ( sayilar [j]== kontrolsayi){

                sayac++;
                System.out.println(j+1+". sayi");

            }
        }
        if ( sayac>0) {
            System.out.println(kontrolsayi + " sayisi bulundu ");
            System.out.println(sayac+" kere tekrarlandi");
        }
        else {
            System.out.println("Girdiginiz sayi bulunamadi");
        }

        System.out.println("Girdiginiz sayilar sirasiyla söyle :");
        for ( int a=0 ; a<10; a++){
            System.out.println(sayilar[a]);
        }
        System.out.println("************");
        int enbuyuk = sayilar[0];
        int enkucuk = sayilar[0];

        for ( int b=1; b<10; b++){

            if ( enkucuk >= sayilar[b]){
                enkucuk = sayilar[b];
            }
            else if( enbuyuk <= sayilar[b]) {
                enbuyuk = sayilar[b];
            }
        }

        System.out.println("Girdiginiz sayilardan en buyugu = "+enbuyuk);
        System.out.println("Girdiginiz sayilardan en kucugu = "+enkucuk);
        System.out.println("");
        System.out.println("**************");
        System.out.println("Silmek istediginiz sayi var mi ? (evet = 1  hayir = 2)");
        int cevap = kullanici.nextInt();

        int sayac2=0;

        if ( cevap == 1 ){

            System.out.println("Silmek istediginiz sayiyi giriniz ");
            int sil = kullanici.nextInt();

            for (int c=0; c<10; c++){

                if( sil == sayilar[c]){
                    System.out.println("Silmek istedginiz sayi bulundu");
                    sayac2++;
                }
            }
            System.out.println("");
            System.out.println("**************");
            if ( sayac2 <= 0){
                System.out.println("Silmek istedginiz sayi bulunamadi ");
            }
            else if ( sayac2 > 0){
                System.out.println ("Sildiginiz sayidan sonra sayilar : ");
                for ( int d=0; d<10; d++){
                    if ( sayilar[d] != sil ){
                        System.out.println(sayilar[d]);
                    }
                }
            }

        }
        else if ( cevap == 2){
            System.out.println("Program sonlandiriliyor..!");
        }
    }
}

