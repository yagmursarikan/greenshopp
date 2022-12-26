package nesne1;

import java.util.Scanner;

public class calısma3 {
    public static void main(String[] args) {

        //varyans hesaplama
        Scanner kullanici = new Scanner(System.in);
        double[] sayilar = new double[10];

        System.out.println("Varyansini ve Standart sapmasini hesaplamak istediginiz sayilari gitiniz: ");
        System.out.println("Kac sayi gireceksiniz:");
        int i = 0;

        do {
            System.out.println((i + 1) + ". sayiyi giriniz: ");
            sayilar[i] = kullanici.nextDouble();

        } while (sayilar[i] == 1);




        }
    }
