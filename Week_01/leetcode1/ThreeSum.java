//给你一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？请你找出所有满足条件且不重复
//的三元组。
//
// 注意：答案中不可以包含重复的三元组。
//
//
//
// 示例：
//
// 给定数组 nums = [-1, 0, 1, 2, -1, -4]，
//
//满足要求的三元组集合为：
//[
//  [-1, 0, 1],
//  [-1, -1, 2]
//]
//
// Related Topics 数组 双指针
// 👍 2571 👎 0

package leetcode1;

import java.util.*;

public class ThreeSum {

    public static void main(String[] args) {
        new ThreeSum().new Solution().threeSum(new int[]{-1, 0, 1, 2, -1, -4});

    }

    //leetcode submit region begin(Prohibit modification and deletion)

    /**
     * 双指针法，两遍夹逼 O(n2)
     */
    class Solution {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (nums[i] > 0) {
                    continue;
                }
                if (i > 0 && nums[i - 1] == nums[i]) {
                    continue;
                }
                int j = i + 1, k = nums.length - 1;
                while (j < k) {
                    int sum = nums[i] + nums[j] + nums[k];
                    if (sum < 0) {
                        j++;
                    } else if (sum > 0) {
                        k--;
                    } else {
                        list.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                        while (j < k && nums[j] == nums[++j]) ;
                        while (j < k && nums[k] == nums[--k]) ;
                    }
                }
            }
            return list;
        }
    }
//leetcode submit region end(Prohibit modification and deletion)

    /**
     * hash法，未解决去重，测试用例未通过
     */
    class Solution2 {
        public List<List<Integer>> threeSum(int[] nums) {
            Arrays.sort(nums);
            List<List<Integer>> list = new ArrayList<>();
            for (int i = 0; i < nums.length - 2; i++) {
                if (i > 0 && nums[i] == nums[i - 1]) {
                    continue;
                }
                Map<Integer, Integer> map = new HashMap<>(2 * nums.length);
                int sum = -nums[i];
                for (int x = i + 1; x < nums.length; x++) {
                    int yNum = sum - nums[x];
                    Integer y = map.get(yNum);
                    if (y == null) {
                        map.put(nums[x], x);
                    } else {
                        list.add(Arrays.asList(nums[i], nums[x], nums[y]));
                    }
                }
            }
            return list;
        }
    }
}
