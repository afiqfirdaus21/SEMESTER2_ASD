import java.util.Scanner;

public class PersegiPanjangDemo21 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            PersegiPanjang21[] arrayOfPersegiPanjang = new PersegiPanjang21[3];
            int panjang, lebar;



            
            for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
                System.out.println("Persegi Panjang ke-" + (i + 1));
                System.out.println("Masukkan Panjang: ");
                panjang = sc.nextInt();
                System.out.println("Masukkan Lebar: ");
                lebar = sc.nextInt();
                System.out.println();
    
                arrayOfPersegiPanjang[i] = new PersegiPanjang21(panjang, lebar);
            }

        

        System.out.println();
        for (int i = 0; i < arrayOfPersegiPanjang.length; i++) {
            arrayOfPersegiPanjang[i].cetakinfo(i);
            arrayOfPersegiPanjang[i].hitungLuas();
            arrayOfPersegiPanjang[i].hitungKeliling();
        }

        // for(int i = 0; i < 3; i++){
        //         System.out.println("Persegi panjang ke-" + (i + 1)+ ", panjang: " + arrayOfPersegiPanjang[i].panjang 
        //         + ",lebar:" + arrayOfPersegiPanjang[i].lebar);
        // }
        
        // arrayOfPersegiPanjang[0] = new PersegiPanjang21();
        // arrayOfPersegiPanjang[0].panjang = 110;
        // arrayOfPersegiPanjang[0].lebar = 30;

        // arrayOfPersegiPanjang[1] = new PersegiPanjang21();
        // arrayOfPersegiPanjang[1].panjang = 80;
        // arrayOfPersegiPanjang[1].lebar = 40;

        // arrayOfPersegiPanjang[2] = new PersegiPanjang21();
        // arrayOfPersegiPanjang[2].panjang = 100;
        // arrayOfPersegiPanjang[2].lebar = 20;

        // System.out.println("Persegi Panjang ke-1, panjang: " + arrayOfPersegiPanjang[0].panjang + ", lebar : "
        //         + arrayOfPersegiPanjang[0].lebar);
        // System.out.println("Persegi Panjang ke-2, panjang: " + arrayOfPersegiPanjang[1].panjang + ", lebar : "
        //         + arrayOfPersegiPanjang[1].lebar);
        // System.out.println("Persegi Panjang ke-3, panjang: " + arrayOfPersegiPanjang[2].panjang + ", lebar : "
        //         + arrayOfPersegiPanjang[2].lebar);
    }
}