package nesne1;

import java.util.Scanner;

public class calısma {

    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Dizinizin uzunlugunu giriniz : ");
        int lenght = kullanici.nextInt();
        float [] dizi1 =  new float [lenght];

        System.out.println("Dizinizin elemanlarini giriniz : ");
        for ( int i=0 ; i<lenght; i++){
            System.out.println("Dizinin "+(i+1)+". elemanini giriniz: ");
            dizi1[i] = kullanici.nextFloat();
        }

        System.out.println("Girdiginiz dizi :");
        for (int a=0; a<lenght; a++){
            System.out.print(dizi1[a]+"  ");
        }
        System.out.println("");

        System.out.println("Girdiginiz dizinin tersten yazilmis hali :");

        for ( int j=lenght-1; j>=0; j--){

            System.out.print(dizi1[j]+"  ");
        }

    }
    }


