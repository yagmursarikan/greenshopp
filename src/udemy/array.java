package udemy;

import java.util.Scanner;

public class array {

    public static void  array_bastırma (int []array){
          for ( int a=0; a<array.length; a++){
           System.out.println(array[a]);
          }
    }
    public static void array_ort ( int array []){
           int toplam = 0;
          for ( int i=0; i<array.length; i++){
              toplam+= array[i];
          }
          double ort = toplam/array.length;
          System.out.println("Dizinin ortalamasi = "+ort);
    }
    public static void kucuk_buyuk ( int [] array) {
        int enbuyuk = array[0];
        int enkucuk = array[0];

        for (int i = 1; i < array.length; i++) {
            if (enbuyuk > array[i]) {
                enbuyuk = array[i];
            }
            if (enkucuk < array[i]) {
                enkucuk = array[i];
            }
        }
        System.out.println("Dizinizin en buyuk elemani = "+enbuyuk);
        System.out.println("Dizinizin en kucuk elemani = "+enkucuk);
    }

        public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Diziniz kac elamanli olacak giriniz :");
        int length = scanner.nextInt();
        int b = length;
        int [] array = new int[length] ;
        for( int i=0; i<length; i++){
            System.out.println("Dizinizin "+(i+1)+". elemanini giriniz : ");
            array[i] = scanner.nextInt();
        }
       array_bastırma(array);
       array_ort(array);
       kucuk_buyuk(array);
    }

}