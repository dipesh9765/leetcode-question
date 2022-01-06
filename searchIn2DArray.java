import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        System.out.println("Indexing starts from 1 not 0");
        int[][] arr = {{1, 2, 13}, {4, 5}, {6, 7, 8, 9}};
        int tar = 9;
//        System.out.println(Arrays.toString(search(arr, tar)));
        System.out.println(max(arr));
    }

    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] i :
                arr) {
            for (int j :
                    i) {
                if (j > max)
                    max = j;
            }
        }
        return max;
    }

    static int[] search(int[][] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[]{i + 1, j + 1};

                }
            }
        }

        return new int[]{-1, -1};
    }
}
