import java.math.BigInteger;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
import java.util.HashMap;

/**
 * sol
 */

public class sol {
    private final static Scanner in = new Scanner(System.in);

    public static void sol() {
        String s = in.nextLine();
        StringTokenizer st = new StringTokenizer(s);
        String ans = "";
        while (st.hasMoreTokens()) {
            String t = st.nextToken();
            ans += Character.toUpperCase(t.charAt(0));
            for (int i = 1; i < t.length(); i++)
                ans += Character.toLowerCase(t.charAt(i));
            ans += " ";
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        // int t = 1;
        int t = in.nextInt();
        for (int i = 1; i <= t + 1; i++) {
            sol();
        }
    }
}
