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

        double pajakHpCustom = Hp.hitungPajak(2);

        System.out.println("\nHp Samsung x2 (Pajak Custom 5%)");
        System.out.println("Subtotal: Rp" + Hp.hitungTootalHarga(2));
        System.out.println("Pajak: Rp " + pajakHpCustom);
        System.out.println("Total: Rp " + (Hp.hitungTootalHarga(2) + pajakHpCustom));

        System.out.println("==== Rincian Diskon Makanan ====");
        System.out.println("Indomie x10 (Diskon Otomatis)");
        System.out.println("Subtotal: Rp " + indomie.hitungTootalHarga(10));
        System.out.println("Diskon: Rp " + indomie.hitungDiskon(10));
        System.out.println("Total: Rp " + indomie.hitungHargaSetelahDiskon(10));

        System.out.println("\nRoti x5 (Diskon Custom 15%)");
        System.out.println("Subtotal: Rp " + roti.hitungTootalHarga(5));
        System.out.println("Diskon: Rp " + roti.hitungDiskon(5, 15));
        System.out.println("Total: Rp " + (roti.hitungTootalHarga(5) - roti.hitungDiskon(5, 15)));

        System.out.println("\n==== Transaksi ====");
        laptop.beli(1);
        Hp.beli(2);
        indomie.beli(10);
        roti.beli(5);
    }
    
}