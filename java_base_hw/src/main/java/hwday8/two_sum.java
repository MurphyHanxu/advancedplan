package hwday8;

import java.util.Arrays;

public class two_sum {
    public static void main(String[] args){
        //例
        two_sum example = new two_sum();
        int[] i = {1,2,3,4};
        int j = 5;
        System.out.println(Arrays.toString(example.twoSum(i, j)));
    }

    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for (int i = 0; i < n; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];

    }
}
