package nesne1;

import java.util.Scanner;

public class calısma6 {
    public static void merhaba(String isim){
        System.out.println("merhaba "+isim);
    }
    public static void vucutkitle( Float boy, Float kilo) {

        Float kitle = kilo / (boy * boy);
        System.out.println("Vucut kitle indeksiniz = " + kitle);
        float idealkilo =0;
        idealkilo = (float) (24.99*(boy*boy));
        Float verkilo ;
        Float alkilo ;
        verkilo = (Float) (kilo - idealkilo);

        float idealkilo2;
        idealkilo2 = (float) ( 18.5*(boy*boy));
        alkilo =  (Float) (idealkilo2 - kilo);

            if (kitle < 18.5) {
                System.out.println("Olmasi gereken degerden dusuk ciktiniz. Zayif kategorisindesiniz");
                System.out.println("Ideal kiloda olmak icin en az almaniz gereken kilo = "+alkilo+"kg");
            }
            else if (kitle >= 18.5 && kitle <= 24.99) {
                System.out.println("Ideal kilodasiniz. Tebrikler.");
            }
            else if (kitle >= 25 && kitle <= 29.99) {
                System.out.println("Ideal kilonuzun ustundesiniz. Fazla kilolu kategorisindesiniz");
                System.out.println("Ideal kiloda olmak icin en az vermeniz kilo = "+verkilo+"kg");
            }
            else if (kitle >= 30) {
                System.out.println("Olmaniz gereken kilonun cok fazla ustundesiniz. Obezite kategorisindesiniz");
                System.out.println("Ideal kiloda olmak icin en az vermeniz kilo = "+verkilo+"kg");
            }
        }
    public static void main(String[] args) {
        Scanner kullanici = new Scanner(System.in);
      System.out.println("İsminiz nedir ?");
      String isim = kullanici.nextLine();
      merhaba(isim);
      System.out.println("Boyunuzu giriniz: ");
      Float boy = kullanici.nextFloat();
      System.out.println("Kilonuzu giriniz :");
      Float kilo = kullanici.nextFloat();
      vucutkitle(boy,kilo);
    }
    }