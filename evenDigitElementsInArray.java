public class evenNum {
    public static void main(String[] args) {
        int[] arr = {12, 345, 21, 61, 789};
        System.out.println(even(arr));
    }

    static int even(int[] arr) {
        int evenCount = 0;
        for (int num : arr) {
            int count = 0;
            while (num > 0) {
                num = num / 10;
                count++;
            }

            if (count % 2 == 0) {
                evenCount++;
            }
        }
        return evenCount;
    }

}
