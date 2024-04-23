import java.util.Scanner;

public class MainRetur21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Retur21[] arrayofRetur = new Retur21[1];

        for (int i = 0; i < arrayofRetur.length; i++) {
            System.out.println("Masukkan Nama Barang : ");
            String NamaBarang = sc.next();
            System.out.println("Masukkan Jumlah Barang :");
            int JumlahRetur = sc.nextInt();

            Retur21 retur = new Retur21(NamaBarang, JumlahRetur);

            arrayofRetur[i] = retur;

            System.out.println("Barang berhasil diretur. Stok barang telah diperbarui.");
        }

        for (Retur21 retur : arrayofRetur) {
            retur.DisplayInfoRetur();
        }
    }
}
