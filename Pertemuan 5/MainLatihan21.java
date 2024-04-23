import java.util.Scanner;

public class MainLatihan21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==================================");
        System.out.println("        Perhitungan Akar");
        System.out.println("==================================");
        System.out.print("Masukkan bilangan: ");
        double number = scanner.nextDouble();
        Latihan21 latihan = new Latihan21();

        // Brute Force
        double bruteResult = latihan.bruteForceSqrt(number);
        System.out.println("==================================");
        System.out
                .println("Nilai akar dari  " + number + " adalah: " + bruteResult + " Dengan menggunakan Brute Force");
        System.out.println("==================================");

        // Divide Conquer
        double divideConquerResult = latihan.divideConquerSqrt(number);
        System.out.println(
                "Nilai akar dari " + number + " adalah: " + divideConquerResult + " Dengan menggunakan Divide Conquer");
        System.out.println("==================================");

        scanner.close();
    }
}