package hwday8;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicate {

    public static void main(String[] args){
        Contains_Duplicate example = new Contains_Duplicate();
        int[] i = {1,2,3,4,5,2,1};
        System.out.println(example.containsDuplicate1(i));
        System.out.println(example.containsDuplicate2(i));
    }
    public boolean containsDuplicate1(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<Integer>();
        for (int x : nums) {
            if (!set.add(x)) {
                return true;
            }
        }
        return false;
    }
}
