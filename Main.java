public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Laptop", 15000.0, 10, "Elektronik");
        
        System.out.println("Nama Produk: " + p.getNama());
        System.out.println("Harga: " + p.getHarga());
        p.setHarga(20000.0);
        System.out.println("Harga setelah diubah: " + p.getHarga());

    }
}
