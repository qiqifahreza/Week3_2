package toko;
import base.Produk;

public class Pemasukan extends Produk {

    private double totalPemasukan;
    public Pemasukan(String nama, double harga, int stok, String kategori) {
        super(nama, harga, stok, kategori);
        this.totalPemasukan = 0;
    }
    void tambahPemasukan(int jumlah) {
        if (jumlah <= stok) {
            totalPemasukan += harga * jumlah;
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak cukup untuk penjualan.");
        }
    }    
}
