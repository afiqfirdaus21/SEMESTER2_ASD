public class Retur21 {
    String NamaBarang;
    int JumlahRetur;

    public Retur21(String NamaBarang, int JumlahRetur){
        this.NamaBarang = NamaBarang;
        this.JumlahRetur = JumlahRetur;
    }

    public void DisplayInfoRetur(){
        System.out.println("Nama Barang : " + NamaBarang);
        System.out.println("Jumlah Barang yang ingin diRetur :" + JumlahRetur );
    }
}