// PERCOBAAN 1

// import java.util.Scanner;

// public class Main21 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         DaftarMahasiswaBerprestasi21 list = new DaftarMahasiswaBerprestasi21();
//         Mahasiswa21 m1 = new Mahasiswa21("Nusa", 2017, 25, 3);
//         Mahasiswa21 m2 = new Mahasiswa21("Rara", 2012, 19, 4);
//         Mahasiswa21 m3 = new Mahasiswa21("Dompu", 2018, 19, 3.5);
//         Mahasiswa21 m4 = new Mahasiswa21("Abdul", 2017, 23, 2);
//         Mahasiswa21 m5 = new Mahasiswa21("Ummi", 2019, 21, 3.75);

//         list.tambah(m1);
//         list.tambah(m2);
//         list.tambah(m3);
//         list.tambah(m4);
//         list.tambah(m5);

//         System.out.println("Data Mahasiswa sebelum sorting = ");
//         list.tampil();

//         System.out.println("Data Mahasiswa setelah sorting desc berdasarkan ipk");
//         list.bubblesort();
//         list.tampil();
//     }
// }

// PERCOBAAN 2
// import java.util.Scanner;

// public class Main21 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);

//         DaftarMahasiswaBerprestasi21 list = new DaftarMahasiswaBerprestasi21();
//         Mahasiswa21 m1 = new Mahasiswa21("Nusa", 2017, 25, 3);
//         Mahasiswa21 m2 = new Mahasiswa21("Rara", 2012, 19, 4);
//         Mahasiswa21 m3 = new Mahasiswa21("Dompu", 2018, 19, 3.5);
//         Mahasiswa21 m4 = new Mahasiswa21("Abdul", 2017, 23, 2);
//         Mahasiswa21 m5 = new Mahasiswa21("Ummi", 2019, 21, 3.75);

//         list.tambah(m1);
//         list.tambah(m2);
//         list.tambah(m3);
//         list.tambah(m4);
//         list.tambah(m5);

//         System.out.println("Data Mahasiswa sebelum sorting = ");
//         list.tampil();

//         System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
//         list.selectionSort();
//         list.tampil();
//     }
// }

// PERCOBAAN 3 INSERTION SORT
import java.util.Scanner;

public class Main21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        DaftarMahasiswaBerprestasi21 list = new DaftarMahasiswaBerprestasi21();
        Mahasiswa21 m1 = new Mahasiswa21("Nusa", 2017, 25, 3);
        Mahasiswa21 m2 = new Mahasiswa21("Rara", 2012, 19, 4);
        Mahasiswa21 m3 = new Mahasiswa21("Dompu", 2018, 19, 3.5);
        Mahasiswa21 m4 = new Mahasiswa21("Abdul", 2017, 23, 2);
        Mahasiswa21 m5 = new Mahasiswa21("Ummi", 2019, 21, 3.75);

        list.tambah(m1);
        list.tambah(m2);
        list.tambah(m3);
        list.tambah(m4);
        list.tambah(m5);

        System.out.println("Data Mahasiswa sebelum sorting = ");
        list.tampil();

        System.out.println("Data Mahasiswa setelah sorting asc berdasarkan ipk");
        list.insertionSortDescending();
        list.tampil();
    }
}