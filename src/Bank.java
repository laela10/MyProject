import java.util.Scanner;

public class Bank {
    public static void main(String[] args) {
        String bankName;
        String userName;
        Float sukuBunga;
        Float tabunganAw;
        Float lamaMenabung;
        Float bunga;
        Float tabunganAk;
        Scanner laela =
                new Scanner(System.in);
        System.out.println("Nama Bank : ");
        bankName = laela.nextLine();
        System.out.println("Nama User : ");
        userName = laela.nextLine();
        System.out.println("Suku Bunga : ");
        sukuBunga = laela.nextFloat();
        System.out.println("Tabungan Awal : ");
        tabunganAw = laela.nextFloat();
        System.out.println("Lama Menabung : ");
        lamaMenabung = laela.nextFloat();

        bunga = sukuBunga / 100 * lamaMenabung / 12 * tabunganAw;
        tabunganAk = tabunganAw + bunga;

        if(tabunganAk %2 ==0){
            System.out.println("Tabungan Akhir adalah Bilangan Ganjil");
        }else{
            System.out.println("Tabungan Akhir adalah Bukan Bilangan Ganjil");
        }
    }
}