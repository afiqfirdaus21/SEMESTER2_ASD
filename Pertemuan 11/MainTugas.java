public class MainTugas {
    public static void main(String[] args) {
        TugasNomor2_isi hunt = new TugasNomor2_isi();
        
        // Menambahkan titik-titik ke permainan
        hunt.addPoint("Apa ibukota Indonesia?", "Jakarta");
        hunt.addPoint("2 + 2 sama dengan berapa?", "4");
        hunt.addPoint("Siapa presiden pertama Indonesia?", "Soekarno");
        hunt.addPoint("Apa warna langit di siang hari?", "Biru");

        // Memulai permainan
        hunt.startHunt();
    }
}
