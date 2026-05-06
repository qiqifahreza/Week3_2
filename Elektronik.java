public class Elektronik extends Produk {
    private int garansiTahun;
    private String merek;
    private static final double PPN = 0.11;

    public Elektronik(String nama, double harga, int stok, int garansiTahun) {
        super(nama, harga, stok);
        this.merek = merek;
        this.garansiTahun = garansiTahun;
    }
    @Override
    public void tampilInfo() {
        System.out.println("Kategori: " + kategori);
        super.tampilInfo();
        System.out.println("Masa Garansi: " + garansi + " Hari");
    }
    public void setGaransi(int garansi) {
        if (garansi < 1) {
            System.out.println("Masa garansi harus lebih dari 0 hari.");
        } else {
            this.garansi = garansi;
        }
    }
}
