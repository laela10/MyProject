public class Looping {
    public static void main(String[] args) {
        //cetak angka dari 1 sampai dengan 5

        for (int angka = 1; angka <= 5; angka++) {
            System.out.println("Angkanya adalah : " + angka);
        }
        int hitung = 0;
        do {
            System.out.println(" hitung ke = " + hitung);
            hitung++;
        } while (hitung <=5 );
        int counter = 0;
        while (counter <= 5){
            System.out.println("counter ke = " +counter);
            counter++;
        }
    }
}
