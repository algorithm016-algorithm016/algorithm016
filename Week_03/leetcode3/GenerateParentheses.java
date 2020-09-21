//数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。 
//
// 
//
// 示例： 
//
// 输入：n = 3
//输出：[
//       "((()))",
//       "(()())",
//       "(())()",
//       "()(())",
//       "()()()"
//     ]
// 
// Related Topics 字符串 回溯算法 
// 👍 1320 👎 0


package leetcode3;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        Solution solution = new GenerateParentheses().new Solution();
    }

    //leetcode submit region begin(Prohibit modification and deletion)
    class Solution {

        public List<String> generateParenthesis(int n) {
            List<String> list = new ArrayList<>();
            resolve("", 0, 0, n, list);
            return list;
        }

        private void resolve(String s, int left, int right, int n, List<String> list) {
            if (left == n && right == n) {
                list.add(s);
                return;
            }


            if (left > n) {
                return;
            }
            if (right > left) {
                return;
            }
            resolve(s + ")", left, right + 1, n, list);
            resolve(s + "(", left + 1, right, n, list);
        }
    }
//leetcode submit region end(Prohibit modification and deletion)


}