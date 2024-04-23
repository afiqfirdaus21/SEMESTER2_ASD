// PERCOBAAN 1
// public class PencarianMhs21 {
//     Mahasiswa21 listMhs[] = new Mahasiswa21[5];
//     int idx;

//     void tambah(Mahasiswa21 m) {
//         if (idx < listMhs.length) {
//             listMhs[idx] = m;
//             idx++;
//         } else {
//             System.out.println("Data sudah penuh!!");
//         }
//     }

//     void tampil() {
//         for (Mahasiswa21 m : listMhs) {
//             m.tampil();
//             System.out.println("---------------------");
//         }
//     }

//     public int FindSeqSearch(int cari) {
//         int posisi = -1;
//         for (int j = 0; j < listMhs.length; j++) {
//             if (listMhs[j].nim == cari) {
//                 posisi = j;
//                 break;
//             }
//         }
//         return posisi;
//     }

//     public void Tampilposisi(int x, int pos) {
//         if (pos != -1) {
//             System.out.println("data : " + x + "ditemukan pada indeks" + pos);
//         } else {
//             System.out.println("data" + x + "tidak ditemukan");
//         }
//     }

//     public void TampilData(int x, int pos) {
//         if (pos != -1) {
//             System.out.println("Nim\t : " + x);
//             System.out.println("Nama\t : " + listMhs[pos].nama);
//             System.out.println("Umur\t : " + listMhs[pos].umur);
//             System.out.println("IPK\t : " + listMhs[pos].ipk);
//         } else {
//             System.out.println("Data " + x + "tidak ditemukan");
//         }
//     }
// }

// // PERCOBAAN 2
public class PencarianMhs21 {
    Mahasiswa21 listMhs[] = new Mahasiswa21[5];
    int idx;

    void tambah(Mahasiswa21 m) {
        if (idx < listMhs.length) {
            listMhs[idx] = m;
            idx++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }

    void tampil() {
        for (Mahasiswa21 m : listMhs) {
            m.Tampil();
            System.out.println("---------------------");
        }
    }

    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMhs.length; j++) {
            if (listMhs[j].nim == cari) {
                posisi = j;
                break;
            }
        }
        return posisi;
    }

    public void Tampilposisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("data : " + x + "ditemukan pada indeks" + pos);
        } else {
            System.out.println("data" + x + "tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("Nim\t : " + x);
            System.out.println("Nama\t : " + listMhs[pos].nama);
            System.out.println("Umur\t : " + listMhs[pos].umur);
            System.out.println("IPK\t : " + listMhs[pos].ipk);
        } else {
            System.out.println("Data " + x + "tidak ditemukan");
        }
    }

    // public int FindBinarySearch(int cari, int left, int right) {
    //     int mid;
    //     if (right >= left) {
    //         mid = (left + right) / 2;
    //         if (cari == listMhs[mid].nim) {
    //             return (mid);
    //         } else if (listMhs[mid].nim > cari) {
    //             return FindBinarySearch(cari, left, mid - 1);
    //         } else {
    //             return FindBinarySearch(cari, mid + 1, right);
    //         }
    //     }
    //     return -1;
    // }

    public int FindBinarySearch(int cari, int left, int right) {
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
            if (listMhs[mid].nim == cari) {
                return mid; // Jika elemen ditemukan, kembalikan indeks
            }
            
            // Jika elemen di tengah lebih kecil dari nilai yang dicari, cari di setengah kiri
            if (listMhs[mid].nim < cari) {
                right = mid - 1;
            } 
            // Jika elemen di tengah lebih besar dari nilai yang dicari, cari di setengah kanan
            else {
                left = mid + 1;
            }
        }
        // Jika elemen tidak ditemukan, kembalikan -1
        return -1;
    }    
}

