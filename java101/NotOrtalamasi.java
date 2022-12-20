import java.util.Scanner;

public class NotOrtalamasi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mat, fizik, kimya, tarih, turkce;
        double ortalama;
        System.out.println("Matematik notu : ");
        mat = scanner.nextInt();
        System.out.println("Fizik notu : ");
        fizik = scanner.nextInt();
        System.out.println("Kimya notu : ");
        kimya = scanner.nextInt();
        System.out.println("Tarih notu : ");
        tarih = scanner.nextInt();
        System.out.println("Turkce notu : ");
        turkce = scanner.nextInt();
        ortalama = (mat + fizik + kimya + tarih + turkce) / 5.0;
        System.out.println("Ortalamaniz : " + ortalama);
    }
}
