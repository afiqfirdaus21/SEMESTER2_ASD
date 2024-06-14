public class Matakuliah {
    
    String kode;
    int sks;
    String namaMatkul;

    public Matakuliah(String kode, String namaMatkul, int sks) {
        this.kode = kode;
        this.sks = sks;
        this.namaMatkul = namaMatkul;
    }

    public String getKode() {
        return kode;
    }

    public String getNamaMatkul() {
        return namaMatkul;
    }

    public int getSks() {
        return sks;
    }

    public String toString() {
        return "| " + kode + "\t| " + namaMatkul + "\t\t\t| " + sks + "\t|";
    }

}