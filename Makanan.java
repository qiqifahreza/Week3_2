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
        System.out.println("Kategori: " + kategori);
        super.tampilInfo();
        System.out.println("Masa Expired: " + expired + " Hari");
    }
    public void setExpired(int expired) {
        if (expired < 0) {
            System.out.println("Masa expired harus lebih dari negatif.");
        } else {
            this.expired = expired;
        }
    }

    public void setExpired(int expired, String type) {
        if (type.equals("Nasi")) {
            if (expired > 4) {
                System.out.println("Masa expired untuk nasi tidak boleh negatif.");
            } else {
                this.expired = expired;
            }
        }
        else {
            if (expired < 2) {
                System.out.println("Masa expired harus lebih dari negatif.");
            } else {
                this.expired = expired;
            }
        }
    }
}
