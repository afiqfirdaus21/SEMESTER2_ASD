public class Main {
    public static void main(String[] args) {
        HotelService service = new HotelService(5);

        service.tambah(new Hotel("Hotel A", "Jakarta", 500000, (byte) 4));
        service.tambah(new Hotel("Hotel B", "Surabaya", 300000, (byte) 3));
        service.tambah(new Hotel("Hotel C", "Bali", 700000, (byte) 5));
        service.tambah(new Hotel("Hotel D", "Yogyakarta", 400000, (byte) 2));
        service.tambah(new Hotel("Hotel E", "Bandung", 600000, (byte) 4));

        System.out.println("Sebelum sorting:");
        service.tampilAll();

        System.out.println("\nSetelah sorting berdasarkan harga (bubble sort):");
        service.bubbleSort();
        service.tampilAll();

        System.out.println("\nSetelah sorting berdasarkan bintang (selection sort):");
        service.selectionSort();
        service.tampilAll();
    }
}
