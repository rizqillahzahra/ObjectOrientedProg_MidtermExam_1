import java.text.NumberFormat;
import java.util.Locale;

public class Expatriat {
    String jenisExpatriat;
    double Harga;
    int Pilih;
    int Nomor;
    int besaranHarga;
    int jumlahRumah;

    Locale locale = new Locale("id", "ID");
    NumberFormat numberFormat = NumberFormat.getCurrencyInstance(locale);

    public Expatriat(int Nomor, String jenisExpatriat, double harga) {
        this.Nomor = Nomor;
        this.jenisExpatriat = jenisExpatriat;
        this.Harga = harga;
    }
    
    public String jenisExpatriat() {
        return jenisExpatriat;
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
        return getNomor() + ". Rumah " + jenisExpatriat() + ". Harga: " + numberFormat.format(getHarga());
    }
}
