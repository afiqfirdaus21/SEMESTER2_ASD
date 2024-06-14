// public class DoubleLinkedList21 {
//     Node21 head;
//     int size = 0;

//     public void addFirst(int item, int jarak) {
//         if (isEmpty()) {
//             head = new Node21(null, item, jarak, null);
//         } else {
//             Node21 newNode = new Node21(null, item, jarak, head);
//             head.prev = newNode;
//             head = newNode;
//         }
//         size++;
//     }

//     public int getJarak(int index) throws Exception {
//         if (isEmpty() || index >= size) {
//             throw new Exception("Nilai indeks di luar batas");
//         }
//         Node21 tmp = head;
//         for (int i = 0; i < index; i++) {
//             tmp = tmp.next;
//         }
//         return tmp.jarak;
//     }

//     public void remove(int index) {
//         Node21 current = head;
//         while (current != null) {
//             if (current.data == index) {
//                 if (current.prev != null) {
//                     current.prev.next = current.next;
//                 } else {
//                     head = current.next;
//                 }
//                 if (current.next != null) {
//                     current.next.prev = current.prev;
//                 }
//                 // size--;
//                 break;
//             }
//             current = current.next;
//         }
//     }

// }

// MODIFIKASI SOAL NOMOR 1
public class DoubleLinkedList21 {
    Node21 head;
    int size;

    public DoubleLinkedList21() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, int jarak) {
        if (isEmpty()) {
            head = new Node21(null, item, jarak, null);
        } else {
            Node21 newNode09 = new Node21(null, item, jarak, head);
            head.prev = newNode09;
            head = newNode09;
        }
        size++;
    }

    public int get(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.data;
    }

    public int getJarak(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        }
        Node21 tmp = head;
        for (int i = 0; i < index; i++) {
            tmp = tmp.next;
        }
        return tmp.jarak;
    }

    public void remove(int index) {
        Node21 current = head;
        while (current != null) {
            if (current.data == index) {
                if (current.prev != null) {
                    current.prev.next = current.next;
                } else {
                    head = current.next;
                }
                if (current.next != null) {
                    current.next.prev = current.prev;
                }
                size--;
                break;
            }
            current = current.next;
        }
    }

    public void clear() {
        head = null;
        size = 0;
    }

    public int size() {
        return size;
    }

    public boolean contains(int item){
        Node21 current = head;
        while (current != null){
            if (current.data == item) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
