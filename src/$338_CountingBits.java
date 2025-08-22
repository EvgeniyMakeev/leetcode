import java.util.Arrays;

public static int[] countBits(int n) {
    int[] res = new int[n + 1];
    res[0] = 0;
    if (n > 0) {
        res[1] = 1;
        for (int i = 2; i <= n; i++) {
            res[i] = (i % 2) + res[i >> 1];
        }
    }
    return res;
}

public static void main() {
    System.out.println(Arrays.toString(countBits(8)));
}
