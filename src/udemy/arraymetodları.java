package udemy;

import java.util.Arrays;
import java.util.Scanner;

public class arraymetodları {

    public static void array_karsilastirma(int[] a, int[] b) {

        if (Arrays.equals(a, b))
            System.out.println("Esitler");
        else
            System.out.println("Esit degiller");
    }

    public static void main(String[] args) {
        int[] array1 = new int[5];
        int[] array2 = new int[5];

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk dizinizin elemanlarini giriniz: ");
        for (int i = 0; i < 5; i++)
            array1[i] = scanner.nextInt();
        System.out.println("Ikinci dizinizin elemanlarini giriniz: ");
        for (int i = 0; i < 5; i++)
            array2[i] = scanner.nextInt();

        array_karsilastirma(array1,array2);
    }
}