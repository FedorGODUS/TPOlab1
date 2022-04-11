package function;

public class ArctgTaylorSeries {
    private final static double ACCURACY = 0.0001;

    public static double arctg(double x) {
        if (Double.isInfinite(x))
            return Double.NaN;
        int n = 0;
        double absX = Math.abs(x);
        double cur = 0;
        double prev = -1;
        double res = 0;
        while (Math.abs(cur - prev) >= ACCURACY) {
            prev = cur;
            cur = expandIntoTaylorSeries(absX, n);
            res += cur;
            ++n;
        }
        return x < 0 ? -res : res;
    }

    private static double expandIntoTaylorSeries(double x, int n) {
        return Math.pow(-1, n) * Math.pow(x, 2 * n + 1) / (2 * n + 1);
    }

}
