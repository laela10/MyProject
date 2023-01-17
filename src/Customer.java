import java.sql.SQLOutput;

public class Customer {
    private String NIK;
    private String Nama;

    public String getNIK() {
        return NIK;
    }

    public void setNIK(String NIK) {
        this.NIK = NIK;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) {
        NoTelp = noTelp;
    }

    private String Alamat;
    private String NoTelp;
    public Customer(){
    }
    public Customer(String nik, String nama, String alamat, String notelp){
        this.NIK = nik;
        this.Nama = nama;
        this.Alamat = alamat;
        this.NoTelp = notelp;
    }
    public void ShowProfil(ArrayList<Customer> cust, Stringid){
        for(int index=0;index<cust.size();index++){
            if(id.equals(cust.get(index).getNIK())){
                System.out.println("Customer Name : " + cust.get(index).getNama());
                System.out.println("Address : " + cust.get(index).getAlamat());
                System.out.println("Phone : " + cust.get(index).getNoTelp());
            }
        }
    }
}