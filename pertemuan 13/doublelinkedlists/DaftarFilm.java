package doublelinkedlists;
import java.util.Scanner;
public class DaftarFilm {

    public static class Film {

        int idFilm;
        String judul;
        double rating;
        Film prev, next;

        Film(int idFilm, String judul, double rating, Film prev, Film next) {
            this.idFilm = idFilm;
            this.judul = judul;
            this.rating = rating;
            this.prev = prev;
            this.next = next;
        }

    }

    public static class DoubleLinkedLists {

        Film head;
        int size;

        public DoubleLinkedLists() {
            head = null;
            size = 0;
        }

        public boolean IsEmpty() {
            return head == null;
        }

        public void AddFirst(int idFilm, String judul, double rating) {

            if (IsEmpty()) {
                head = new Film(idFilm, judul, rating, null, null);
            } else {
                Film newNode = new Film(idFilm, judul, rating, null, head);
                head.prev = newNode;
                head = newNode;
            }

            size++;

        }

        public void AddLast(int idFilm, String judul, double rating) {

            if (IsEmpty()) {
                AddFirst(idFilm, judul, rating);
            } else {
                Film current = head;
                while (current.next != null) {
                    current = current.next;
                }
                Film newNode = new Film(idFilm, judul, rating, current, null);
                current.next = newNode;
                size++;
            }

        }

        public void Add(int idFilm, String judul, double rating, int index) throws Exception {

            if (IsEmpty()) {

                AddFirst(idFilm, judul, rating);

            } else if (index < 0 || index > size) {

                throw new Exception("Nilai index diluar batas");

            } else {

                Film current = head;
                int i = 0;

                while (i < index) {
                    current = current.next;
                    i++;
                }

                if (current.prev == null) {

                    Film newNode = new Film(idFilm, judul, rating, null, current);
                    current.prev = newNode;
                    head = newNode;

                } else {

                    Film newNode = new Film(idFilm, judul, rating, current.prev, current);
                    newNode.prev = current.prev;
                    newNode.next = current;
                    current.prev.next = newNode;
                    current.prev = newNode;

                }

            }

            size++;

        }

        public void RemoveLast() throws Exception {
            if (IsEmpty()) {
                throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
            } else if (head.next == null) {
                Film removedFilm = head;
                System.out.println("================================================================");
                System.out.println("                       FILM YANG DIHAPUS");
                System.out.println("================================================================");
                System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                System.out.println("----------------------------------------------------------------");
                System.out.println(
                        String.format("| %-8d| %-37s| %.2f   |", removedFilm.idFilm, removedFilm.judul,
                                removedFilm.rating));
                System.out.println("================================================================");
                head = null;
                size--;
                return;
            }

            Film current = head;

            while (current.next.next != null) {
                current = current.next;
            }

            Film removedFilm = current.next;
            System.out.println("================================================================");
            System.out.println("                       FILM YANG DIHAPUS");
            System.out.println("================================================================");
            System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
            System.out.println("----------------------------------------------------------------");
            System.out.println(
                    String.format("| %-8d| %-37s| %.2f   |", removedFilm.idFilm, removedFilm.judul,
                            removedFilm.rating));
            System.out.println("================================================================");

            current.next = null;
            size--;
        }

        public void RemoveFirst() throws Exception {

            if (IsEmpty()) {
                throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
            } else if (size == 1) {
                RemoveLast();
            } else {
                System.out.println("================================================================");
                System.out.println("                       FILM YANG DIHAPUS");
                System.out.println("================================================================");
                System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                System.out.println("----------------------------------------------------------------");
                System.out.println(
                        String.format("| %-8d| %-37s| %.2f   |", head.idFilm, head.judul, head.rating));
                System.out.println("================================================================");
                head = head.next;
                head.prev = null;
                size--;
            }

        }

        public void Remove(int index) throws Exception {

            if (IsEmpty() || index >= size) {
                throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
            } else if (index == 0) {
                RemoveFirst();
            } else {

                Film current = head;
                int i = 0;

                while (i < index) {
                    current = current.next;
                    i++;
                }

                if (current.next == null) {
                    System.out.println("================================================================");
                    System.out.println("                       FILM YANG DIHAPUS");
                    System.out.println("================================================================");
                    System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(
                            String.format("| %-8d| %-37s| %.2f   |", current.idFilm, current.judul, current.rating));
                    System.out.println("================================================================");
                    current.prev.next = null;
                } else if (current.prev == null) {
                    System.out.println("================================================================");
                    System.out.println("                       FILM YANG DIHAPUS");
                    System.out.println("================================================================");
                    System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(
                            String.format("| %-8d| %-37s| %.2f   |", current.idFilm, current.judul, current.rating));
                    System.out.println("================================================================");
                    current = current.next;
                    current.prev = null;
                    head = current;
                } else {
                    System.out.println("================================================================");
                    System.out.println("                       FILM YANG DIHAPUS");
                    System.out.println("================================================================");
                    System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                    System.out.println("----------------------------------------------------------------");
                    System.out.println(
                            String.format("| %-8d| %-37s| %.2f   |", current.idFilm, current.judul, current.rating));
                    System.out.println("================================================================");
                    current.prev.next = current.next;
                    current.next.prev = current.prev;
                }

                size--;

            }

        }

