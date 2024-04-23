import java.util.Stack;

public class StrukBelanjaMain {
    public static void main(String[] args) {
        Stack<StrukBelanja> stackStrukBelanja = new Stack<>();

        // Menambahkan struk belanja ke dalam stack
        stackStrukBelanja.push(new StrukBelanja("001", "2024-04-01", 5, 150000));
        stackStrukBelanja.push(new StrukBelanja("002", "2024-04-08", 3, 90000));
        stackStrukBelanja.push(new StrukBelanja("003", "2024-04-15", 4, 120000));
        stackStrukBelanja.push(new StrukBelanja("004", "2024-04-22", 6, 180000));
        stackStrukBelanja.push(new StrukBelanja("005", "2024-04-29", 2, 60000));
        stackStrukBelanja.push(new StrukBelanja("006", "2024-05-06", 7, 210000));
        stackStrukBelanja.push(new StrukBelanja("007", "2024-05-13", 4, 120000));
        stackStrukBelanja.push(new StrukBelanja("008", "2024-05-20", 3, 90000));

        // Menampilkan informasi struk belanja yang masih tersimpan di dalam stack
        System.out.println("Informasi Struk Belanja yang Masih Tersimpan:");
        while (!stackStrukBelanja.isEmpty()) {
            StrukBelanja struk = stackStrukBelanja.pop();
            System.out.println("Nomor Transaksi: " + struk.nomorTransaksi);
            System.out.println("Tanggal Pembelian: " + struk.tanggalPembelian);
            System.out.println("Jumlah Barang: " + struk.jumlahBarang);
            System.out.println("Total Harga Bayar: " + struk.totalHargaBayar);
            System.out.println();
        }
    }
}
