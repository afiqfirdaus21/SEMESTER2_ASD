public class Latihan21 {
    // Brute Force
    public double bruteForceSqrt(double x) {
        if (x == 0 || x == 1) {
            return x;
        }

        double result = 1;
        while (result * result <= x) {
            result++;
        }
        return (int) result - 1; // Bulatkan ke bawah
    }

    // Divide Conquer
    public double divideConquerSqrt(double x) {
        if (x == 0 || x == 1) {
            return x;
        }
        return divideConquerHelper(x, 0, x);
    }

    public double divideConquerHelper(double x, double start, double end) {
        double mid = start + (end - start) / 2;
        double midSquare = mid * mid;

        if (midSquare == x || (midSquare < x && (mid + 0.001) * (mid + 0.001) > x)) {
            return (int) mid; // Bulatkan ke bawah
        } else if (midSquare < x) {
            return divideConquerHelper(x, mid, end);
        } else {
            return divideConquerHelper(x, start, mid);
        }
    }

}
