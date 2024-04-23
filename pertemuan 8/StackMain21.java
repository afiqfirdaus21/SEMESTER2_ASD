import java.util.Scanner;

public class StackMain21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack stk = new Stack(5);
        char pilih;
        do {
            System.out.println("Jenis: ");
            String jenis = sc.nextLine();
            System.out.println("Warna: ");
            String warna = sc.nextLine();
            System.out.println("Merk: ");
            String merk = sc.nextLine();
            System.out.println("Ukuran: ");
            String ukuran = sc.nextLine();
            System.out.println("Harga: ");
            double harga = sc.nextDouble();

            Pakaian21 p = new Pakaian21(jenis, warna, ukuran, merk, harga);
            System.out.println("Apakah Anda akan menambahkan data baru ke stack (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
            stk.push(p);

            stk.print();
            stk.pop();
            stk.peek();
            stk.print();
            ;
        } while (pilih == 'y');
    }
}

// import java.util.Scanner;
// public class StackMain21 {
// public static void main (String args[]){
// Scanner sc = new Scanner(System.in);
// Stack stk = new Stack(5);
// Scanner s = new Scanner (System.in);
// char pilih;
// boolean ulang = true;
// do{
// System.out.println("*** MENU ***");
// System.out.println("1. PUSH");
// System.out.println("2. POP");
// System.out.println("3. PEEK");
// System.out.println("4. PRINT");
// System.out.println("5. EXIT");
// System.out.print("Pilihanmu: ");
// int angka = sc.nextInt();
// switch(angka){
// case 1:
// boolean mengulang = true;
// do{
// System.out.print("Jenis : ");
// String jenis = sc.next();
// System.out.print("Warna : ");
// String warna = sc.next();
// System.out.print("Merk :");
// String merk = sc.next();
// System.out.print("Ukuran :");
// String ukuran = sc.next();
// System.out.print("Harga :");
// double harga = sc.nextDouble();

// Pakaian21 p = new Pakaian21 (jenis, warna, merk, ukuran, harga);
// System.out.print("Apakah Anda Akan Menambahkan Data Baru Ke Stack (y/n)? ");
// pilih = sc.next().charAt(0);
// sc.nextLine();
// stk.push(p);
// }while(pilih == 'y');
// break;
// case 2:
// stk.pop();
// System.out.print("Apakah anda ingin kembali ke menu? (y/n): ");
// pilih = sc.next().charAt(0);
// sc.nextLine();
// if (pilih == 'y'){
// ulang = true;
// break;
// }
// case 3:
// stk.peek();
// System.out.print("Apakah anda ingin kembali ke menu? (y/n):");
// pilih = sc.next().charAt(0);
// sc.nextLine();
// if (pilih == 'y'){
// ulang = true;
// break;
// }
// case 4:
// stk.print();
// System.out.print("Apakah anda ingin kembali ke menu? (y/n): ");
// pilih = sc.next().charAt(0);
// sc.nextLine();
// if (pilih == 'y'){
// ulang = true;
// break;
// }
// case 5:
// ulang = false;
// break;
// }
// }while (ulang);
// }
// }
// MODIFIKASI TUGAS PERCOBAAN 2 NOMOR 4