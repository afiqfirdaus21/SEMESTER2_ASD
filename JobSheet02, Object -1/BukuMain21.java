public class BukuMain21 {
    public static void main(String[] args) {
        Buku21 bk1 = new Buku21();
        bk1.judul = "Today Ends Tomorrow Comes";
        bk1.pengarang = "Denada Pratiwi";
        bk1.halaman = 198;
        bk1.stok = 13;
        bk1.harga = 71000;

        bk1.tampilInformasi();
        bk1.terjual(5);
        bk1.gantiHarga(60000);
        bk1.tampilInformasi();

        Buku21 bk2 = new Buku21("Self Reward", "Mahendra Ayesha", 160, 29, 59000);
        bk2.terjual(11);
        bk2.tampilInformasi();

        Buku21 bukuAfiq = new Buku21("Laskar Pelangi", "Andrea Hirata", 529, 100, 79200);
        bukuAfiq.terjual(18);
        bukuAfiq.tampilInformasi();

        int jumlahTerjual = 5;
        int hargaTotal = bukuAfiq.hitungHargaTotal(jumlahTerjual);
        int diskon = bukuAfiq.hitungDiskon(hargaTotal);
        int hargaBayar = bukuAfiq.hitungHargaBayar(hargaTotal, diskon);

        System.out.println("Jumlah terjual : " + jumlahTerjual);
        System.out.println("Harga total: Rp " + hargaTotal);
        System.out.println("Diskon: Rp " + diskon);
        System.out.println("Harga bayar: Rp " + hargaBayar);
    }
}
