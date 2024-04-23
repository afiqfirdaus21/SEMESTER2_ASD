public class PersegiPanjang21 {
    public int panjang;
    public int lebar;

    public PersegiPanjang21(int panjang, int lebar) {
        this.panjang = panjang;
        this.lebar = lebar;
    }

    void cetakinfo(int i){
        System.out.println("Persegi panjang ke-" 
        + (i+1)+", panjang: "+panjang+", lebar:"+lebar);
    }
    void hitungLuas() {
        int luas = panjang * lebar;
        System.out.println("Luas: " + luas);
    }

    void hitungKeliling() {
        int keliling = 2 * (panjang + lebar);
        System.out.println("Keliling: " + keliling);
    }
}