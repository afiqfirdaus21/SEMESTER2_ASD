// import java.util.ArrayList;
// import java.util.Arrays;
// import java.util.List;

// public class ListMahasiswa21 {

//     List<Mahasiswa21> mahasiswas = new ArrayList<>();

//     public void tambah(Mahasiswa21... mahasiswa) {
//         mahasiswas.addAll(Arrays.asList(mahasiswa));
//     }

//     public void hapus(int index) {
//         mahasiswas.remove(index);
//     }

//     public void update(int index, Mahasiswa21 mhs) {
//         mahasiswas.set(index, mhs);
//     }

//     public void tampil() {
//         mahasiswas.stream().forEach(mhs -> {
//             System.out.println("" + mhs.toString());
//         });
//     }

//     int linearSearch(String nim) {
//         for (int i = 0; i < mahasiswas.size(); i++) {
//             if (nim.equals(mahasiswas.get(i).nim)) {
//                 return i;
//             }
//         }
//         return -1;
//     }

//     public static void main(String[] args) {
            
//         ListMahasiswa21 lm = new ListMahasiswa21();
    
//         Mahasiswa21 m = new Mahasiswa21("201234", "Noureen", "021xx1");
//         Mahasiswa21 m1 = new Mahasiswa21("201235", "Akleema", "021xx2");
//         Mahasiswa21 m2 = new Mahasiswa21("201236", "Shannum", "021xx3");
    
//         lm.tambah(m, m1, m2);
//         lm.tampil();
//         lm.update(lm.linearSearch("201235"), new Mahasiswa21("201235", "Akhleema Lela", "021xx2"));
    
//         System.out.println("");
//         lm.tampil();
//     }
// }

// Modifikasi soal nomor 2 dan 3
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListMahasiswa21 {

    List<Mahasiswa21> mahasiswas = new ArrayList<>();

    public void tambah(Mahasiswa21... mahasiswa) {
        mahasiswas.addAll(Arrays.asList(mahasiswa));
    }

    public void hapus(int index) {
        mahasiswas.remove(index);
    }

    public void update(int index, Mahasiswa21 mhs) {
        mahasiswas.set(index, mhs);
    }

    public void tampil() {
        mahasiswas.forEach(mhs -> {
            System.out.println("" + mhs.toString());
        });
    }

    public void sortingAscending() {
        Collections.sort(mahasiswas, Comparator.comparing(mhs -> mhs.nim));
    }

    public void sortingDescending() {
        Collections.sort(mahasiswas, (mhs1, mhs2) -> mhs2.nim.compareTo(mhs1.nim));
    }

    int binarySearch(String nim) {
        // Cari nim dengan binarySearch
        int index = Collections.binarySearch(mahasiswas, new Mahasiswa21(nim, "", ""), Comparator.comparing(mhs -> mhs.nim));
        return index >= 0 ? index : -1;
    }

    public static void main(String[] args) {

        ListMahasiswa21 lm = new ListMahasiswa21();

        Mahasiswa21 m = new Mahasiswa21("201234", "Noureen", "021xx1");
        Mahasiswa21 m1 = new Mahasiswa21("201235", "Akleema", "021xx2");
        Mahasiswa21 m2 = new Mahasiswa21("201236", "Shannum", "021xx3");

        lm.tambah(m, m1, m2);
        System.out.println("Sebelum sorting:");
        lm.tampil();

        System.out.println("\nSetelah sorting ascending:");
        lm.sortingAscending();
        lm.tampil();

        System.out.println("\nSetelah sorting descending:");
        lm.sortingDescending();
        lm.tampil();
    }
}
