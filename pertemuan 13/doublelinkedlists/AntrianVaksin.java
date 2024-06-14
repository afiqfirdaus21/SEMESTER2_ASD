package doublelinkedlists;

import java.util.*;

public class AntrianVaksin {

    static Scanner input18 = new Scanner(System.in);
    static Scanner input18String = new Scanner(System.in);

    public static class Antrian {

        int noAntrian;
        String nama;
        Antrian prev, next;

        Antrian(Antrian prev, int noAntrian, Antrian next, String nama) {
            this.prev = prev;
            this.noAntrian = noAntrian;
            this.next = next;
            this.nama = nama;
        }

    }

    public static class DoubleLinkedLists {

        Antrian head;
        int size;

        public DoubleLinkedLists() {
            head = null;
            size = 0;
        }

        public boolean IsEmpty() {
            return head == null;
        }

        public void Add(int noAntrian, String nama) {

            if (IsEmpty()) {

                head = new Antrian(null, noAntrian, null, nama);

            } else {

                Antrian newNode = new Antrian(null, noAntrian, head, nama);
                head.prev = newNode;
                head = newNode;

            }

            size++;

        }

        public void Remove() throws Exception {

            if (IsEmpty()) {
                throw new Exception("Linked lists masih kosong, tidak dapat dihapus!");
            } else if (head.next == null) {
                System.out.println("Antrian nomor " + head.noAntrian + " dengan nama " + head.nama + " telah divaksinasi");
                head = null;
                size--;
                return;
            }
        
            Antrian current = head;
        
            while (current.next.next != null) {
                current = current.next;
            }
        
            System.out.println("Antrian nomor " + current.next.noAntrian + " dengan nama " + current.next.nama + " telah divaksinasi");
            current.next = null;
            size--;
        }
        

        public int Size() {
            return size;
        }

        public void Print() {
            if (!IsEmpty()) {

                Antrian tmp = head;
                System.out.println("========================================");
                System.out.println("            DAFTAR ANTRIAN");
                System.out.println("========================================");
                System.out.println("|No Antrian\t|Nama\t\t|");
                System.out.println("----------------------------------------");

                while (tmp != null) {

                    System.out.println("|" + tmp.noAntrian + "\t\t" + "|" + tmp.nama + "\t\t|");
                    tmp = tmp.next;

                }

                System.out.println("\n========================================");
                System.out.println("Berhasil menambahkan antrian");
                System.out.println("Sisa Antrian    : " + size);

            } else {

                System.out.println("Antrian masih kosong");

            }
        }

    }

    public static void main(String[] args) throws Exception {

        DoubleLinkedLists dll = new DoubleLinkedLists();

        int pilihan = 0;
        int noAntrian;
        String nama;

        do {

            System.out.println("========================================");
            System.out.println("     PENGANTRI VAKSIN EXTRAVAGANZA");
            System.out.println("========================================");
            System.out.println("1. Tambah antrian");
            System.out.println("2. Hapus antrian");
            System.out.println("3. Daftar antrian");
            System.out.println("4. Keluar");
            System.out.println("========================================");
            System.out.print("Masukkan pilihan  : ");
            pilihan = input18.nextInt();

            switch (pilihan) {
                case 1:

                    System.out.println("========================================");
                    System.out.println("            TAMBAH ANTRIAN");
                    System.out.println("========================================");

                    System.out.print("No Antrian  : ");
                    noAntrian = input18.nextInt();
                    System.out.print("Nama Pasien : ");
                    nama = input18String.nextLine();

                    dll.Add(noAntrian, nama);

                    break;

                case 2:

                    dll.Remove();

                    break;

                case 3:

                    dll.Print();

                    break;

                default:

                    System.out.println("========================================");
                    System.out.println("      MASUKKAN PILIHAN YANG BENAR");
                    System.out.println("========================================");

                    break;
            }

        } while (pilihan != 4);

    }

}