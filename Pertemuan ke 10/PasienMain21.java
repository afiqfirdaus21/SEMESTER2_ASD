import java.util.Scanner;
public class PasienMain21 {
    public static void main(String[] args) {
        AntrianPasien21 antrian = new AntrianPasien21();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Pasien");
            System.out.println("2. Panggil Pasien");
            System.out.println("3. Lihat Antrian");
            System.out.println("4. Lihat Pasien Paling Depan");
            System.out.println("5. Lihat Pasien Paling Belakang");
            System.out.println("6. Cari Posisi Pasien");
            System.out.println("7. Keluar");
            System.out.print("Pilih: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = scanner.nextLine();
                    System.out.print("Nomor Identitas: ");
                    String nomorIdentitas = scanner.nextLine();
                    System.out.print("Jenis Kelamin: ");
                    String jenisKelamin = scanner.nextLine();
                    System.out.print("Umur: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    Pasien21 pasien = new Pasien21(nama, nomorIdentitas, jenisKelamin, umur);
                    antrian.enqueue(pasien);
                    System.out.println("Pasien telah ditambahkan ke antrian.");
                    break;
                case 2:
                    Pasien21 panggilPasien = antrian.dequeue();
                    if (panggilPasien != null) {
                        System.out.println("Pasien yang dipanggil: " + panggilPasien.nama);
                    }
                    break;
                case 3:
                    antrian.print();
                    break;
                case 4:
                    Pasien21 pasienDepan = antrian.peek();
                    if (pasienDepan != null) {
                        System.out.println("Pasien paling depan: " + pasienDepan.nama);
                    }
                    break;
                case 5:
                    Pasien21 pasienBelakang = antrian.peekRear();
                    if (pasienBelakang != null) {
                        System.out.println("Pasien paling belakang: " + pasienBelakang.nama);
                    }
                    break;
                case 6:
                    System.out.print("Masukkan nama pasien: ");
                    String cariNama = scanner.nextLine();
                    int posisi = antrian.peekPosition(cariNama);
                    if (posisi != -1) {
                        System.out.println("Posisi pasien " + cariNama + " dalam antrian: " + posisi);
                    } else {
                        System.out.println("Pasien " + cariNama + " tidak ditemukan dalam antrian.");
                    }
                    break;
                case 7:
                    System.out.println("Keluar dari program.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }
}