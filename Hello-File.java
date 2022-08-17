import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

/**
 * sol
 */
public class sol {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("Hello.txt");
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            String w = scanner.next();
            System.out.println(w);
        }

    }
}
