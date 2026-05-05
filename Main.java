import base.Produk;

public class Main {
    public static void main(String[] args) {
        Produk p = new Produk("Laptop", 15000000, 10, "Elektronik");
        
        System.out.println("Nama Produk: " + p.getNama());
        System.out.println("Harga: " + p.getHarga());
        p.getHarga(20000);

    }
}
