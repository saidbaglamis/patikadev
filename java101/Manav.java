import java.util.Scanner;

public class Manav {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armut;
        int elma;
        int domates;
        int muz;
        int patlican;
        double toplam;

        System.out.println("Armut Kac Kilo : ");
        armut = scanner.nextInt();
        System.out.println("Elma Kac Kilo : ");
        elma = scanner.nextInt();
        System.out.println("Domates Kac Kilo :");
        domates = scanner.nextInt();
        System.out.println("Muz Kac Kilo : ");
        muz = scanner.nextInt();
        System.out.println("Patlican Kac Kilo : ");
        patlican = scanner.nextInt();
        toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11) + (muz * 0.95) + (patlican * 5.0);
        System.out.printf("%.2f TL", toplam);


    }
}
