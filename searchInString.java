import java.util.Arrays;
import java.util.Scanner;

public class SearchInStrings {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = "Dipesh";
        char c = in.next().charAt(0);
        System.out.println(search(str, c));
//        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static boolean search(String str, char c) {
        for (char d : str.toCharArray()) {
            if (d == c)
                return true;
        }
        return false;
    }
}

