package hwday8;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
public class Two_Sum {
    public static void main(String[] args){
        //例
        Two_Sum example = new Two_Sum();
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
    public int[] TwoSum(int[] nums, int target) {
        Map<Integer, Integer> hashtable = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; ++i) {
            if (hashtable.containsKey(target - nums[i])) {
                return new int[]{hashtable.get(target - nums[i]), i};
            }
            hashtable.put(nums[i], i);
        }
        return new int[0];
    }
}
