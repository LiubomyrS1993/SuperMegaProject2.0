package AlgorithmsMinute;

import java.util.Arrays;

public class HomeTask2 {
    public static int[] findIndices(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("No two elements add up to the target.");
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        int target = 4;
        int[] result = findIndices(nums, target);
        System.out.println("Result: ");
        System.out.print(Arrays.toString(result));
        System.out.println(" are the indices of the array elements, which add up to " + target);
    }

}


