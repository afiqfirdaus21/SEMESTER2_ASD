import java.util.Scanner;

public class Pemilihan_21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nilai tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan nilai kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan nilai UAS: ");
        double uas = sc.nextDouble();

        if (!isValidNilai(tugas) || !isValidNilai(kuis) || !isValidNilai(uts) || !isValidNilai(uas)) {
            System.out.println("Nilai tidak valid");
            return;
        }
        double nilaiAkhir = 0.2 * tugas + 0.2 * kuis + 0.3 * uts + 0.3 * uas;

        String nilaiHuruf = konversiNilaiKeHuruf(nilaiAkhir);
        String kualifikasi = getKualifikasi(nilaiHuruf);

        String statusLulus = (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") ||
                nilaiHuruf.equals("B") || nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) ? "SELAMAT ANDA LULUS" : "ANDA TIDAK LULUS";

        System.out.printf("Nilai Akhir: %.2f%n", nilaiAkhir);
        System.out.println("Nilai Huruf: " + nilaiHuruf);
        System.out.println("Kualifikasi: " + kualifikasi);
        System.out.println("Status: " + statusLulus);
    }

    static boolean isValidNilai(double nilai) {
        return nilai >= 0 && nilai <= 100;
    }

    static String konversiNilaiKeHuruf(double nilai) {
        if (nilai >= 80 && nilai <= 100) {
            return "A";
        } else if (nilai >= 73 && nilai < 80) {
            return "B+";
        } else if (nilai >= 65 && nilai < 73) {
            return "B";
        } else if (nilai >= 60 && nilai < 65) {
            return "C+";
        } else if (nilai >= 50 && nilai < 60) {
            return "C";
        } else if (nilai >= 39 && nilai < 50) {
            return "D";
        } else {
            return "E";
        }
    }

    static String getKualifikasi(String nilaiHuruf) {
        switch (nilaiHuruf) {
            case "A":
                return "Sangat Baik";
            case "B+":
                return "Lebih dari Baik";
            case "B":
                return "Baik";
            case "C+":
                return "Lebih dari Cukup";
            case "C":
                return "Cukup";
            case "D":
                return "Kurang";
            default:
                return "Gagal";
        }
    }
}