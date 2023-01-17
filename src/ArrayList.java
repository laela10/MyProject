public class ArrayList {
        public static void main(String[] args) {
            //Deklarasi arraylist
            ArrayList<String> Kalimat = new ArrayList<>();
            Kalimat.add(0, "Hello");
            Kalimat.add(1, "Kelas 1B");
            for (int index = 0; index < Kalimat.size(); index++) {
                System.out.println(Kalimat.get(index));
            }
            //Buatlah code untuk memasukkan angka dari 10 sampai 40
            //ke dalam arraylist AngkaSaya
            ArrayList<Integer> AngkaSaya = new ArrayList<>();
            int index = 0;
            for (int number=10;number<=40;number++) {
                AngkaSaya.add(index,number);
                index++;
            }
            for (int i = 0; i < AngkaSaya.size(); i++) {
                System.out.println(AngkaSaya.get(i));
            }
        }
    }
