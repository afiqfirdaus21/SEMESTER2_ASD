public class PencarianMahasiswa_21 {
    Mahasiswa21 listMahasiswa[];
    int index;

    public PencarianMahasiswa_21(int jumlahMahasiswa) {
        listMahasiswa = new Mahasiswa21[jumlahMahasiswa];
        index = 0;
    }

    void Tambah(Mahasiswa21 m) {
        if (index < listMahasiswa.length) {

            listMahasiswa[index] = m;
            index++;
        } else {
            System.out.println("Data sudah penuh !!!");
        }
    }

    void Tampil() {
        for (Mahasiswa21 m : listMahasiswa) {
            m.Tampil();
            System.out.println("============================================================");
        }
    }

    public int FindSequentialSearch(int cari) {
        int posisi = -1;
        for (int j = 0; j < listMahasiswa.length; j++) {
            if (listMahasiswa[j].nim == cari) {
                posisi  = j;
                break;
            }
        }
        return posisi;
    }

    public int FindBinarySearch(int cari, int left, int right) {
        int mid;
        if (right >= left) {
            mid = (left + right) / 2;
            if (cari == listMahasiswa[mid].nim) {
                return mid;
            } else if (listMahasiswa[mid].nim < cari) { // Modifikasi pada tanda lebih dari (>) ke (<)
                return FindBinarySearch(cari, left, mid -1);
            } else {
                return FindBinarySearch(cari, mid + 1, right);
            }
        }
        return -1;
    }

    public void TampilPosisi(int x, int pos) {
        if (pos != -1) {
            System.out.println("Data " + x + " ditemukan pada indeks " + pos);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }

    public void TampilData(int x, int pos) {
        if (pos != -1) {
            System.out.println("NIM\t : " + x);
            System.out.println("Nama\t : " + listMahasiswa[pos].nama);
            System.out.println("Umur\t : " + listMahasiswa[pos].umur);
            System.out.println("IPK\t : " + listMahasiswa[pos].ipk);
        } else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}