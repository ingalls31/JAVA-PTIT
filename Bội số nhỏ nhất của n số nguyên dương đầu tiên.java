import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;
import java.util.HashMap;

/**
 * sol
 */

public class sol {
    private final static Scanner input = new Scanner(System.in);

    public static int check(int x) {
        if (x < 2)
            return 0;
        for (int i = 2; i * i <= x; i++) {
            if (x % i == 0)
                return 0;
        }
        return 1;
    }

    public static void sol() {
        int n = input.nextInt();
        BigInteger ans = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i++) {
            if (check(i) == 1) {
                int x = i;
                while (x * i <= n)
                    x *= i;

                ans = ans.multiply(BigInteger.valueOf(x));
                // System.out.println(ans);
            }
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        int t = 1;
        t = input.nextInt();
        for (int i = 1; i <= t; i++) {
            sol();
        }
    }
}
