import java.util.Scanner;

public class MahasiswaMain_21 {
    public static void main(String[] args) {

        Scanner input18 = new Scanner(System.in);
        Scanner input18Line = new Scanner(System.in);


        System.out.println("============================================================");
        System.out.print("Masukkan jumlah mahasiswa   : ");
        int jumlahMahasiswa = input18.nextInt();
        PencarianMahasiswa_21 data = new PencarianMahasiswa_21(jumlahMahasiswa);
        System.out.println("============================================================");

        System.out.println("============================================================");
        System.out.println("   Masukkan data mahasiswa secara urut dari NIM terkecil");
        System.out.println("============================================================");

        for (int i = 0; i < jumlahMahasiswa; i++) {

            System.out.print("NIM\t : ");
            int nim = input18.nextInt();
            System.out.print("Nama\t : ");
            String nama = input18Line.nextLine();
            System.out.print("Umur\t : ");
            int umur = input18.nextInt();
            System.out.print("IPK\t : ");
            double ipk = input18.nextDouble();
            System.out.println("============================================================");

            Mahasiswa21 m = new Mahasiswa21(nim, nama, umur, ipk);
            data.Tambah(m);

        }

        System.out.println("============================================================");
        System.out.println("                 Data keseluruhan mahasiswa");
        System.out.println("============================================================");
        data.Tampil();

        System.out.println("============================================================");
        System.out.println("                  Pencarian data mahasiswa");
        System.out.println("============================================================");
        System.out.print("Masukkan NIM mahasiswa yang ingin dicari : ");
        int cari = input18.nextInt();

        System.out.println("============================================================");
        System.out.println("               Menggunakan Sequential Search");
        System.out.println("============================================================");
        int posisi = data.FindSequentialSearch(cari);

        data.TampilPosisi(cari, posisi);     
        data.TampilData(cari, posisi);

        System.out.println("============================================================");
        System.out.println("                 Menggunakan Binary Search");
        System.out.println("============================================================");
        posisi = data.FindBinarySearch(cari, 0, jumlahMahasiswa - 1);

        data.TampilPosisi(cari, posisi);
        data.TampilData(cari, posisi);
    }
}