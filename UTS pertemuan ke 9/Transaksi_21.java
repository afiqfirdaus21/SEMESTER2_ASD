public class Transaksi_21 {
    double saldo;
    double saldoAwal;
    double saldoAkhir;
    String tanggalTransaksi;
    String type;

    Transaksi_21(double a, double b, double c, String d, String e) {
        this.saldo = a;
        this.saldoAwal = b;
        this.saldoAkhir = c;
        this.tanggalTransaksi = d;
        this.type = e;
    }

    @Override
    public String toString() {
        return "Saldo: " + saldo + ", Saldo Awal: " + saldoAwal + ", Saldo Akhir: " + saldoAkhir + ", Tanggal Transaksi: " + tanggalTransaksi;
    }
}