public class Elektronik extends Produk {
    private int garansi;
    public Elektronik(String nama, double harga, int stok, String kategori, int garansi) {
        super(nama, harga, stok, kategori);
        this.garansi = garansi;
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
