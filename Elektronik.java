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

    @Override
    public void tampilInfo() {
        System.out.println("[ELEKTRONIK");
        System.out.println("Nama: "+ getNama());
        System.out.println("Merek: " + merek);
        System.out.println("Garansi: " + garansiTahun + " Tahun");
        System.out.println("=================\n");
    }
    public double hitungDiskon(int jumlahBeli) {
        return hitungTootalHarga(jumlahBeli) * PPN;
    }
    public double hitungDiskon(int jumlahBeli, double persenPajak) {
        return hitungTootalHarga(jumlahBeli) * (persenPajak / 100);
    }


    }

