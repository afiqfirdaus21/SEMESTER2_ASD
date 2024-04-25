public class Pasien21 {
    String nama;
    String nomorIdentitas;
    String jenisKelamin;
    int umur;

    public Pasien21(String nama, String nomorIdentitas, String jenisKelamin, int umur) {
        this.nama = nama;
        this.nomorIdentitas = nomorIdentitas;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String toString() {
        return String.format("%-20s %-20s %-10s %-5d", nama, nomorIdentitas, jenisKelamin, umur);
    }
}