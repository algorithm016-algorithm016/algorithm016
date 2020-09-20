//假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
//
// 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
//
// 注意：给定 n 是一个正整数。
//
// 示例 1：
//
// 输入： 2
//输出： 2
//解释： 有两种方法可以爬到楼顶。
//1.  1 阶 + 1 阶
//2.  2 阶
//
// 示例 2：
//
// 输入： 3
//输出： 3
//解释： 有三种方法可以爬到楼顶。
//1.  1 阶 + 1 阶 + 1 阶
//2.  1 阶 + 2 阶
//3.  2 阶 + 1 阶
//
// Related Topics 动态规划
// 👍 1229 👎 0

package leetcode1;

import java.util.HashMap;
import java.util.Map;

public class ClimbingStairs {

    public static void main(String[] args) {
        Solution solution = new ClimbingStairs().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {
        public int climbStairs(int n) {
            if (n <= 2) {
                return n;
            }
            int z = 0;
            for (int i = 3, x = 1, y = 2; i <= n; i++) {
                z = x + y;
                x = y;
                y = z;
            }
            return z;
        }
    }

    //leetcode submit region end(Prohibit modification and deletion)

    class Solution2 {
        public int climbStairs(int n) {
            return f(n, new HashMap<>());
        }

        public int f(int n, Map<Integer, Integer> map) {
            if (n <= 2) {
                return n;
            }
            if (map.get(n) != null) {
                return map.get(n);
            }
            int rtn = f(n - 1, map) + f(n - 2, map);
            map.put(n, rtn);
            return rtn;
        }
    }
}
