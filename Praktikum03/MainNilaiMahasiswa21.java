import java.util.Scanner;

public class MainNilaiMahasiswa21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        NilaiMahasiswa21[] arrayofNilaiMahasiswa = new NilaiMahasiswa21[3];
        String nama = "";
        String Jeniskelamin = "";
        int NIM = 0;
        double IPK = 0;
        double totalIPK = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke : " + (i + 1));
            System.out.println("Masukkan Nama :");
            nama = sc.next();
            System.out.println("masukkan Jenis Kelamin :");
            Jeniskelamin = sc.next();
            System.out.println("Masukkan NiM : ");
            NIM = sc.nextInt();
            System.out.println("Masukkan IPK :");
            IPK = sc.nextDouble();

            totalIPK += IPK;
            arrayofNilaiMahasiswa[i] = new NilaiMahasiswa21(nama, Jeniskelamin, NIM, IPK);
        }

        int index = 1;
        for (NilaiMahasiswa21 mahasiswa : arrayofNilaiMahasiswa) {
            System.out.println("\nData Mahasiswa Ke-" + index++);
            mahasiswa.displayinfo();
        }

        double rataRataIPK = totalIPK / 3;
        double roundedRataRataIPK = Math.round(rataRataIPK * 10.0) / 10.0;
        System.out.println("Rata-rata IPK Mahasiswa: " + roundedRataRataIPK);
    }
}
