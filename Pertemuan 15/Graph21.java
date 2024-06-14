// public class Graph21 {
//     int vertex;
//     DoubleLinkedList21[] list;

//     public Graph21(int v) {
//         vertex = v;
//         list = new DoubleLinkedList21[v];
//         for (int i = 0; i < v; i++) {
//             list[i] = new DoubleLinkedList21();
//         }
//     }

//     public void addEdge(int asal, int tujuan, int jarak) {
//         list[asal].addFirst(tujuan, jarak);
//         list[tujuan].addFirst(asal, jarak);
//     }

//     public void degree(int asal) throws Exception {
//         int k, totalIn = 0, totalOut = 0;
//         for(int i=0; i< vertex; i++){
//             for (int j = 0; j< list[i].size(); j++){
//                 if (list[i].get(j) == asal){
//                     ++totalIn;
//                 }
//             }
//             for(k=0;k < list[asal].size(); k++){
//                 list[asal].get(k);
//             }
//             totalOut = k;
//         }

//         System.out.println("InDegree dari Gedung " + (char) ('A' + asal) + ": " + totalIn);
//         System.out.println("OutDegree dari Gedung " + (char) ('A' + asal) + ": " + totalOut);
//         System.out.println("Degree dari Gedung " + (char) ('A' + asal) + ": " + (totalIn + totalOut));
//     }

//     public void removeEdge(int asal, int tujuan) throws Exception {

//         for(int i = 0; i < vertex; i++){
//             if(i == tujuan){
//                 list[asal].remove(tujuan);
//             }
//         }
//     }

//     public void removeAllEdges() {
//         for (int i = 0; i < vertex; i++) {
//             list[i].clear();
//         }
//         System.out.println("Graf berhasil dikosongkan");
//     }

//     public void printGraph() throws Exception {
//         for (int i = 0; i < vertex; i++) {
//             if (list[i].size() > 0) {
//                 System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan: ");
//                 for (int j = 0; j < list[i].size(); j++) {
//                     System.out.print((char) ('A' + list[i].get(j)) + " (" + list[i].getJarak(j) + " m), ");
//                 }
//                 System.out.println();
//             }
//         }
//     }
// }

// MODIFIKASI SOAL NOMOR 1
public class Graph21 {
    int vertex;
    DoubleLinkedList21 list[];

    public Graph21(int v) {
        vertex = v;
        list = new DoubleLinkedList21[v];
        for (int i = 0; i < v; i++) {
            list[i] = new DoubleLinkedList21();
        }
    }

    public void addEdge(int asal, int tujuan, int jarak) {
        list[asal].addFirst(tujuan, jarak);
    }

    public void degree(int asal) throws Exception {
        int totalIn = 0, totalOut = list[asal].size();
        for (int i = 0; i < vertex; i++) {
            if (i != asal) {
                for (int j = 0; j < list[i].size(); j++) {
                    if (list[i].get(j) == asal) {
                        ++totalIn;
                    }
                }
            }
        }
        System.out.println("InDegree dari gedung " + (char) ('A' +
                asal) + ": " + totalIn);
        System.out.println("OutDegree dari gedung " + (char) ('A' +
                asal) + ": " + totalOut);
        System.out.println("Degree dari gedung " + (char) ('A' +
                asal) + ": " + (totalIn + totalOut));
    }

    public void removeEdge(int asal, int tujuan) throws Exception {
        list[asal].remove(tujuan);
        list[tujuan].remove(asal);
    }

    public void removeAllEdges() {
        for (int i = 0; i < vertex; i++) {
            list[i].clear();
        }
        System.out.println("Graf berhasil dikosongkan");
    }

    public void printGraph() throws Exception {
        for (int i = 0; i < vertex; i++) {
            if (list[i].size() > 0) {
                System.out.print("Gedung " + (char) ('A' + i) + " terhubung dengan ");
                for (int j = 0; j < list[i].size(); j++) {
                    System.out.print((char) ('A' + list[i].get(j))
                            + " (" + list[i].getJarak(j) + " m), ");
                }
                System.out.println();
            }
        }
    }
}