
// public class Mahasiswa21 {
//     int nim;
//     String nama;
//     int umur;
//     double ipk;
    

//     Mahasiswa21(int ni, String n, int u, double i){
//         nim = ni;
//         nama = n;
//         umur = u;
//         ipk = i;
//     }

//     void tampil(){
//         System.out.println("Nim = " + nim);
//         System.out.println("Nama = " + nama);
//         System.out.println("Umur = " + umur);
//         System.out.println("IPK = " + ipk);
//     }
// }




// MODIFIKASI LATIHAN 1
public class Mahasiswa21 {

    int nim;
    String nama;
    int umur;
    double ipk;

    Mahasiswa21(int nim, String nama, int umur, double ipk) {

        this.nim = nim;
        this.nama = nama;
        this.umur = umur;
        this.ipk = ipk;

    }

    void Tampil() {

        System.out.println("NIM     : " + nim);
        System.out.println("Nama    : " + nama);
        System.out.println("Umur    : " + umur);
        System.out.println("IPK     : " + ipk);

    }

}