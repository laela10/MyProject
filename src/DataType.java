public class DataType {
    //Primitive Data Type
    // int. double, float, byte, long, char
    public static void main(String[] args) {
        // Menghitung luas dan keliling persegi panjang
        int panjang;
        int lebar;
        int luas;
        int keliling;

        panjang = 4;
        lebar = 5;
        luas = panjang * lebar;
        keliling = 2 *(panjang+lebar );

        System.out.println("Luas persegi panjang adalah " + luas);
        System.out.println("Keliling persegi panjang adalah " + keliling);

        //karakter
        char huruf;
        huruf = 'b';
        if(huruf=='b'){
            System.out.println("Hurufnya adalah " + huruf);
        }else{
            System.out.println("Huruf bukan b");
        }
    }
}