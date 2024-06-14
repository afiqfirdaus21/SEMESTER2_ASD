// import java.util.Iterator;
// import java.util.List;
// import java.util.ArrayList;

// public class LoopCollection21 {
//     public static void main(String[] args) {
//         // Membuat list dan menambahkan elemen
//         List<String> fruits = new ArrayList<>();
//         fruits.add("Banana");
//         fruits.add("Orange");
//         fruits.add("Watermelon");
//         fruits.add("Leci");
//         fruits.add("Salak");

//         // Menampilkan elemen menggunakan for-each
//         for (String fruit : fruits) {
//             System.out.printf("%s ", fruit);
//         }
//         System.out.println("\n" + fruits.toString());

//         // Mengganti elemen terakhir menjadi "Strawberry"
//         if (!fruits.isEmpty()) {
//             fruits.set(fruits.size() - 1, "Strawberry");
//         }

//         // Menghapus dan menampilkan elemen menggunakan while-loop
//         while (!fruits.isEmpty()) {
//             System.out.printf("%s ", fruits.remove(fruits.size() - 1));
//         }

//         // Menambahkan kembali elemen untuk demonstrasi lebih lanjut
//         fruits.add("Melon");
//         fruits.add("Durian");

//         System.out.println("");

//         // Menampilkan elemen menggunakan Iterator
//         for (Iterator<String> it = fruits.iterator(); it.hasNext(); ) {
//             String fruit = it.next();
//             System.out.printf("%s ", fruit);
//         }
//         System.out.println("");

//         // Menampilkan elemen menggunakan stream
//         fruits.stream().forEach(e -> {
//             System.out.printf("%s ", e);
//         });
//         System.out.println("");

//         // Menampilkan elemen menggunakan for-loop dengan indeks
//         for (int i = 0; i < fruits.size(); i++) {
//             System.out.printf("%s ", fruits.get(i));
//         }
//     }
// }


// // Perubahan soal nomor 6
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class LoopCollection21 {
    public static void main(String[] args) {
        // Membuat list dan menambahkan elemen
        List<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.add("Salak");

        // Menampilkan elemen sebelum penambahan
        System.out.println("Sebelum penambahan dan pengurutan:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        // Menambahkan elemen "Mango", "Guava", dan "Avocado"
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        // Melakukan pengurutan
        Collections.sort(fruits);

        // Menampilkan elemen setelah penambahan dan pengurutan
        System.out.println("\nSetelah penambahan dan pengurutan:");
        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());
    }
}