public class Spidol {
    private String WarnaTutup;
    private String Tinta;
    private String Merk;

    public Spidol(){
    }
    public Spidol(String warna,String tnt, String mrk){
        this.WarnaTutup = warna;
        this.Tinta = tnt;
        this.Merk = mrk;
    }
    public void CetakDetail(){
        System.out.println(this.WarnaTutup);
        System.out.println(this.Tinta);
        System.out.println(this.Merk);
    }
    public static void main(String[] args){
        Spidol snw = new Spidol();
        snw.WarnaTutup = "Merah";
        snw.Tinta = "Merah";
        snw.Merk = "u";
        snw.CetakDetail();

        Spidol sp = new Spidol("Biru","Biru","A");
        sp.CetakDetail();

        Spidol[] spidol1 = new Spidol[100];
        for(int index=0; index< spidol1.length;index++){
        }
    }
}
