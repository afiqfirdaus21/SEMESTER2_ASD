import java.util.Scanner;

public class GraphMatriksMain21 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        GraphMatriks21 gdg = new GraphMatriks21(4);
        gdg.makeEdge(0, 1, 50);
        gdg.makeEdge(1, 0, 60);
        gdg.makeEdge(1, 2, 70);
        gdg.makeEdge(2, 1, 80);
        gdg.makeEdge(2, 3, 40);
        gdg.makeEdge(3, 0, 90);
        gdg.printGraph();
        System.out.println("\nHasil setelah penghapusan edge\n");
        gdg.removeEdge(2, 1);
        gdg.printGraph();
    }
}