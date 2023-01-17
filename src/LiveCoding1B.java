import java.util.Scanner;

public class LiveCoding1B {
    public static void main(String[] args) {
        // Menghitung perkalian 3 angka
        int angka1;
        int angka2;
        int angka3;
        int hasil;

        Scanner laela = new Scanner(System.in);
        System.out.println("Angka1 :");
        angka1 = laela.nextInt();
        System.out.println("Angka2 :");
        angka2 = laela.nextInt();
        System.out.println("Angka3 :");
        angka3 = laela.nextInt();

        hasil = angka1 * angka2 * angka3;
        System.out.println("Hasil Perkalian = " + hasil);
        if (hasil % 3 == 0) {
            System.out.println("Kelipatan 3");
        }
    }
}
