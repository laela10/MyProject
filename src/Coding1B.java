public class Coding1B {
    public static int HasilJumlah() {
        int a = 3;
        int b = 2;
        int hasil = a + b;
        return hasil;
    }

    public static String CetakJudul() {
        return "Judul Saya";
    }

    public static int[] ArrayNumber() {
        int[] angkaArray = new int[]{1, 2, 3, 4};
        return angkaArray;//isi angkaArray adalah 1,2,3,4
    }

    public static double HitungRata(double a, double b) {
        double hasil = (a + b) / 2;//hasilnya 5.5
        return hasil; //5.5 dikembalikan kepada yang memanggil
    }

    public static void main(String[] args) {
        int hasilku = HasilJumlah();
        System.out.println("Hasil Jumlah adalah = " + hasilku);

        String title = CetakJudul(); // title = "Judul Saya"
        System.out.println("Judulnya adalah = " + title);

        int[] angkaSaya = ArrayNumber(); // isi dari angkaSaya adalah 1,2,3,4
        for (int angka : angkaSaya) {
            System.out.println("Angka adalah = " + angka);
        }

        double ratarata = HitungRata(5, 6); //ratarata = 5.5
        System.out.println("Rata-rata adalah = " + ratarata);
    }
}