        public int Size() {
            return size;
        }

        public void Clear() {
            head = null;
            size = 0;
        }

        public void Print() {

            if (!IsEmpty()) {

                Film tmp = head;

                System.out.println("================================================================");
                System.out.println("                         DAFTAR FILM");
                System.out.println("================================================================");
                System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                System.out.println("----------------------------------------------------------------");

                while (tmp != null) {
                    System.out.println(
                            String.format("| %-8d| %-37s| %.2f   |", tmp.idFilm, tmp.judul, tmp.rating));
                    tmp = tmp.next;
                }

                System.out.println("================================================================");

            } else {

                System.out.println("Daftar film masih kosong");

            }

        }

        public Film CariFilm(int cari) {

            Film current = head;

            while (current != null) {
                if (current.idFilm == cari) {
                    return current;
                }
                current = current.next;
            }

            return null;

        }

        public void PrintDescending() {

            if (!IsEmpty()) {

                Film[] films = new Film[size];
                Film current = head;
                int index = 0;

                while (current != null) {
                    films[index] = current;
                    current = current.next;
                    index++;
                }

                for (int i = 0; i < size - 1; i++) {
                    for (int j = 0; j < size - i - 1; j++) {
                        if (films[j].rating < films[j + 1].rating) {

                            Film temp = films[j];
                            films[j] = films[j + 1];
                            films[j + 1] = temp;
                        }
                    }
                }

                System.out.println("================================================================");
                System.out.println("           DAFTAR FILM DESCENDING BERDASARKAN RATING");
                System.out.println("================================================================");
                System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                System.out.println("----------------------------------------------------------------");

                for (Film film : films) {
                    System.out.println(
                            String.format("| %-8d| %-37s| %.2f   |", film.idFilm, film.judul, film.rating));
                }

                System.out.println("================================================================");

            } else {
                System.out.println("Daftar film masih kosong");
            }

        }

        public Film CariFilmByJudul(String judul) {
            Film current = head;

            while (current != null) {
                if (current.judul.equalsIgnoreCase(judul)) {
                    return current;
                }
                current = current.next;
            }

            return null;
        }

        public boolean RemoveFilmByJudul(String judul) throws Exception {
            if (IsEmpty()) {
                System.out.println("Linked lists masih kosong, tidak ada film yang dihapus!");
                return false;
            }

            Film current = head;

            while (current != null) {
                if (current.judul.equalsIgnoreCase(judul)) {

                    if (current.prev == null) {
                        RemoveFirst();
                    } else if (current.next == null) {
                        RemoveLast();
                    } else {
                        System.out.println("================================================================");
                        System.out.println("                       FILM YANG DIHAPUS");
                        System.out.println("================================================================");
                        System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(
                                String.format("| %-8d| %-37s| %.2f   |", current.idFilm, current.judul,
                                        current.rating));
                        System.out.println("================================================================");
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                        size--;
                    }
                    return true;
                }
                current = current.next;
            }

            System.out.println("Film dengan judul " + judul + " tidak ditemukan");
            return false;
        }

    }

