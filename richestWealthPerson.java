public class richestWealth {
    public static void main(String[] args) {
        int[][] acc = {{1, 2, 3}, {3, 2, 1}};
        System.out.println(rich(acc));
    }

    static int rich(int[][] acc) {
        int[] sum = new int[acc.length];
        for (int i = 0; i < acc.length; i++) {
            //                for i'th customer wealth
            for (int j = 0; j < acc[i].length; j++) sum[i] += acc[i][j];    
        }
        int maxSum = max(sum);
        return maxSum;
    }


    static int max(int[] sum) {
        int max = Integer.MIN_VALUE;
        for (int i : sum) {
            if (i > max) {
                max = i;
            }
        }
        return max;
    }

}
