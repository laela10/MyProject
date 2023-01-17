public class Kelas1B {

    private int JumlahSiswa;
    private int JumlahKursi;
    private String WarnaPapantulis;
    private int JumLahAC;
    private String merkProj;

    public Kelas1B(){
    }
    public Kelas1B(int Jumsiswa, int kursi, String papan,int ac, String merkproj) {
        this.JumlahSiswa = Jumsiswa;
        this.JumlahKursi = kursi;
        this.WarnaPapantulis = papan;
        this.JumLahAC = ac;
        this.merkProj = merkproj;
    }
    public static void main(String[] args) {
        Kelas1B s = new Kelas1B();
        s.setJumlahSiswa(30);
        s.setJumlahKursi(45);
        s.setWarnaPapantulis("Putih");
        s.setJumLahAC(2);
        s.setMerkProj("Acer");

        System.out.println(s.getJumlahSiswa());
        System.out.println(s.getJumlahKursi());
        System.out.println(s.getWarnaPapantulis());
        System.out.println(s.getJumLahAC());
        System.out.println(s.getMerkProj());
    }

    public int getJumlahSiswa() {
        return JumlahSiswa;
    }

    public void setJumlahSiswa(int jumlahSiswa) {
        JumlahSiswa = jumlahSiswa;
    }

    public int getJumlahKursi() {
        return JumlahKursi;
    }

    public void setJumlahKursi(int jumlahKursi) {
        JumlahKursi = jumlahKursi;
    }

    public String getWarnaPapantulis() {
        return WarnaPapantulis;
    }

    public void setWarnaPapantulis(String warnaPapantulis) {
        WarnaPapantulis = warnaPapantulis;
    }

    public int getJumLahAC() {
        return JumLahAC;
    }

    public void setJumLahAC(int jumLahAC) {
        JumLahAC = jumLahAC;
    }

    public String getMerkProj() {
        return merkProj;
    }

    public void setMerkProj(String merkProj)
        this.merkProj = merkProj;
