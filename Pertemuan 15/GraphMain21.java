// public class GraphMain21 {
//     public static void main(String[] args) throws Exception{
//         Graph21 gedung = new Graph21(6);
//         gedung.addEdge(0, 1, 50);
//         gedung.addEdge(0, 2, 100);
//         gedung.addEdge(1, 3, 70);
//         gedung.addEdge(2, 3, 40);
//         gedung.addEdge(3, 4, 60);
//         gedung.addEdge(4, 5, 80);
//         gedung.degree(0);
//         gedung.printGraph();
//         gedung.removeEdge(1, 3);
//         gedung.printGraph();
//     }
// }

// MODIFIKASI SOAL NOMOR 1
// public class GraphMain21 {
//     public static void main(String[] args) throws Exception {
//         Graph21 gedung = new Graph21(6);
//         gedung.addEdge(0, 1, 50);
//         gedung.addEdge(0, 2, 100);
//         gedung.addEdge(1, 3, 70);
//         gedung.addEdge(2, 3, 40);
//         gedung.addEdge(3, 4, 60);
//         gedung.addEdge(4, 5, 80);
//         gedung.degree(0);
//         gedung.printGraph();
//         gedung.removeEdge(1, 3);
//         gedung.printGraph();
//     }
// }

public class GraphMain21 {
    public static void main(String[] args) throws Exception {
        try {
            Graph21 gedung = new Graph21(6);
            gedung.addEdge(0, 1, 50);
            gedung.addEdge(0, 2, 100);
            gedung.addEdge(1, 3, 70);
            gedung.addEdge(2, 3, 40);
            gedung.addEdge(3, 4, 60);
            gedung.addEdge(4, 5, 80);
            gedung.degree(0);
            gedung.printGraph();
        } catch (Exception e) {
            System.out.println("An error occurred.");
        }
    }
}