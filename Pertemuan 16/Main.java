import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {

    static Scanner input18 = new Scanner(System.in);

    static List<Matakuliah> daftarMatakuliah = new ArrayList<>();
    static List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public static void main(String[] args) {

        tambahMatakuliah(new Matakuliah("IOT", "Internet of Things", 3));
        tambahMatakuliah(new Matakuliah("ASD", "Algortima Data", 2));
        tambahMatakuliah(new Matakuliah("BSD", "Teori Basis Data", 2));
        tambahMatakuliah(new Matakuliah("PSI", "Sistem Informasi", 2));

        tambahMahasiswa(new Mahasiswa("2341", "Junaedi", "08123456"));
        tambahMahasiswa(new Mahasiswa("2342", "Slamet", "08123457"));
        tambahMahasiswa(new Mahasiswa("2343", "Kurniawan", "08123458"));
        tambahMahasiswa(new Mahasiswa("2344", "Riyatno", "08123459"));

        int pilihan = 0;

        do {
            System.out.println("========================================================================");
            System.out.println("                SISTEM PENGOLAHAN DATA NILAI MAHASISWA");
            System.out.println("========================================================================");
            System.out.println("\n1. Input Nilai");
            System.out.println("2. Tampil Nilai");
            System.out.println("3. Mencari Nilai Mahasiswa");
            System.out.println("4. Urut Data Nilai");
            System.out.println("5. Hapus Mahasiswa");
            System.out.println("6. Keluar\n");
            System.out.println("========================================================================");
            System.out.print("Masukkan pilihan           : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:
                    inputNilai();
                    break;

                case 2:
                    tampilNilai();
                    break;

                case 3:
                    cariNilaiMahasiswa();
                    break;

                case 4:
                    urutDataNilai();
                    break;

                case 5:
                    hapusMahasiswa();
                    break;

                default:
                    System.out.println("========================================================================");
                    System.out.println("                      Masukkan Pilihan Yang Benar");
                    System.out.println("========================================================================");
                    break;
            }

        } while (pilihan != 6);
    }

    static void inputNilai() {

        tampilMatakuliah();

        System.out.print("Masukkan Kode Matakuliah    : ");
        String kodeMatkul = input18.next();
        Matakuliah matakuliah = cariMatakuliahByKode(kodeMatkul);

        tampilMahasiswa();

        if (matakuliah != null) {
            System.out.print("Masukkan NIM Mahasiswa      : ");
            String nimMahasiswa = input18.next();
            Mahasiswa mahasiswa = cariMahasiswaByNIM(nimMahasiswa);
            if (mahasiswa != null) {
                System.out.print("Masukkan Nilai              : ");
                double nilai = input18.nextDouble();

                Nilai nilaiObjek = new Nilai(mahasiswa, matakuliah, nilai);
                mahasiswa.tambahNilai(nilaiObjek);
                System.out.println("Nilai berhasil diinputkan untuk Mahasiswa " + mahasiswa.getNama());
            } else {
                System.out.println("Mahasiswa dengan NIM " + nimMahasiswa + " tidak ditemukan.");
            }
        } else {
            System.out.println("Matakuliah dengan kode " + kodeMatkul + " tidak ditemukan.");
        }

    }

    static void tampilNilai() {

        tampilMahasiswa();

        System.out.print("Masukkan NIM Mahasiswa      : ");
        String nimMahasiswa = input18.next();
        Mahasiswa mhs = cariMahasiswaByNIM(nimMahasiswa);

        if (mhs != null) {

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");
            System.out.println("-------------------------------------------------------------------------");

            for (Nilai nilai : mhs.getNilaiList()) {
                System.out.println(nilai);
            }

            System.out.println("-------------------------------------------------------------------------");

        } else {
            System.out.println("Mahasiswa dengan NIM " + nimMahasiswa + " tidak ditemukan.");
        }

    }

    static void tampilMahasiswa() {

        System.out.println("---------------------------------------------------------------------------------");
        System.out.println("| NIM\t\t\t| Nama Mahasiswa\t\t| Nomor\t\t\t|");
        System.out.println("---------------------------------------------------------------------------------");

        for (Mahasiswa mhs : daftarMahasiswa) {
            System.out.println(mhs);
        }

        System.out.println("---------------------------------------------------------------------------------");

    }

    static void tampilMatakuliah() {
        System.out.println("---------------------------------------------------------");
        System.out.println("| kode\t| Nama Matkul\t\t\t\t| SKS\t|");
        System.out.println("---------------------------------------------------------");

        for (Matakuliah matkul : daftarMatakuliah) {
            System.out.println(matkul);
        }
        System.out.println("---------------------------------------------------------");
    }

    static Matakuliah cariMatakuliahByKode(String kode) {

        for (Matakuliah matkul : daftarMatakuliah) {
            if (matkul.getKode().equals(kode)) {
                return matkul;
            }
        }
        return null;

    }

    static Mahasiswa cariMahasiswaByNIM(String nim) {

        for (Mahasiswa mhs : daftarMahasiswa) {
            if (mhs.getNim().equals(nim)) {
                return mhs;
            }
        }
        return null;

    }

    static void cariNilaiMahasiswa() {

        tampilMahasiswa();

        System.out.print("Masukkan NIM Mahasiswa      : ");
        String nim = input18.next();

        Mahasiswa mahasiswa = cariMahasiswaByNIM(nim);

        if (mahasiswa != null) {

            System.out.println("-------------------------------------------------------------------------");
            System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");
            System.out.println("-------------------------------------------------------------------------");
            
            for (Nilai nilai : mahasiswa.getNilaiList()) {
                System.out.println(nilai);
            }

            System.out.println("-------------------------------------------------------------------------");
        
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }

    }

    static void urutDataNilai() {

        List<Nilai> semuaNilai = new ArrayList<>();

        for (Mahasiswa mhs : daftarMahasiswa) {
            semuaNilai.addAll(mhs.getNilaiList());
        }

        Collections.sort(semuaNilai, new Comparator<Nilai>() {
            @Override
            public int compare(Nilai n1, Nilai n2) {
                return Double.compare(n2.getNilai(), n1.getNilai());
            }
        });

        System.out.println("-------------------------------------------------------------------------");
        System.out.println("| NIM\t| Nama Mahasiswa\t| Mata Kuliah\t\t| SKS\t| Nilai\t|");
        System.out.println("-------------------------------------------------------------------------");

        for (Nilai nilai : semuaNilai) {
            System.out.println(nilai);
        }

        System.out.println("-------------------------------------------------------------------------");

    }

    static void hapusMahasiswa() {

        tampilMahasiswa();

        System.out.print("Masukkan NIM Mahasiswa      : ");
        String nim = input18.next();

        Mahasiswa mahasiswa = cariMahasiswaByNIM(nim);

        if (mahasiswa != null) {
            daftarMahasiswa.remove(mahasiswa);
            System.out.println("Mahasiswa dengan NIM " + nim + " berhasil dihapus.");
        } else {
            System.out.println("Mahasiswa dengan NIM " + nim + " tidak ditemukan.");
        }

    }

    static void tambahMatakuliah(Matakuliah matkul) {
        daftarMatakuliah.add(matkul);
    }

    static void tambahMahasiswa(Mahasiswa mahasiswa) {
        daftarMahasiswa.add(mahasiswa);
    }
}