// public class SLLMain21 {
//     public static void main(String[] args) {
//         LinkedList21 myLinkedList = new LinkedList21();
        
//         // Menampilkan linked list kosong
//         myLinkedList.print();

//         // Menambahkan elemen dan menampilkan isi linked list setelah setiap penambahan
//         myLinkedList.addFirst(800);
//         myLinkedList.print();

//         myLinkedList.addFirst(700);
//         myLinkedList.print();

//         myLinkedList.addLast(500);
//         myLinkedList.print();

//         myLinkedList.insertAfter(700, 300);
//         myLinkedList.print();

//         // Menampilkan data pada indeks ke-1
//         System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));

//         // Menghapus elemen dan menampilkan isi linked list setelah setiap penghapusan
//         myLinkedList.remove(300);
//         myLinkedList.print();

//         myLinkedList.removeFirst();
//         myLinkedList.print();

//         myLinkedList.removeLast();
//         myLinkedList.print();
//     }
// }

// TUGAS 1
public class SLLMain21 {
    public static void main(String[] args) {
        LinkedList21 myLinkedList = new LinkedList21();
        myLinkedList.print();

        myLinkedList.addFirst(800);
        myLinkedList.print();

        myLinkedList.addFirst(700);
        myLinkedList.print();

        myLinkedList.addLast(500);
        myLinkedList.print();

        myLinkedList.insertAfter(700, 300);
        myLinkedList.print();

        // a. insertBefore() demonstration
        myLinkedList.insertBefore(800, 600);
        myLinkedList.print();

        // b. insertAt() demonstration
        myLinkedList.insertAt(2, 900);
        myLinkedList.print();

        // c. removeAt() demonstration
        myLinkedList.removeAt(2);
        myLinkedList.print();

        // Demonstrate getData()
        System.out.println("Data pada index ke-1: " + myLinkedList.getData(1));

        // Demonstrate indexOf()
        System.out.println("Data 300 berada pada index ke: " + myLinkedList.indexOf(300));

        // Demonstrate remove()
        myLinkedList.remove(300);
        myLinkedList.print();

        // Demonstrate removeFirst()
        myLinkedList.removeFirst();
        myLinkedList.print();

        // Demonstrate removeLast()
        myLinkedList.removeLast();
        myLinkedList.print();

        // add first
        myLinkedList.addFirst(800);
        myLinkedList.print();

        // insert at
        myLinkedList.insertAt(3, 700);
        myLinkedList.print();

        // remove at
        myLinkedList.removeAt(3);
        myLinkedList.print();
    }
}
