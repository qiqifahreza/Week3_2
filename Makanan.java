public class Makanan {
    private int expired;
    public Makanan(String nama, double harga, int stok, String kategori, int expired) {
        super(nama, harga, stok, kategori);
        this.expired = expired;
    }
    public void tampilkanData() {
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
}
