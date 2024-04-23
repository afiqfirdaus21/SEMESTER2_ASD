// PERCOBAAN 1
// import java.util.Scanner;

// public class MahasiswaMain {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         Scanner sl = new Scanner(System.in);

//         PencarianMhs21 data = new PencarianMhs21();
//         int jumMhs = 5;

//         System.out.println("-----------------------------------------");
//         System.out.println("Masukkan data Mahasiswa secara Urut dari Nim terkecil:");
//         for (int i = 0; i < jumMhs; i++) {
//             System.out.println("-----------------------");
//             System.out.println("Nim\t: ");
//             int nim = s.nextInt();
//             System.out.println("Nama\t: ");
//             String nama = sl.nextLine();
//             System.out.println("Umur\t: ");
//             int umur = s.nextInt();
//             System.out.println("IPK\t: ");
//             double ipk = s.nextDouble();

//             Mahasiswa21 m = new Mahasiswa21(nim, nama, umur, ipk);
//             data.tambah(m);
//         }
//         System.out.println("-----------------------------");
//         System.out.println("Data Keseluruhan Mahasiswa: ");
//         data.tampil();

//         System.out.println("______________________________________");
//         System.out.println("______________________________________");
//         System.out.println("Pencarian Data: ");
//         System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
//         System.out.println("NIM : ");
//         int cari = s.nextInt();
//         System.out.println("Menggunakan sequential serach");
//         int posisi = data.FindSeqSearch(cari);

//         data.Tampilposisi(cari, posisi);

//         data.TampilData(cari, posisi); 
//     }
// }

// PERCOBAAN 2
// import java.util.Scanner;

// public class MahasiswaMain {
//     public static void main(String[] args) {
//         Scanner s = new Scanner(System.in);
//         Scanner sl = new Scanner(System.in);

//         PencarianMhs21 data = new PencarianMhs21();
//         int jumMhs = 5;

//         System.out.println("-----------------------------------------");
//         System.out.println("Masukkan data Mahasiswa secara Urut dari Nim terkecil:");
//         for (int i = 0; i < jumMhs; i++) {
//             System.out.println("-----------------------");
//             System.out.println("Nim\t: ");
//             int nim = s.nextInt();
//             System.out.println("Nama\t: ");
//             String nama = sl.nextLine();
//             System.out.println("Umur\t: ");
//             int umur = s.nextInt();
//             System.out.println("IPK\t: ");
//             double ipk = s.nextDouble();

//             Mahasiswa21 m = new Mahasiswa21(nim, nama, umur, ipk);
//             data.tambah(m);
//         }
//         System.out.println("-----------------------------");
//         System.out.println("Data Keseluruhan Mahasiswa: ");
//         data.tampil();

//         System.out.println("______________________________________");
//         System.out.println("______________________________________");
//         System.out.println("Pencarian Data: ");
//         System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
//         System.out.println("NIM : ");
//         int cari = s.nextInt();
//         System.out.println("Menggunakan sequential serach");
//         int posisi = data.FindSeqSearch(cari);
//         data.Tampilposisi(cari, posisi);
//         data.TampilData(cari, posisi);

//         System.out.println("=================================");
//         System.out.println("Menggunakan binary Search");
//         posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
//         data.Tampilposisi(cari, posisi);
//         data.TampilData(cari, posisi);
//     }
// }


// MODIFIKASI DI PERCOBAAN 2
import java.util.Scanner;

public class MahasiswaMain {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner sl = new Scanner(System.in);

        PencarianMhs21 data = new PencarianMhs21();

        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumMhs = s.nextInt();

        System.out.println("-----------------------------------------");
        System.out.println("Masukkan data Mahasiswa secara Urut dari Nim terbesar ke terkecil:");
        for (int i = 0; i < jumMhs; i++) {
            System.out.println("-----------------------");
            System.out.println("Nim\t: ");
            int nim = s.nextInt();
            System.out.println("Nama\t: ");
            String nama = sl.nextLine();
            System.out.println("Umur\t: ");
            int umur = s.nextInt();
            System.out.println("IPK\t: ");
            double ipk = s.nextDouble();

            Mahasiswa21 m = new Mahasiswa21(nim, nama, umur, ipk);
            data.tambah(m);
        }
        System.out.println("-----------------------------");
        System.out.println("Data Keseluruhan Mahasiswa: ");
        data.tampil();

        System.out.println("______________________________________");
        System.out.println("______________________________________");
        System.out.println("Pencarian Data: ");
        System.out.println("Masukkan Nim Mahasiswa yang dicari: ");
        System.out.println("NIM : ");
        int cari = s.nextInt();
        System.out.println("Menggunakan sequential search");
        int posisi = data.FindSeqSearch(cari);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);

        System.out.println("=================================");
        System.out.println("Menggunakan binary Search");
        posisi = data.FindBinarySearch(cari, 0, jumMhs - 1);
        data.Tampilposisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}