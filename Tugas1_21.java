import java.util.Scanner;

public class Tugas1_21 {
    public static void main(String[] args) {
       
        char[] KODE = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] KOTA = {
                {"BANTEN"},
                {"JAKARTA"},
                {"BANDUNG"},
                {"CIREBON"},
                {"BOGOR"},
                {"PEKALONGAN"},
                {"SEMARANG"},
                {"SURABAYA"},
                {"MALANG"},
                {"TEGAL"}
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan kode plat nomor (A, B, D, E, F, G, H, L, N, T): ");
        char inputKode = scanner.next().charAt(0);

        int indeks = -1;
        for (int i = 0; i < KODE.length; i++) {
            if (KODE[i] == inputKode) {
                indeks = i;
                break;
            }
        }

        if (indeks != -1) {
            System.out.println("Nama kota untuk kode plat " + inputKode + " adalah: " + KOTA[indeks][0]);
        } else {
            System.out.println("Kode plat nomor tidak valid.");
        }

        scanner.close();
    }
}
