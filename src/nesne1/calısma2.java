package nesne1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class calısma2 {
    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);

        System.out.println("Kac ogrencinin bilgisini gireceksiniz: ");
        int kisi = kullanici.nextInt();
        String[] isim = new String[kisi];
        int[] voleybol = new int[kisi];
        double[] ortalama = new double[kisi];

        for (int i = 0; i < kisi; i++) {

            System.out.println((i + 1) + ". ogrencinin adini giriniz");
            isim[i] = kullanici.next();
            System.out.println((i + 1) + ". ogrencinin ortalamasini giriniz : ");
            ortalama[i] = kullanici.nextDouble();
            System.out.println((i + 1) + ". ogrencinin voleybola gidip gitmedigini giriniz: ");
            System.out.println(" evet = 1    hayir = 2");
            voleybol[i] = kullanici.nextInt();
        }
        double ort2 = 0;
        double ort3 = 0;
        double sayac1 = 0;
        double sayac2 = 0;

        System.out.println("Voleybola giden ogrencilerin isimleri : ");
        for (int j = 0; j < kisi; j++) {

            if (voleybol[j] == 1) {
                sayac1++;
                ort2 += ortalama[j];
                System.out.println(isim[j]);
            }
            }
        System.out.println("Voleybola gitmeyen ogrencilerin isimleri : ");
            for (int a = 0; a < kisi; a++) {
                if (voleybol[a] == 2) {
                    sayac2++;
                    ort3 += ortalama[a];
                    System.out.println(isim[a]);
                }
            }
            double ortort = (ort2 / sayac1);
            double ortort2 = (ort3 / sayac2);
            System.out.println("Voleybola giden orenci sayisi = " + sayac1);
            System.out.print("Bu ogrencilerin ortalamalarinin ortalamasi = " );
            System.out.println( new DecimalFormat("##.##").format(ortort));

            System.out.println("Voleybola gitmeyen ogrenci sayisi = " + sayac2);
            System.out.println("Bu ogrencilerin ortalamasi = " );
            System.out.println( new DecimalFormat("##.##").format(ortort2));
        }
    }
