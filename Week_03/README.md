# 泛型递归、树的递归、分治、回溯

## 心得

## 总结
1. 树的面试题解法一般都是递归

## 递归模板
```java
public class Test {
    public void recur(int level, int param) {
        // terminator            递归终结条件
        if (level > MAX_LEVEL) {
            "process result";
            return;
        }

        // process current logic  处理当前层
        process(level, param);

        // drill down             下探到下层
        recur(level = level + 1, newParam);

        // restore current status 清理当前层
    }
}
```

## 递归
要点
1. 不要人肉进行递归（最大误区）
2. 找到最近最简方法，将其拆解成可重复解决的问题（重复子问题）
3. 数学归纳法思维

## 分治、回溯


## LeetCode

### 递归
| 题目 | 项目链接 | leetcode | 心得 |
|---|---|---|---|
| 22. 括号生成 | [GenerateParentheses](leetcode3/GenerateParentheses.java) | [generate-parentheses](https://leetcode-cn.com/problems/generate-parentheses/) | 递归 + 剪枝  |
| 226. 翻转二叉树 | [InvertBinaryTree](leetcode3/InvertBinaryTree.java) | [invert-binary-tree](https://leetcode-cn.com/problems/invert-binary-tree/) | 递归模板实现即可，还可以使用DFS、BFS两者代码基本一致  |
| 98. 验证二叉搜索树 | []() | [validate-binary-search-tree](https://leetcode-cn.com/problems/validate-binary-search-tree/) |   |
|  | []() | []() |   |
|  | []() | []() |   |
|  |  |  |   |

### 小标题2
| 题目 | 项目链接 | leetcode | 心得 |
|---|---|---|---|
|  | []() | []() |   |
|  | []() | []() |   |
|  | []() | []() |   |
|  |  |  |   |

### 小标题3
| 题目 | 项目链接 | leetcode | 心得 |
|---|---|---|---|
|  | []() | []() |   |
|  | []() | []() |   |
|  | []() | []() |   |
|  |  |  |   |
