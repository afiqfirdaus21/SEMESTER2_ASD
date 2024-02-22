public class Buku21 {
    String judul, pengarang;
    int halaman, stok, harga;
    public Buku21(){

    }
    public Buku21 (String jud, String pg, int hal, int stok, int har) {
        judul = jud;
        pengarang = pg;
        halaman = hal;
        this.stok = stok;
        harga = har;
    }
    void tampilInformasi() {
        System.out.println("Judul : " + judul);
        System.out.println("Pengarang : " + pengarang);
        System.out.println("Jumlah halaman : " + halaman);
        System.out.println("Sisa stok : " + stok);
        System.out.println("Harga : Rp " + harga);
    }
    void terjual(int jml) {
        if (stok > 0) {
            stok -= jml;
        } else {
            System.out.println("Stok habis!");
        }
    }
    void restock(int jml) {
        stok += jml;
    }
    void gantiHarga(int hrg) {
        harga = hrg;
    }
    int hitungHargaTotal(int jumlahTerjual) {
        return harga * jumlahTerjual;
    }
    int hitungDiskon(int hargaTotal) {
        if (hargaTotal > 150000) {
            return hargaTotal * 12 / 100;
        } else if (hargaTotal >= 75000 && hargaTotal <= 150000) {
            return hargaTotal * 5 / 100;
        } else {
            return 0;
        }
    }
    int hitungHargaBayar(int hargaTotal, int diskon) {
        return hargaTotal - diskon;
    }
}