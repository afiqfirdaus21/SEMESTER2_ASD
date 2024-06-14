public class Mahasiswa21 {
    String nim, nama, notelp;

    public Mahasiswa21(){
    }

    public Mahasiswa21(String nim, String nama, String notelp){
        this.nim = nim;
        this.nama = nama;
        this.notelp = notelp;
    }

    @Override
    public String toString(){
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", notelp=" + notelp + '}';
    }
}
