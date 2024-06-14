// import java.util.LinkedList;
// import java.util.List;
// public class ContohList {
//     public static void main(String[] args) {
//         // Bagian pertama menggunakan List21
//         List21 l = new List21();
//         l.add(1);
//         l.add(2);
//         l.add(3);
//         l.add("Cireng");
//         System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));
//         l.add(4);
//         l.remove(0);
//         System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %s\n", l.get(0), l.size(), l.get(l.size() - 1));

//         // Bagian kedua menggunakan LinkedList
//         List<String> names = new LinkedList<>();
//         names.add("Noureen");
//         names.add("akhleema");
//         names.add("Shannum");
//         names.add("Uwais");
//         names.add("Al-Qarni");

//         System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
//         names.set(0, "My Kid");
//         System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.get(0), names.size(), names.get(names.size() - 1));
//         System.out.println("Names: " + names.toString());
//     }
// }

// Modifikasi soal nomor 2
import java.util.LinkedList;
import java.util.List;

public class ContohList {
    public static void main(String[] args) {
        // Bagian pertama menggunakan List21 dengan tipe Integer
        List21<Integer> l = new List21<>();
        l.add(1);
        l.add(2);
        l.add(3);
        // l.add("Cireng"); // Ini akan menyebabkan error karena "Cireng" bukan Integer
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n", l.get(0), l.size(),
                l.get(l.size() - 1));
        l.add(4);
        l.remove(0);
        System.out.printf("Elemen 0: %d total elemen: %d elemen terakhir: %d\n", l.get(0), l.size(),
                l.get(l.size() - 1));

        // Bagian kedua menggunakan LinkedList
        LinkedList<String> names = new LinkedList<>();
        names.add("Noureen");
        names.add("akhleema");
        names.add("Shannum");
        names.add("Uwais");
        names.add("Al-Qarni");

        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.get(0), names.size(),
                names.get(names.size() - 1));
        names.set(0, "My Kid");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.get(0), names.size(),
                names.get(names.size() - 1));
        System.out.println("Names: " + names.toString());

        names.push("Mei-mei");
        System.out.printf("Elemen 0: %s total elemen: %d elemen terakhir: %s\n", names.getFirst(), names.size(),
                names.getLast());
        System.out.println("Names: " + names.toString());
    }
}