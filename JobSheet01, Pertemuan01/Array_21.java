import java.util.Scanner;

public class Array_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("====================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("====================================");

        System.out.print("Masukkan jumlah mata kuliah: ");
        int jumlahMatakuliah = sc.nextInt();

        
        double totalSKS = 0;
        double totalNilaiSKS = 0;

        
        String[] namaMatakuliah = new String[jumlahMatakuliah];
        int[] bobotSKS = new int[jumlahMatakuliah];
        int[] nilaiAngka = new int[jumlahMatakuliah];

        System.out.println("Masukkan informasi untuk setiap mata kuliah:");
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.print("Masukkan nama matakuliah ke-" + (i + 1) + ": ");
            namaMatakuliah[i] = sc.next();
            System.out.print("Masukkan bobot SKS untuk " + namaMatakuliah[i] + ": ");
            bobotSKS[i] = sc.nextInt();
        }

        System.out.println("\n=====================================");
        System.out.println("Masukkan nilai Angka untuk setiap mata kuliah:");
        System.out.println("=====================================");

        
        for (int i = 0; i < jumlahMatakuliah; i++) {
            System.out.print("Masukkan nilai Angka untuk MK " + namaMatakuliah[i] + ": ");
            nilaiAngka[i] = sc.nextInt();

            
            double nilaiSetara = konversiNilai(nilaiAngka[i]);

            
            totalNilaiSKS += bobotSKS[i] * nilaiSetara;
            totalSKS += bobotSKS[i];
        }

        
        System.out.println("\n=====================================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("=====================================");
        System.out.printf("%-30s %-15s %-15s %-15s%n", "Mata Kuliah (MK)", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");

        for (int i = 0; i < jumlahMatakuliah; i++) {
            String nilaiHuruf = getNilaiHuruf(nilaiAngka[i]);
            System.out.printf("%-30s %-15d %-15s %-15d%n", namaMatakuliah[i], nilaiAngka[i], nilaiHuruf, bobotSKS[i]);
        }

        
        double ipSemester = (totalSKS == 0) ? 0 : totalNilaiSKS / totalSKS;

       
        System.out.println("\n=====================================");
        System.out.printf("Jumlah IP Semester Anda adalah: %.2f%n", ipSemester);
    }

    private static double konversiNilai(int nilaiAngka) {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return 4.0;
        } else if (nilaiAngka >= 73 && nilaiAngka < 80) {
            return 3.5;
        } else if (nilaiAngka >= 65 && nilaiAngka < 73) {
            return 3.0;
        } else if (nilaiAngka >= 60 && nilaiAngka < 65) {
            return 2.5;
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return 2.0;
        } else if (nilaiAngka >= 39 && nilaiAngka < 50) {
            return 1.0;
        } else {
            return 0.0;
        }
    }

    private static String getNilaiHuruf(int nilaiAngka) {
        if (nilaiAngka >= 80 && nilaiAngka <= 100) {
            return "A ";
        } else if (nilaiAngka >= 73 && nilaiAngka < 80) {
            return "B+ ";
        } else if (nilaiAngka >= 65 && nilaiAngka < 73) {
            return "B ";
        } else if (nilaiAngka >= 60 && nilaiAngka < 65) {
            return "C+ ";
        } else if (nilaiAngka >= 50 && nilaiAngka < 60) {
            return "C ";
        } else if (nilaiAngka >= 39 && nilaiAngka < 50) {
            return "D ";
        } else {
            return "E ";
        }
    }

}
