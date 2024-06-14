// public class BinaryTreeArrayMain21 {
//     public static void main(String[] args) {
//         BinaryTreeArray21 bta = new BinaryTreeArray21();
//         int[] data = { 6, 4, 8, 3, 5, 7, 9, 0, 0, 0 };
//         int idxLast = 6;
//         bta.populateData(data, idxLast);
//         System.out.print("\nInOrder Traversal : ");
//         bta.traversalInOrder(0);
//         System.out.println("\n");
//     }
// }

// TUGAS MODIFIKASI
import java.util.Scanner;

public class BinaryTreeArrayMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan size Binary Tree Array : ");
        int size = sc.nextInt();
        BinaryTreeArray21 bta = new BinaryTreeArray21(size);
        System.out.print("Masukkan data (pisahkan dengan spasi) : ");
        sc.nextLine();
        for (int i = 0; i < size; i++) {
            int num = sc.nextInt();
            bta.add(num);
        }
        System.out.print("InOrder Traversal : ");
        bta.traverseInOrder();
        System.out.println();
        System.out.print("PreOrder Traversal : ");
        bta.traversePreOrder();
        System.out.println();
        System.out.print("PostOrder Traversal : ");
        bta.traversePostOrder();
        System.out.println();
        sc.close();
    }
}