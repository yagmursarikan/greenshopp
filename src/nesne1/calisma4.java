package nesne1;

import java.util.Random;
import java.util.Scanner;

public class calisma4 {
    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Kac tane sayi bulmak istiyosununz ?");
        int tane = kullanici.nextInt();

        int [] dizi = new int[tane];
        int cift =0;
        int tek =0;
        int sayac=0;
        int sayac1=0;

        for( int i=0; i<tane; i++){

            dizi [i] = (int) (Math.random()*100);
        }
        for ( int j=0; j<tane; j++){
            float mod = dizi[j]%2;

            if (mod == 0){
                cift += dizi[j];
                sayac++;
            }
            else if (mod != 0){
                tek += dizi[j];
                sayac1++;
            }
        }

        System.out.println("Uretilen sayilardan "+sayac+" tanesi cift sayidir");
        System.out.println("Bu sayilarin toplami = "+cift+"dir");

        System.out.println("Uretilen sayilardan "+sayac1+" tanesi tek sayidir");
        System.out.println("Bu sayilarin toplami = "+tek+"dir");

    }

}
