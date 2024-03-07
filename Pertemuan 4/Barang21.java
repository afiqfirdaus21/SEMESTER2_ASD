public class Barang21 {
    String kode;
    String nama;
    double harga;
    int stok;

    public Barang21(String kode, String nama, double harga, int stok) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
    }

    public void tampilkanBarang() {
        if (!headerDisplayed) {
            System.out.println("| Kode  | Nama            | Harga   | Stok |");
            System.out.println("|-------|-----------------|---------|------|");
            headerDisplayed = true;
        }
        System.out.printf("| %-5s | %-15s | %-7.2f | %-4d |\n", kode, nama, harga, stok);
        System.out.println("|------------------------------------------|");
    }

    private static boolean headerDisplayed = false;
    
}