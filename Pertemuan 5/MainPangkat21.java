// import java.util.Scanner;
// public class MainPangkat21 {
//     public static void main(String[] args) {
        
//         Scanner sc27 = new Scanner(System.in);
//         System.out.println("===================================================");
//         System.out.print("Masukan jumlah elemen yang ingin di hitung: ");
//         int elemen = sc27.nextInt();
        
//         Pangkat21[] png = new Pangkat21[elemen];
        
//         for (int i = 0; i < elemen; i++) {
//             System.out.print("Masukan nilai yang akan dipangkatkan ke- " + (i+1)+ " : ");
//             png[i] = new Pangkat21(i, i);
//             png[i].nilai = sc27.nextInt();
//             System.out.print("Masukan nilai pemangkat ke- " + (i+1) + " : ");
//         }
//         System.out.println("===================================================");
//         System.out.println("Hasil Pangkat dengan Brute Force: ");
        
//         for (int i = 0; i < elemen; i++) {
//             System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + "adalah " + png[i].pangkatBF(png[i].nilai,png[i].pangkat));
//         }
//         System.out.println("===================================================");


//         System.out.println("===================================================");
//         System.out.println("Hasil Pangkat dengan Divide and Conquer: ");
        
//         for (int i = 0; i < elemen; i++) {
//             System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + "adalah " + png[i].pangkatDC(png[i].nilai,png[i].pangkat));
//         }
//         System.out.println("===================================================");
//     }
    
// }

import java.util.Scanner;

public class MainPangkat21 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("===================================================");
        System.out.print("Masukan jumlah elemen yang ingin dihitung: ");
        int elemen = sc.nextInt();
        
        Pangkat21[] png = new Pangkat21[elemen];
        
        for (int i = 0; i < elemen; i++) {
            System.out.print("Masukan nilai yang akan dipangkatkan ke-" + (i + 1) + ": ");
            int nilai = sc.nextInt();
            System.out.print("Masukan nilai pemangkat ke-" + (i + 1) + ": ");
            int pangkat = sc.nextInt();
            png[i] = new Pangkat21(nilai, pangkat);
        }
        System.out.println("===================================================");
        
        System.out.println("Pilih Metode Perhitungan Pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukan pilihan: ");
        int pilihan = sc.nextInt();
        
        switch (pilihan) {
            case 1:
            System.out.println("===================================================");
                System.out.println("Hasil Pangkat dengan Brute Force: ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatBF(png[i].nilai, png[i].pangkat));
                }
                break;
            case 2:
                System.out.println("===================================================");
                System.out.println("Hasil Pangkat dengan Divide and Conquer: ");
                for (int i = 0; i < elemen; i++) {
                    System.out.println("Nilai " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " + png[i].pangkatDC(png[i].nilai, png[i].pangkat));
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("===================================================");
    }
}

class Pangkat21 {
    int nilai;
    int pangkat;

    public Pangkat21(int nilai, int pangkat) {
        this.nilai = nilai;
        this.pangkat = pangkat;
    }

    public int pangkatBF(int nilai, int pangkat) {
        int hasil = 1;
        for (int i = 0; i < pangkat; i++) {
            hasil *= nilai;
        }
        return hasil;
    }

    public int pangkatDC(int nilai, int pangkat) {
        if (pangkat == 0) {
            return 1;
        } else if (pangkat % 2 == 0) {
            int temp = pangkatDC(nilai, pangkat / 2);
            return temp * temp;
        } else {
            return nilai * pangkatDC(nilai, pangkat - 1);
        }
    }
}

// Modifikasi
