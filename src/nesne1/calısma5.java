package nesne1;

import java.util.Scanner;

public class calısma5 {
    public static void main(String[] args) {

        Scanner kullanici = new Scanner(System.in);
        System.out.println("Cumle veya kelime giriniz :");
        String kelime = kullanici.nextLine();
        System.out.println("Konrtol etmek istediginiz harfi giriniz : ");
        char harf = kullanici.next().charAt(0);
         harfbul(kelime,harf);
        }
        static void harfbul (String kelime , char harf){
        int sayac = 0;
        for (int i=0; i<kelime.length(); i++ ){

            if ( kelime.charAt(i) == harf){
             sayac++;
            }
        }
        System.out.println("Girdiginiz cumlede '"+harf+"' harfi"+sayac+" kez tekrarlanmis");
        }
    }