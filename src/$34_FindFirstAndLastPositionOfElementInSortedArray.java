public static void main(String[] args) {
    int n = 4;
    System.out.println(climbStairs(n));
}

public static int climbStairs(int n) {
    int step1 = 1;
    int step2 = 2;
    if (n == 1) {
        return step1;
    } else if (n == 2) {
        return step2;
    } else {
        for (int i = 3; i <= n; i++) {
            int temp = step1 + step2;
            step1 = step2;
            step2 = temp;
        }
        return step2;
    }
}
