package udemy;

import java.util.Scanner;

public class oop1test {
    public static void main(String[] args) {

    araba araba1 = new araba();

    Scanner scanner = new Scanner(System.in);

    System.out.println("Arabanizin uretildigi yili giriniz:");
        araba1.setYıl(scanner.nextInt());
    System.out.println("Arabanizin tekerlek sayisini giriniz: ");
        araba1.setTekerleksayisi(scanner.nextInt());
        System.out.println("Arabanizin kapi sayisini giriniz: ");
        araba1.setKapısayisi(scanner.nextInt());
        System.out.println("Arabanizin modelini giriniz: ");
        araba1.setModel(scanner.next());
        System.out.println("Arabanizin rengini giriniz: ");
        araba1.setRenk(scanner.next());
    }
}
