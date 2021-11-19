import java.text.NumberFormat;
import java.util.Locale;

public class Sultan {
    String jenisSultan;
    double Harga;
    int Pilih;
    int Nomor;
    int besaranHarga;
    int jumlahRumah;

    Locale locale = new Locale("id", "ID");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public Sultan(int Nomor, String jenisSultan, double harga) {
        this.Nomor = Nomor;
        this.jenisSultan = jenisSultan;
        this.Harga = harga;
    }
    
    public String getJenisSultan() {
        return jenisSultan;
    }

    public double getHarga() {
        return Harga;
    }

    public int getNomor() {
        return Nomor;
    }
    
    public void setJumlahRumah(int jumlahRumah) {
        this.jumlahRumah = jumlahRumah;
    }

    public int getJumlahRumah() {
        return jumlahRumah;
    }

    public double getBesaranRumah(){
        return getHarga() * getJumlahRumah();
    }  

    @Override
    public String toString() {
        return getNomor() + ". Rumah " + getJenisSultan() + ". Harga: " + numberFormat.format(getHarga());
    }
}
