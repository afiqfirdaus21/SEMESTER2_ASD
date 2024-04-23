// // import java.util.Scanner;

// // public class MainSum21 {
// //     public static void main(String[] args) {
// //         Scanner sc = new Scanner(System.in);
// //         System.out.println("=============================");
// //         System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
// //         System.out.print("Masukkan jumlah bulan : ");
// //         int elm = sc.nextInt();

// //         Sum21 sm = new Sum21(elm);
// //         System.out.println("===============================");
// //         for (int i = 0; i < sm.elemen; i++) {
// //             System.out.print("Masukkan untung bulan ke - " + (i + 1) + " : ");
// //             sm.keuntungan[i] = sc.nextDouble();
// //         }

// //         System.out.println("============================================");
// //         System.out.println("Algoritma Brute Force");
// //         System.out.println(
// //                 "Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
// //         System.out.println("=============================================");
// //         System.out.println("Algoritma Divide Conquer");
// //         System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = "
// //                 + sm.totalDC(sm.keuntungan, 0, sm.elemen - 1));
// //     }
// // }

// import java.util.Scanner;

// public class MainSum21 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("=============================");
//         System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
//         System.out.print("Masukkan jumlah bulan : ");
//         int elm = sc.nextInt();

//         Sum21 sm = new Sum21(elm);
//         System.out.println("===============================");
//         for (int i = 0; i < sm.elemen; i++) {
//             System.out.print("Masukkan untung bulan ke - " + (i + 1) + " : ");
//             sm.keuntungan[i] = sc.nextDouble();
//         }

//         System.out.println("============================================");
//         System.out.println("Algoritma Brute Force");
//         double totalBF = sm.totalBF(sm.keuntungan);
//         System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + String.format("%.2f", totalBF));
//         System.out.println("=============================================");
//         System.out.println("Algoritma Divide Conquer");
//         double totalDC = sm.totalDC(sm.keuntungan, 0, sm.elemen - 1);
//         System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + String.format("%.2f", totalDC));
//     }
// }
// // Modifikasi 

import java.util.Scanner;
public class MainSum21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=============================");
        System.out.println("Program Menghitung Keuntungan Total (Satuan Juta. Misal 5.9)");
        System.out.print("Masukkan jumlah perusahaan : ");
        int numCompanies = sc.nextInt();

        int[] numMonths = new int[numCompanies];
        for (int i = 0; i < numCompanies; i++) {
            System.out.print("Masukkan jumlah bulan untuk perusahaan ke-" + (i + 1) + " : ");
            numMonths[i] = sc.nextInt();
        }

        Sum21 sm = new Sum21(numMonths);
        System.out.println("===============================");
        for (int i = 0; i < numCompanies; i++) {
            for (int j = 0; j < sm.elemen[i]; j++) {
                System.out.print("Masukkan untung bulan ke - " + (j + 1) + " untuk perusahaan ke-" + (i + 1) + " : ");
                sm.keuntungan[i][j] = sc.nextDouble();
            }
        }

        System.out.println("============================================");
        for (int i = 0; i < numCompanies; i++) {
            System.out.println("Perusahaan ke-" + (i + 1));
            System.out.println("Algoritma Brute Force");
            double totalBF = sm.totalBF(sm.keuntungan[i]);
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan adalah = " + String.format("%.2f", totalBF));
            System.out.println("=============================================");
            System.out.println("Algoritma Divide Conquer");
            double totalDC = sm.totalDC(sm.keuntungan[i], 0, sm.elemen[i] - 1);
            System.out.println("Total keuntungan perusahaan selama " + sm.elemen[i] + " bulan adalah = " + String.format("%.2f", totalDC));
            System.out.println("=============================================");
        }
    }
}

// Modifikasi 2