public class HotelService {
    private Hotel[] rooms;
    private int count;

    public HotelService(int size) {
        rooms = new Hotel[size];
        count = 0;
    }

    public void tambah(Hotel H) {
        if (count < rooms.length) {
            rooms[count] = H;
            count++;
        } else {
            System.out.println("Kamar penuh, tidak dapat menambahkan lagi.");
        }
    }

    public void tampilAll() {
        for (int i = 0; i < count; i++) {
            System.out.println("Nama Hotel: " + rooms[i].nama + ", Kota: " + rooms[i].kota + ", Harga: "
                    + rooms[i].harga + ", Bintang: " + rooms[i].bintang);
        }
    }

    public void bubbleSort() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (rooms[j].harga > rooms[j + 1].harga) {
                    Hotel temp = rooms[j];
                    rooms[j] = rooms[j + 1];
                    rooms[j + 1] = temp;
                }
            }
        }
    }

    public void selectionSort() {
        for (int i = 0; i < count - 1; i++) {
            int idxMin = i;
            for (int j = i + 1; j < count; j++) {
                if (rooms[j].bintang > rooms[idxMin].bintang) {
                    idxMin = j;
                }
            }
            Hotel temp = rooms[i];
            rooms[i] = rooms[idxMin];
            rooms[idxMin] = temp;
        }
    }
}
