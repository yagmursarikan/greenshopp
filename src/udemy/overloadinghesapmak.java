package udemy;

import java.util.Scanner;

public class overloadinghesapmak {
    public static int toplama( int a, int b){
        return (a+b);
    }
    public static int toplama(int a,int b,int c){
        return (a+b+c);
    }
    public static int cikarma(int a, int b){
        return (a-b);
    }
    public static double bolme (int a,int b){
        return (double)(a/b);
    }
    public static int carpma (int a,int b){
        return (a*b);
    }
    public static int carpma (int a,int b,int c){
        return (a*b*c);
    }

    public static void main(String[] args) {
        System.out.println("Islemler");
        System.out.println("1-toplama ");
        System.out.println("2-cikarma");
        System.out.println("3-bolme");
        System.out.println("4-carpma");
        System.out.println("Cikis yapmak icin a ya basiniz");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Yapmak istediginiz islemi giriniz: ");
            String islem = scanner.nextLine();
            if (islem.equals("1")) {
                System.out.println("Kac sayi toplayacaksiniz: ");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("Girdiginiz sayilarin toplami "+toplama(a, b));

                } else if (kacsayi == 3) {
                    System.out.println("a:");
                    int c = scanner.nextInt();
                    System.out.println("b:");
                    int d = scanner.nextInt();
                    System.out.println("c:");
                    int e = scanner.nextInt();
                    System.out.println("Girdiginiz sayilarin toplami "+toplama(c, d, e));
                }
            } else if (islem.equals("2")) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin farki "+cikarma(a, b));

            } else if (islem.equals("3")) {
                System.out.println("a:");
                int a = scanner.nextInt();
                System.out.println("b:");
                int b = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin bolumu "+bolme(a,b));

            } else if (islem.equals("4")) {
                System.out.println("Kac sayi carpacaksiniz: ");
                int kacsayi = scanner.nextInt();
                if (kacsayi == 2) {
                    System.out.println("a:");
                    int a = scanner.nextInt();
                    System.out.println("b:");
                    int b = scanner.nextInt();
                    System.out.println("Girdiginiz sayilarin carpimi "+carpma(a, b));

                }
                 else if (kacsayi == 3){
                    System.out.println("a:");
                int c = scanner.nextInt();
                System.out.println("b:");
                int d = scanner.nextInt();
                System.out.println("c:");
                int e = scanner.nextInt();
                System.out.println("Girdiginiz sayilarin carpimi "+carpma(c, d, e));

            }

        }
            else if (islem.equals("a")){
                System.out.println("Programdan cikiliyor..");
                break;
            }
            else
                System.out.println("Gecersiz islem");
        }
    }
}