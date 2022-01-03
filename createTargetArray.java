
import java.util.Arrays;

public class CreateTargetArray {
    public static void main(String[] args) {
        int[] nums = {0, 1, 2, 3, 4};
        int[] index = {0, 1, 2, 2, 1};
        int[] pam = createTarget(nums, index);
        System.out.println(Arrays.toString(pam));
    }

    static int[] createTarget(int[] nums, int[] index) {

        for (int i = 0; i < nums.length; i++) {
            int idx = index[i];
            int value = nums[i];

            if (idx < i) {
                int k = i - 1;
                int tmp = nums[i];

                while (k >= 0) {
                    nums[k + 1] = nums[k];
                    if (k == idx) {
                        nums[k] = tmp;
                        break;
                    }
                    k--;
                }
            }
        }
        return nums;
    }
}


