public class HP {

    String merek;
    String tipe;
    float ukuranLayar;
    int harga;

    public HP(String mr, String tp, float ukuran) {
        merek = mr;
        tipe = tp;
        ukuranLayar = ukuran;
    }

    void cekKondisi(boolean c) {
        if (c == true) {
            System.out.println("HP ini kondisinya second\n");
        } else {
            System.out.println("HP ini kondisinya masih baru\n");
        }
    }

    void tampilkanInformasi() {
        System.out.printf("HP merek %s tipe %s dengan ukuran layar %.1f\n", merek, tipe, ukuranLayar);
    }

    void mengirimPesan(String pesan, String penerima, String paketData) {
        if (paketData.equalsIgnoreCase("ada")) {
            System.out.printf("Pesan %s berhasil dikirim ke %s ", pesan, penerima);
        } else {
            System.out.printf("Pengiriman pesan ke %s gagal", penerima);
        }
    }

    public static class HPMain {
    
        public static void main(String[] args) {
            HP phone1 = new HP("Samsung", "Z Flip 4", 6.7f);
            phone1.tampilkanInformasi();
            phone1.cekKondisi(false);
            HP phone2 = new HP("Xiaomi", "12T", 6.67f);
        }
        
    }

}
