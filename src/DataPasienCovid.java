import java.util.Random;
import java.util.Scanner;

public class DataPasienCovid {
    int jumlahvaksin = 3; // Pfizer,Sinopharm,Moderna
    static int totalJumlahPenerimaVaksin = 12; //diubah sesuai soal
    public static String[] Pfizer = new String[4];
    public static String[] Sinopharm = new String[4];
    public static String[] Moderna = new String[4];

    public static void PrintInfoPasienVaksin(){
        int totalPfizer=0;
        int totalSisaKuota = 0;
        for(int index=0;index<Pfizer.length;index++){
            if(Pfizer[index] != null){
                totalPfizer++;
            }
        }
        int totalSinopharm=0;
        for(int index=0;index<Sinopharm.length;index++){
            if (Sinopharm[index] != null){
                totalSinopharm++;
            }
        }
        int totalModerna=0;
        for(int index=0;index<Moderna.length;index++){
            if (Moderna[index] != null){
                totalModerna++;
            }
        }
        totalSisaKuota = totalJumlahPenerimaVaksin - totalPfizer - totalSinopharm - totalModerna;
        System.out.println("Total Pasien Pfizer; " + totalPfizer + " | Total Pasien Sinopharm: " + totalSinopharm +"| TotalPasien Moderna: " + totalModerna);
        System.out.println("Jumlah Seluruh Vaksin : "+ totalJumlahPenerimaVaksin + " | Total Sisa Kuota: " + totalSisaKuota);
        System.out.println();
    }
    public static void CheckIndexArray(String[] myArray,String pasien) {
        int indexNow = 0;
        for (int index = 0; index < myArray.length; index++) {
            if (myArray[index] != null) {
            }
        }
        if (indexNow < myArray.length) {
            myArray[indexNow] = pasien;
        }
    }
    public static void simpanPasien(int angkaRandom, String pasien) {
        switch (angkaRandom) {
            case 1:
                CheckIndexArray(Pfizer, pasien);
                System.out.println("Anda Mendapat Vaksin Pfizer");
                PrintInfoPasienVaksin();
                break;
            case 2:
                CheckIndexArray(Sinopharm, pasien);
                System.out.println("Anda Mendapat Vaksin Sinopharm");
                PrintInfoPasienVaksin();
                break;
            case 3:
                CheckIndexArray(Moderna, pasien);
                System.out.println("Anda Mendapat Vaksin Moderna");
                PrintInfoPasienVaksin();
                break;
        }
    }
    public static void inputPasien() {
        Scanner inputData = new Scanner(System.in);
        while (true) {
            System.out.println("Nama Pasien =");
            String namaPasien = inputData.nextLine();
            if (namaPasien.isBlank()) {
                System.out.println("Nama Pasien wajib diisi");
                inputPasien();
            } else {
                Random hasilRandom = new Random();
                int JenisRandom = hasilRandom.nextInt(3) + 1;
                simpanPasien(JenisRandom, namaPasien);
            }
        }
    }
    public static void main(String[] args){
        inputPasien();
//
    }
}