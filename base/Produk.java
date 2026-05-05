package base;

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

    public void tampiInfo() {
        System.out.println("Nama Produk: " + nama);
        System.out.println("Harga Produk: " + harga);
        System.out.println("Stok Produk: " + stok);
        System.out.println("Kategori Produk: " + kategori);
    }
}
