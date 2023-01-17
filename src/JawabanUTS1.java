public class JawabanUTS1 {
    public static void main(String[] args) {
        String[] nama = new String[] {"Jesicca", "Cassandra", "Phillip"};

        //memasukkan value ke dalam array String nama
        nama[1] = "Jesicca";
        nama[2] = "Cassandra";
        nama[3] = "Phillip";
    }
    public static void JumlahKarakterDouble (String[]nama){
        for(int index = 0; index < nama.length; index++) {
            System.out.println(nama[index]);
        }
        }
        public static void CetakNama (String[] args){
        String[] nama = {"Jesicca", "Cassandra", "Phillip"};
        JumlahKarakterDouble(nama);
    }
}