public class Elektronik extends Produk {
    private int garansiTahun;
    private String merek;
    private static final double PPN = 0.11;

    public Elektronik(String nama, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }
    public String getMerek() {
        return merek;
    }
    public int getGaransiTahun() {
        return garansiTahun;
    }

    

    }

