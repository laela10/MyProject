import java.util.Scanner;

public class Factorial {
    public static void main(String[]args)  {
        Scanner userInput = new Scanner(System.in);
        int angka, faktor;

        System.out.println("Masukan angka faktorial : ");
        angka = userInput.nextInt();
        faktor=1;
        for(int i=1;i<=angka;i++){
            faktor*=i;
        }
        System.out.println("Nilai faktorial dari "+angka+" adalah "+faktor);
    }
}
