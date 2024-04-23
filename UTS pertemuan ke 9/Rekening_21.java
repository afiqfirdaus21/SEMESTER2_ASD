public class Rekening_21 {
    String noRekening;
    String nama;
    String namaIbu;
    String phone;
    String email;

    Rekening_21(String a, String b, String c, String d, String e) {
        this.noRekening = a;
        this.nama = b;
        this.namaIbu = c;
        this.phone = d;
        this.email = e;
    }

    @Override
    public String toString() {
        return noRekening + ", " + nama + ", " + namaIbu + ", " + phone + ", " + email;
    }
}
