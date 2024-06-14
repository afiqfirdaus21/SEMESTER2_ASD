import java.util.Scanner;

public class TugasNomor2_isi {
    TugasNomor2 head;

    public TugasNomor2_isi() {
        this.head = null;
    }

    // Menambahkan titik baru ke akhir linked list
    public void addPoint(String question, String answer) {
        TugasNomor2 newPoint = new TugasNomor2(question, answer);
        if (head == null) {
            head = newPoint;
        } else {
            TugasNomor2 current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newPoint;
        }
    }

    // Memulai permainan dan meminta jawaban dari pengguna
    public void startHunt() {
        if (head == null) {
            System.out.println("Tidak ada point dalam permainan.");
            return;
        }
        
        Scanner scanner = new Scanner(System.in);
        TugasNomor2 current = head;

        while (current != null) {
            System.out.println(current.question);
            String userAnswer = scanner.nextLine();

            if (userAnswer.equalsIgnoreCase(current.answer)) {
                System.out.println("Jawaban benar!");
                current = current.next;
            } else {
                System.out.println("Jawaban salah, coba lagi.");
            }
        }

        System.out.println("Selamat! Anda telah menemukan harta karun!");
        scanner.close();
    }
}
