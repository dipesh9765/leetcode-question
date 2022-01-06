import java.util.Scanner;

public class SearchInRange {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] str = {1,2,3,4,34,54,23};
        int c = in.nextInt();
        System.out.println(search(str, c, 1, 4));
//        System.out.println(Arrays.toString(str.toCharArray()));
    }

    static int search(int[] str, int target, int start, int end) {
        for (int i = start; i < end; i++) {
            if (target == str[i]) {
                return i;
            }

        }
        return Integer.MIN_VALUE;
    }
}