    public static void main(String[] args) throws Exception {

        Scanner input18 = new Scanner(System.in);
        Scanner input18String = new Scanner(System.in);

        DoubleLinkedLists dll = new DoubleLinkedLists();

        int pilihan = 0;
        int idFilm, cari, indeks = 0;
        String judul;
        double rating;

        do {

            System.out.println("================================================================");
            System.out.println("                     DATA FILM LAYAR LEBAR");
            System.out.println("================================================================");
            System.out.println("1. Tambah Film Awal");
            System.out.println("2. Tambah Film Akhir");
            System.out.println("3. Tambah Film Index Tertentu");
            System.out.println("4. Hapus Film Pertama");
            System.out.println("5. Hapus Film Terakhir");
            System.out.println("6. Hapus Film Index Tertentu");
            System.out.println("7. Tampilkan Daftar Film");
            System.out.println("8. Cari Film Berdasarkan Id Film");
            System.out.println("9. Urutkan Daftar Film Berdasarkan Rating (Desc)");
            System.out.println("10. Cari Film Berdasarkan Judul");
            System.out.println("11. Hapus Film Berdasarkan Judul");
            System.out.println("12. Keluar");
            System.out.println("================================================================");
            System.out.print("Masukkan Pilihan    : ");

            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:

                    System.out.println("================================================================");
                    System.out.println("                     DATA FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("ID Film     : ");
                    idFilm = input18.nextInt();
                    input18.nextLine();
                    System.out.print("Judul Film  : ");
                    judul = input18String.nextLine();
                    System.out.print("Rating Film : ");
                    rating = input18.nextDouble();

                    dll.AddFirst(idFilm, judul, rating);

                    break;
                case 2:

                    System.out.println("================================================================");
                    System.out.println("                     DATA FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("ID Film     : ");
                    idFilm = input18.nextInt();
                    input18.nextLine();
                    System.out.print("Judul Film  : ");
                    judul = input18String.nextLine();
                    System.out.print("Rating Film : ");
                    rating = input18.nextDouble();

                    dll.AddLast(idFilm, judul, rating);

                    break;
                case 3:

                    System.out.println("================================================================");
                    System.out.println("                     DATA FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("ID Film     : ");
                    idFilm = input18.nextInt();
                    input18.nextLine();
                    System.out.print("Judul Film  : ");
                    judul = input18String.nextLine();
                    System.out.print("Rating Film : ");
                    rating = input18.nextDouble();
                    System.out.print("Indeks      : ");
                    indeks = input18.nextInt();

                    dll.Add(idFilm, judul, rating, indeks);

                    break;
                case 4:
                    dll.RemoveFirst();
                    break;
                case 5:
                    dll.RemoveLast();
                    break;
                case 6:
                    System.out.println("================================================================");
                    System.out.println("                    HAPUS FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("Masukkan indeks film yang akan dihapus    : ");
                    indeks = input18.nextInt();
                    dll.Remove(indeks);
                    break;
                case 7:
                    dll.Print();
                    break;
                case 8:

                    System.out.println("================================================================");
                    System.out.println("                      CARI FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("Masukkan ID Film yang akan dicari         : ");
                    cari = input18.nextInt();
                    Film hasil = dll.CariFilm(cari);

                    if (hasil != null) {

                        System.out.println("================================================================");
                        System.out.println("                      HASIL PENCARIAN FILM");
                        System.out.println("================================================================");
                        System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(
                                String.format("| %-8d| %-37s| %.2f   |", hasil.idFilm, hasil.judul, hasil.rating));
                        System.out.println("================================================================");

                    } else {
                        System.out.println("Film dengan ID " + cari + " tidak ditemukan");
                    }

                    break;
                case 9:
                    dll.PrintDescending();
                    break;
                case 10:

                    System.out.println("================================================================");
                    System.out.println("                      CARI FILM LAYAR LEBAR");
                    System.out.println("================================================================");

                    System.out.print("Masukkan ID Film yang akan dicari         : ");
                    String cariJudul = input18String.nextLine();
                    Film hasilJudul = dll.CariFilmByJudul(cariJudul);

                    if (hasilJudul != null) {

                        System.out.println("================================================================");
                        System.out.println("                      HASIL PENCARIAN FILM");
                        System.out.println("================================================================");
                        System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(
                                String.format("| %-8d| %-37s| %.2f   |", hasilJudul.idFilm, hasilJudul.judul,
                                        hasilJudul.rating));
                        System.out.println("================================================================");

                    } else {
                        System.out.println("Film dengan judul " + cariJudul + " tidak ditemukan");
                    }

                    break;
                case 11:
                    System.out.println("================================================================");
                    System.out.println("              HAPUS FILM BERDASARKAN JUDUL");
                    System.out.println("================================================================");
                    System.out.print("Masukkan judul film yang akan dihapus    : ");
                    input18.nextLine();
                    String judulHapus = input18.nextLine();
                    Film filmHapus = dll.CariFilmByJudul(judulHapus);
                    if (filmHapus != null) {
                        System.out.println("================================================================");
                        System.out.println("                    FILM YANG DIHAPUS");
                        System.out.println("================================================================");
                        System.out.println("| No Film | Judul Film\t\t\t\t | Rating |");
                        System.out.println("----------------------------------------------------------------");
                        System.out.println(
                                String.format("| %-8d| %-37s| %.2f   |", filmHapus.idFilm, filmHapus.judul,
                                        filmHapus.rating));
                        System.out.println("================================================================");
                        dll.RemoveFilmByJudul(judulHapus);
                    } else {
                        System.out.println("Film dengan judul " + judulHapus + " tidak ditemukan");
                    }
                    break;
                case 12:
                    System.out.println("================================================================");
                    System.out.println("                        TERIMA KASIH");
                    System.out.println("================================================================");
                    break;
                default:
                    System.out.println("================================================================");
                    System.out.println("                     PILIHAN TIDAK VALID");
                    System.out.println("================================================================");
                    break;
            }

        } while (pilihan != 12);

        input18.close();
        input18String.close();
    }
}