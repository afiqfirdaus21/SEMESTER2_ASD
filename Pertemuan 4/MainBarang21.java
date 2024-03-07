import java.util.Scanner;

public class MainBarang21 {
    public static void main(String[] args) {
        Barang21[] daftarBarang = {
                new Barang21("K01", "Sabun", 1000, 5),
                new Barang21("K02", "Pasta Gigi", 2000, 10),
                new Barang21("K03", "Biore", 3000, 23),
                new Barang21("K04", "Shampoo", 4000, 55),
                new Barang21("K05", "Sikat Gigi", 5000, 65)
        };

        TransaksiBarang21 transaksi = new TransaksiBarang21(daftarBarang);
        Scanner sc21 = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("========================");
            System.out.println("TOKO MAJU MUNDUR CANTIK");
            System.out.println("========================");
            System.out.println("Menu:");
            System.out.println("1. Tampilkan Barang");
            System.out.println("2. Beli");
            System.out.println("3. Tampilan Pembelian");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            pilihan = sc21.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Tampilan Barang:");
                    for (Barang21 barang : daftarBarang) {
                        barang.tampilkanBarang();
                    }
                    break;
                case 2:
                    System.out.print("Masukkan kode barang : ");
                    String kodePembelian = sc21.next();
                    transaksi.melakukanPembelian(kodePembelian);
                    break;
                case 3:
                    System.out.println("List Belanjaan :");
                    transaksi.tampilkanBarangPembelian();
                    break;
                case 4:
                    System.out.println("Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 4);
    }
}
