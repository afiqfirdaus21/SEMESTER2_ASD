public class Nilai {
    Mahasiswa mahasiswa;
    Matakuliah matakuliah;
    double nilai;

    public Nilai(Mahasiswa mahasiswa, Matakuliah matakuliah, double nilai) {
        this.mahasiswa = mahasiswa;
        this.matakuliah = matakuliah;
        this.nilai = nilai;
    }

    public Mahasiswa getMahasiswa() {
        return mahasiswa;
    }

    public Matakuliah getMatakuliah() {
        return matakuliah;
    }

    public double getNilai() {
        return nilai;
    }

    @Override

    public String toString() {
        return "| " + mahasiswa.getNim() + "\t| " + mahasiswa.getNama() + "\t\t| " +
                matakuliah.getNamaMatkul() + "\t| " + matakuliah.getSks() + "\t| " +
                nilai + "\t|";
    }
}