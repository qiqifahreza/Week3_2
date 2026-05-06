public class Main {
    public static void main(String[] args) {
        Elektronik laptop = new Elektronik("Laptop Asus", "Asus", 850000, 10, 2);
        Elektronik Hp = new Elektronik("Hp Samsung", "Samsung", 3200000, 25, 1);

        Makanan indomie = new Makanan("Indomie Goreng", 3500.0, 100, "Mie Instant", "2026-12-01");
        Makanan roti = new Makanan("Roti Tawar", 3500.0, 50, "Roti", "2026-04-30");
    
        System.out.println("==== Daftar Produk ====");
        laptop.tampilInfo();
        Hp.tampilInfo();

        indomie.tampilInfo();
        roti.tampilInfo();

        System.out.println("==== Rincian Pajak ====");

        double pajakLaptop = (1);
        double totalLaptop = laptop.hitungHargaSetelahPajak(1);

        System.out.println("Laptop X1 (PPN Standar 11%)");
        System.out.println("Subtotal: Rp " + laptop.hitungTootalHarga(1));
        System.out.println("Pajakk: Rp " + pajakLaptop);
        System.out.println("Total: Rp" + totalLaptop);
        
    }
    
}