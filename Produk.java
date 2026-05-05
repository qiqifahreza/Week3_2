

public class Produk {
    public String nama;
    public double harga;
    public int stok;
    public String kategori;

    public Produk(String nama, double harga, int stok, String kategori) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        this.kategori = kategori;
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

    public void tampilInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga Produk: " + harga);
        System.out.println("Stok Produk: " + stok);
        System.out.println("Kategori Produk: " + kategori);
    }
}
