public class Makanan extends Produk {
    private String kadaluarsa;
    private String kategori;
    public Makanan(String nama, double harga, int stok, String kategori, String kadaluarsa) {
        super(nama, harga, stok);
        this.kadaluarsa = kadaluarsa;
        this.kategori = kategori;

        
    }
    public String getKadaluarsa() {
        return kadaluarsa;
    }
    public String getKategori() {
        return kategori;
    }

    @Override
    public void tampilInfo() {
        System.out.println("[Makanan");
        System.out.println("Kategori: " + kategori);
        System.out.println("Kedaluarsa: " + kadaluarsa);
        System.out.println("========================\n");    
    }

    public double hitungDiskon(int jumlahBeli) {
        if (jumlahBeli >= 10)
            return hitungTootalHarga(jumlahBeli) * 0.05;
        return 0;
    }
    public double hitungDiskon(int jumlahBeli, double persenDiskon) {
        return hitungTootalHarga(jumlahBeli) * (persenDiskon /100);
    }
    public double hitungHargaSetelahDiskon(int jumlahBeli) {
        return hitungTootalHarga(jumlahBeli) - hitungDiskon(jumlahBeli);
    }



}