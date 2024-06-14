import java.util.ArrayList;
import java.util.List;

public class Mahasiswa {

    String nim;
    String nama;
    String noTelp;
    List<Nilai> nilaiList;

    public Mahasiswa() {
    }

    public Mahasiswa(String nim, String nama, String noTelp) {
        this.nim = nim;
        this.nama = nama;
        this.noTelp = noTelp;
        nilaiList = new ArrayList<>();
    }

    @Override

    public String toString() {
        return "| " + nim + "\t\t\t| " + nama + "\t\t\t| " + noTelp + "\t\t|";
    }

    public String getNim() {
        return nim;
    }

    public String getNama() {
        return nama;
    }

    public void tambahNilai(Nilai nilai) {
        nilaiList.add(nilai);
    }

    public List<Nilai> getNilaiList() {
        return nilaiList;
    }

}