// public class Sum21 {
//     public int elemen;
//     public double keuntungan[];
//     public double total;

//     Sum21(int elemen){
//         this.elemen = elemen;
//         this.keuntungan = new double[elemen];
//         this.total = 0;
//     }

//     double totalBF(double arr[]){
//         for ( int i = 0; i < elemen; i++){
//             total = total + arr[i];
//         }
//         return total;
//     }

//     double totalDC(double arr[], int l, int r){
//         if(l==r){
//             return arr[l];
//         }else if(l<r){
//             int mid=(l+r)/2;
//             double lsum=totalDC(arr, l, mid-1);
//             double rsum=totalDC(arr , mid+1, r);
//             return lsum+rsum+arr[mid];
//         }
//         return 0;
//     }
// }


public class Sum21 {
    public int[] elemen;
    public double[][] keuntungan;
    public double[] total;

    Sum21(int[] elemen) {
        this.elemen = elemen;
        this.keuntungan = new double[elemen.length][];
        this.total = new double[elemen.length];
        for (int i = 0; i < elemen.length; i++) {
            this.keuntungan[i] = new double[elemen[i]];
        }
    }

    double totalBF(double[] arr) {
        double total = 0;
        for (double profit : arr) {
            total += profit;
        }
        return total;
    }

    double totalDC(double[] arr, int l, int r) {
        if (l == r) {
            return arr[l];
        } else if (l < r) {
            int mid = (l + r) / 2;
            double lsum = totalDC(arr, l, mid - 1);
            double rsum = totalDC(arr, mid + 1, r);
            return lsum + rsum + arr[mid];
        }
        return 0;
    }
}
// Modifikasi