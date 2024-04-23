public class StrukBelanja {
    String nomorTransaksi;
    String tanggalPembelian;
    int jumlahBarang;
    int totalHargaBayar;

    public StrukBelanja(String nomorTransaksi, String tanggalPembelian, int jumlahBarang, int totalHargaBayar) {
        this.nomorTransaksi = nomorTransaksi;
        this.tanggalPembelian = tanggalPembelian;
        this.jumlahBarang = jumlahBarang;
        this.totalHargaBayar = totalHargaBayar;
    }
}
