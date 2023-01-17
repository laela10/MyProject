public class BumbuKuning {

    private int JumBwPutih;
    private int JumBwMerah;
    private int JumKemiri;
    private int JumGaram;
    private int JumKunyit;

    public int getJumBwPutih() {

        return JumBwPutih;
    }

    public void setJumBwPutih(int jumBwPutih) {

        JumBwPutih = jumBwPutih;
    }

    public int getJumBwMerah() {

        return JumBwMerah;
    }

    public void setJumBwMerah(int jumBwMerah) {

        JumBwMerah = jumBwMerah;
    }

    public int getJumKemiri() {

        return JumKemiri;
    }

    public void setJumKemiri(int jumKemiri) {

        JumKemiri = jumKemiri;
    }

    public int getJumGaram() {

        return JumGaram;
    }

    public void setJumGaram(int jumGaram) {

        JumGaram = jumGaram;
    }

    public int getJumKunyit() {

        return JumKunyit;
    }

    public void setJumKunyit(int jumKunyit) {

        JumKunyit = jumKunyit;
    }

    public int getJumMicin() {

        return JumMicin;
    }

    public void setJumMicin(int jumMicin) {

        JumMicin = jumMicin;
    }

    public int getJumSere() {

        return JumSere;
    }

    public void setJumSere(int jumSere) {

        JumSere = jumSere;
    }

    private int JumMicin;
    private int JumSere;

    public BumbuKuning() {
        System.out.println("Bumbu Kuning Processing...");
    }

    public void CetakResep(BumbuKuning isiResep, String namaResep) {
        System.out.println("Nama Resep :" + namaResep);
        System.out.println("Bawang PUtih :" + isiResep.getJumBwPutih());
        System.out.println("Bawang Merah :" + isiResep.getJumBwMerah());
        System.out.println("Kemiri :" + isiResep.getJumKemiri());
        System.out.println("Garam :" + isiResep.getJumGaram());
        System.out.println("Kunyit :" + isiResep.getJumKunyit());
        System.out.println("Micin :" + isiResep.getJumMicin());
        System.out.println("Sere :" + isiResep.getJumSere());
    }

    public static void main(String[] args) {
        BumbuKuning Gulai = new BumbuKuning();
        Gulai.setJumBwPutih(4);
        Gulai.setJumBwMerah(5);
        Gulai.setJumKemiri(6);
        Gulai.setJumGaram(7);
        Gulai.setJumKunyit(8);
        Gulai.setJumMicin(9);
        Gulai.setJumSere(10);

        //Membuat method CetakResep(BumbuKuning isiResep, String namaResep)
        Gulai.CetakResep(Gulai, "Gulai");
        ArrayList<BumbuKuning> AyamGoreng = new ArrayList<>();
        int jumlahYangDigoreng = 5
        for(int index=0;index<jumlahYangDigoreng;index++){
            BumbuKuning bumbu = new BumbuKuning();
        bumbu.setJumBwPutih(4);
        bumbu.setJumBwMerah(5);
        bumbu.setJumKemiri(6);
        bumbu.setJumGaram(7);
        bumbu.setJumKunyit(8);
        bumbu.setJumMicin(9);
        bumbu.setJumSere(10);
        AyamGoreng.add(bumbu);
        System.out.println("jumlah ayam goreng :" + AyamGoreng.size());