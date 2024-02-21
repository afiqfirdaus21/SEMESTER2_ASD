public class HPMain {
    
    public static void main(String[] args) {
        HP phone1 = new HP(null, null, 0);
        phone1.merek = "Samsung";
        phone1.tipe = "Z Flip 4";
        phone1.ukuranLayar = 6.7f;
        phone1.tampilkanInformasi();
        phone1.cekKondisi(false);
        HP phone2 = new HP("Xiaomi", "12T", 6.67f);
    }
    

}