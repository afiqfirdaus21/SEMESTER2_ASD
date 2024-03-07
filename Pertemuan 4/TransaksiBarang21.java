import java.util.Scanner;

public class TransaksiBarang21 {
    Barang21[] barangs;
    Scanner scanner;

    public TransaksiBarang21(Barang21[] barangs) {
        this.barangs = barangs;
        this.scanner = new Scanner(System.in);
    }

    public void tampilkanBarangPembelian() {
        System.out.println("Daftar Barang Pembelian:");
        for (Barang21 barang : barangs) {
            barang.tampilkanBarang();
        }
    }

    public void melakukanPembelian(String kode) {
        do {
            for (Barang21 barang : barangs) {
                if (barang.kode.equals(kode)) {
                    if (barang.stok > 0) {
                        System.out.println("Pembelian " + barang.nama + " berhasil!");
                        barang.stok--;
                    } else {
                        System.out.println("Stok " + barang.nama + " habis!");
                    }
                    break;
                }
            }

            System.out.print("Apakah Anda ingin belanja kembali? (Y/N): ");
        } while (scanner.next().equalsIgnoreCase("Y"));
    }
}
