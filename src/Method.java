public class Method {
    public class Inventory{
        public String kodebarang;
        public String namaBarang;
        public Inventory(String kdbrg, String nmbrg){
            this.kodebarang = kdbrg;
            this.namaBarang = nmbrg;
        }
    }
    public static void Penjumlahan(){
        int angka1=3;
        int angka2=4;
        int hasil_jumlah = angka1 + angka2;
        System.out.println(hasil_jumlah);
    }

    public static void CetakJudul(){
        System.out.println("Belajar Method");
    }

    public static void CetakSemuaAngka(int[] myNumber){
        for(int index = 0;index< myNumber.length;index++){
            System.out.println(myNumber[index]);
        }
    }

    public static void Perkalian(int number1, int number2, String status){
        int hasil_kali = number1 + number2;
        System.out.println(status + " " + hasil_kali);
    }
    public static void main(String[] args){
        Inventory[] Buku = new Inventory[50000];
        Inventory[] Pensil =  new Inventory[90];
        CetakJudul();
        Penjumlahan();
        Perkalian(4,5,"Hasilnya adalah");

        int[] angka = {2,5,7,9,11};
        CetakSemuaAngka(angka);
    }
}
