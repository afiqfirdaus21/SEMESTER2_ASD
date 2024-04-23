import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class MainTransaksi_21 {
    public static void main(String[] args) {
        List<Rekening_21> rekenings = new ArrayList<>();
        List<Transaksi_21> transaksis = new ArrayList<>();

        rekenings.add(new Rekening_21("16030927 3084", "Wallace", "Chase Castro", "1-458-264-3263",
                "ligula.Nullam@tacitisociosqu.edu"));
        rekenings.add(
                new Rekening_21("16100617 0573", "Darius", "Julian Daniel", "1-357-843-0547", "nec@lectusjusto.org"));
        rekenings.add(new Rekening_21("16200401 2243", "Fuller", "Finn Dunlap", "571-7062",
                "convallis@Vestibulumanteipsum.org"));
        rekenings.add(new Rekening_21("16270525 0112", "Malcolm", "Keane floyd", "623-0234",
                "porttitor.tellus.non@Curabitur.ca"));
        rekenings.add(new Rekening_21("16971204 2416", "Geoffrey", "Stephen Pratt", "1-683-416-8323",
                "ut.pellentesque@luctusutpellentesque.com"));
        rekenings.add(new Rekening_21("16100727 8862", "Rudyard", "Charles Morales", "650-5379",
                "Proin.eget@velitegestaslacinia.ca"));
        rekenings
                .add(new Rekening_21("16460329 4259", "Troy", "Damon Guerra", "897-7608", "pede.Suspendisse.dui@a.ca"));
        rekenings.add(new Rekening_21("16320421 3437", "Alec", "Cooper Lee", "792-4447", "non@mus.com"));
        rekenings.add(
                new Rekening_21("16180729 7229", "Walter", "Seth Drake", "863-8209", "Pellentesque.ut.ipsum@neque.ca"));
        rekenings.add(new Rekening_21("16950313 6823", "Simon", "Burton Gates", "592-6919",
                "tellus.justo.sit@commodoauctor.net"));
        rekenings.add(new Rekening_21("16850708 3528", "Kamal", "Odysseus Salas", "1-115-339-7678", "dictum@nec.edu"));
        rekenings.add(new Rekening_21("16080205 9329", "Xenos", "Colin Curry", "1-891-703-2664",
                "vel@ullamcorpermagna.co.uk"));
        rekenings.add(new Rekening_21("16080628 2695", "Merritt", "Clarke Roman", "1-978-632-5110",
                "Aliquam.gravida@vestibulumMauris.net"));
        rekenings.add(new Rekening_21("16130909 2979", "Ryder", "Joel Cunningham", "817-1766",
                "interdum.Curabitur.dictum@rutrumurna.edu"));
        rekenings.add(new Rekening_21("16890212 8688", "Preston", "Brock Schroeder", "1-675-400-4501",
                "et.ultrices@a.co.uk"));
        rekenings.add(
                new Rekening_21("16141008 9963", "Alec", "Baker Barton", "527-9085", "ut@aultriciesadipiscing.ca"));
        rekenings.add(
                new Rekening_21("16511222 7763", "Price", "Ashton Burke", "1-564-419-4285", "Proin.velit@Duisac.net"));
        rekenings
                .add(new Rekening_21("16720623 0943", "Devin", "Slade Flores", "977-6690", "ac@nibhAliquamornare.com"));
        rekenings.add(new Rekening_21("16771126 7372", "Ignatius", "Lionel Kane", "353-5137",
                "cubilia.Curae.Phasellus@Duis.com"));

        transaksis.add(new Transaksi_21(898214.0, 494048.0, 3587.0, "2021-03-09 07:54:42", "some type"));
        transaksis.add(new Transaksi_21(205420.0, 200162.0, 775880.0, "2021-06-25 10:23:00", "some type"));
        transaksis.add(new Transaksi_21(838632.0, 350929.0, 328316.0, "2021-09-18 23:00:04", "some type"));
        transaksis.add(new Transaksi_21(230659.0, 204434.0, 690503.0, "2022-02-02 19:10:34", "some type"));
        transaksis.add(new Transaksi_21(770592.0, 334245.0, 444267.0, "2020-08-11 13:36:56", "some type"));
        transaksis.add(new Transaksi_21(685302.0, 451002.0, 376442.0, "2020-05-23 07:34:53", "some type"));
        transaksis.add(new Transaksi_21(816129.0, 851403.0, 597842.0, "2021-07-18 19:41:20", "some type"));
        transaksis.add(new Transaksi_21(989609.0, 333823.0, 802752.0, "2022-02-01 01:13:11", "some type"));
        transaksis.add(new Transaksi_21(297103.0, 396116.0, 779589.0, "2021-07-03 01:09:49", "some type"));
        transaksis.add(new Transaksi_21(66190.0, 259150.0, 619774.0, "2021-09-09 03:57:30", "some type"));
        transaksis.add(new Transaksi_21(234301.0, 278309.0, 547922.0, "2021-08-24 13:18:39", "some type"));
        transaksis.add(new Transaksi_21(243306.0, 869468.0, 50283.0, "2021-03-12 03:40:16", "some type"));
        transaksis.add(new Transaksi_21(371045.0, 991242.0, 602034.0, "2021-08-06 11:48:59", "some type"));
        transaksis.add(new Transaksi_21(395170.0, 97058.0, 472273.0, "2021-05-02 10:53:31", "some type"));
        transaksis.add(new Transaksi_21(862731.0, 561908.0, 109431.0, "2021-07-31 08:11:00", "some type"));
        transaksis.add(new Transaksi_21(556798.0, 31387.0, 725426.0, "2021-03-27 06:18:20", "some type"));
        transaksis.add(new Transaksi_21(873982.0, 896213.0, 846142.0, "2021-07-18 04:06:30", "some type"));
        transaksis.add(new Transaksi_21(774247.0, 739406.0, 775848.0, "2020-10-24 01:39:00", "some type"));
        transaksis.add(new Transaksi_21(66987.0, 823014.0, 868772.0, "2020-12-21 05:57:59", "some type"));

        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n.:UTS:.");
            System.out.println("1. Tampil data rekening");
            System.out.println("2. Tampil data transaksi");
            System.out.println("3. Mencari saldo > 500000");
            System.out.println("4. Sorting by name");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nData Rekening:");
                    for (Rekening_21 rekening : rekenings) {
                        System.out.println(rekening);
                    }
                    break;
                case 2:
                    System.out.println("\nData Transaksi:");
                    for (Transaksi_21 transaksi : transaksis) {
                        System.out.println(transaksi);
                    }
                    break;
                case 3:
                    System.out.println("\nSaldo > 500000:");
                    for (Transaksi_21 transaksi : transaksis) {
                        if (transaksi.saldo > 500000) {
                            System.out.println(transaksi);
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nSorting by name:");
                    Collections.sort(rekenings, Comparator.comparing(rekening -> rekening.nama));
                    for (Rekening_21 rekening : rekenings) {
                        System.out.println(rekening);
                    }
                    break;
                case 5:
                    long startTime = System.currentTimeMillis();
                    long endTime = System.currentTimeMillis();
                    System.out.println("Build successful " + "(total time : " + (endTime - startTime) + " seconds)");
                    break;
                default:
                    System.out.println("Menu yang Anda pilih tidak valid!");
                    break;
            }
        } while (choice != 5);
        scanner.close();
    }
}