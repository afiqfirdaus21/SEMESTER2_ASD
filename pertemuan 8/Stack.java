public class Stack {
    int size, top;
    Pakaian21 data[];

    Stack(int size) {
        this.size = size;
        data = new Pakaian21[size];
        top = -1;
    }

    boolean IsEmpty() {
        if (top == -1) {
            return true;
        } else {
            return false;
        }
    }

    boolean IsFull() {
        if (top == size - 1) {
            return true;
        } else {
            return false;
        }
    }

    void push(Pakaian21 pkn) {
        if (!IsFull()) {
            top++;
            data[top] = pkn;
        } else {
            System.out.println("Isi Stack Penuh!");
        }

    }

    void pop() {
        if (!IsEmpty()) {
            Pakaian21 x = data[top];
            top--;
            System.out.println(
                    "Data yang keluar: " + x.jenis + " " + x.warna + " " + x.merk + " " + x.ukuran + " " + x.harga);

        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    void peek() {
        if (!IsEmpty()) {
            System.out.println("Elemen teratas: " + data[top].jenis + " " + data[top].warna + " " + data[top].merk + " "
                    + data[top].ukuran + " " + data[top].harga);
        } else {
            System.out.println("Stack kosong, tidak ada elemen untuk diambil (peek)");
        }
    }

    void print() {
        System.out.println("Isi Stack: ");
        for (int i = top; i >= 0; i--) {
            System.out.println(data[i].jenis + " " + data[i].warna + " " + data[i].merk + " " + data[i].ukuran + " "
                    + data[i].harga + " ");

        }
        System.out.println(" ");
    }

    void clear() {
        if (!IsEmpty()) {
            for (int i = top; i >= 0; i--) {
                top--;
            }
            System.out.println("Stack sudah dikosongkan");
        } else {
            System.out.println("Stack masih kosong");
        }
    }

    void getMax() {
        if (!IsEmpty()) {
            Pakaian21 maxPakaian = data[0];
            for (int i = 1; i <= top; i++) {
                if (data[i].harga > maxPakaian.harga) {
                    maxPakaian = data[i];
                }
            }
            System.out.println("Pakaian dengan harga tertinggi: " + maxPakaian.jenis + " " + maxPakaian.warna + " "
                    + maxPakaian.merk + " " + maxPakaian.ukuran + " " + maxPakaian.harga);
        } else {
            System.out.println("Stack kosong, tidak ada pakaian untuk diperiksa harga tertinggi");
        }
    }
}