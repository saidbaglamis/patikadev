import java.util.Scanner;

public class Kdv {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double tutar, kdv;

        System.out.println("Ucret tutarini giriniz : ");
        tutar = scanner.nextInt();
        kdv = tutar >= 1000 ? 0.08 : 0.18;
        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV'li tutar : " + (tutar + tutar * kdv));
        System.out.println("KDV tutarı : " + (tutar * kdv));
    }
}
