

abstract class Produk {
    public String nama;
    public double harga;
    public int stok;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }
    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }
    public int getStok() {
        return stok;
    }
    public void setHarga(double harga) {
        this.harga = harga;
    }
    public void setStok(int stok) {
        this.stok = stok;
    }
    public double hitungTootalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }
    public void beli (int jumlahBeli) {
        if (jumlahBeli <= 0) {
            System.out.println("Jumlah Beli Harus Lebih Dari 0");
            return;
        }
        if (jumlahBeli > stok) {
            System.out.println("Stok" + nama + "Tidak Cukup. Tersisa: " + stok);
        }
        stok -= jumlahBeli;
        System.out.println(
            "Beli" + nama +
            " x" + + jumlahBeli +
            " =Rp: " + hitungTootalHarga(jumlahBeli) + 
            " | Sisa Stok: " + stok
        );

    }
    public abstract void tampilInfo();
    public abstract double hitungPajak(double harga);
}