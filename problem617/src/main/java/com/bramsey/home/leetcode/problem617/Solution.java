package com.bramsey.home.leetcode.problem617;

import com.bramsey.home.leetcode.common.TreeNode;

public class Solution {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) {
            return root2;
        }
        else if (root2 == null) {
            return root1;
        }
        else {
            return new TreeNode(root1.val + root2.val, mergeTrees(root1.left, root2.left), mergeTrees(root1.right, root2.right));
        }
    }
}
