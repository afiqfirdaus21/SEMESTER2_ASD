// import java.util.Scanner;
// public class MainFaktorial21 {
//             public static void main(String[] args) {
//                 Scanner sc = new Scanner(System.in);
//                 System.out.println("===================================================");
//                 System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
//                 int elemen = sc.nextInt();

//                 Faktorial21[] fk = new Faktorial21[elemen];
//                 for (int i = 0; i < elemen; i++) {
//                     fk[i] = new Faktorial21();
//                     System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
//                     fk[i].nilai = sc.nextInt();
//                 }

//                 System.out.println("===================================================");
//                 System.out.println("Hasil Faktorial dengan Brute Force");
//                 for (int i = 0; i < elemen; i++) {
//                     System.out
//                             .println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialBF(fk[i].nilai));
//                 }
//                 System.out.println("===================================================");
//                 System.out.println("Hasil Faktorial dengan Divide and Conquer");
//                 for (int i = 0; i < elemen; i++) {
//                     System.out
//                             .println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + fk[i].faktorialDC(fk[i].nilai));
//                 }
//             }
//         }

import java.util.Date;
import java.util.Scanner;

public class MainFaktorial21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("===================================================");
        System.out.print("Masukkan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();

        Faktorial21[] fk = new Faktorial21[elemen];
        for (int i = 0; i < elemen; i++) {
            fk[i] = new Faktorial21();
            System.out.print("Masukkan nilai data ke-" + (i + 1) + ": ");
            fk[i].nilai = sc.nextInt();
        }

        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Brute Force");
        for (int i = 0; i < elemen; i++) {
            Date startTimeBF = new Date();
            int hasilBF = fk[i].faktorialBF(fk[i].nilai);
            Date endTimeBF = new Date();
            long waktuEksekusiBF = endTimeBF.getTime() - startTimeBF.getTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilBF + " (Waktu eksekusi: "
                    + waktuEksekusiBF + " ms)");
        }

        System.out.println("===================================================");
        System.out.println("Hasil Faktorial dengan Divide and Conquer");
        for (int i = 0; i < elemen; i++) {
            Date startTimeDC = new Date();
            int hasilDC = fk[i].faktorialDC(fk[i].nilai);
            Date endTimeDC = new Date();
            long waktuEksekusiDC = endTimeDC.getTime() - startTimeDC.getTime();
            System.out.println("Faktorial dari nilai " + fk[i].nilai + " adalah: " + hasilDC + " (Waktu eksekusi: "
                    + waktuEksekusiDC + " ms)");
        }
    }
}

// MODIF 2