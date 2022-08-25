import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.Vector;

// import javax.swing.text.html.StyleSheet;

// import javax.annotation.processing.SupportedOptions;

/**
 * sol
 */

public class sol {
    private final static Scanner input = new Scanner(System.in);

    public static void solution() {
        int[] a = new int[8];
        for (int i = 0; i < 8; i++)
            a[i] = input.nextInt();
        int c = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = i + 2; j < 8; j += 2) {
                c = Math.max(c, Math.abs(a[i] - a[j]));
            }
        }
        System.out.println(c * c);
    }

    public static void main(String[] args) {
        // int t = input.nextInt();
        int t = 1;
        for (int i = 1; i <= t; i++) {
            solution();
        }

    }
}
