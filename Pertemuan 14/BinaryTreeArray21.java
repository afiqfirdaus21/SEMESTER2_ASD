// public class BinaryTreeArray21 {
//     int[] data;
//     int idxLast;

//     public BinaryTreeArray21() {
//         data = new int[10];
//     }

//     void populateData(int data[], int idxLast) {
//         this.data = data;
//         this.idxLast = idxLast;
//     }

//     void traversalInOrder(int idxStart) {
//         if (idxStart <= idxLast && data[idxStart] != 0) {
//             traversalInOrder(2 * idxStart + 1);
//             System.out.print(data[idxStart] + " ");
//             traversalInOrder(2 * idxStart + 2);
//         }
//     }
// }

// TUGAS MODIFIKASI
public class BinaryTreeArray21 {
    int[] data;
    int idxLast;

    public BinaryTreeArray21(int maxSize) {
        data = new int[maxSize];
        idxLast = -1;
    }

    void populateData(int[] sourceData, int sourceIdxLast) {
        for (int i = 0; i <= sourceIdxLast; i++) {
            add(sourceData[i]);
        }
    }

    void add(int newData) {
    if (idxLast + 1 >= data.length) {
    System.out.println("Binary tree array is full, cannot add new element.");
    return;
    }
    idxLast++;
    data[idxLast] = newData;
    }

    void traverseInOrder() {
        traverseInOrder(0);
    }

    public void traverseInOrder(int idxStart) {
        if (idxStart < data.length && data[idxStart] != 0) {
            traverseInOrder(2 * idxStart + 1);
            System.out.print(data[idxStart] + " ");
            traverseInOrder(2 * idxStart + 2);
        }
    }

    void traversePreOrder() {
        traversePreOrder(0);
    }

    public void traversePreOrder(int idxStart) {
        if (idxStart < data.length && data[idxStart] != 0) {
            System.out.print(data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder() {
        traversePostOrder(0);
    }

    public void traversePostOrder(int idxStart) {
        if (idxStart < data.length && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(data[idxStart] + " ");
        }
    }
}