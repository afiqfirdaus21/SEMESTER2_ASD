public class NilaiMahasiswa21 {
    public int NIM;
    public String nama;
    public String Jeniskelamin;
    public double IPK;
    public int Ratarata;

    public NilaiMahasiswa21(String nama, String Jeniskelamin, int NIM, double IPK){

        this.nama = nama;
        this.Jeniskelamin = Jeniskelamin;
        this.NIM = NIM;
        this.IPK = IPK;
    }

    public void displayinfo(){
        System.out.println("Nama Mahasiswa : " + nama);
        System.out.println("Jenis Kelamin : "+ Jeniskelamin);
        System.out.println("NIM : "+ NIM);
        System.out.println("IPK : "+ IPK);
    }
}
