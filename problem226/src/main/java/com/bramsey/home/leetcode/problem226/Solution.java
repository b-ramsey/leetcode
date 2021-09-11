package com.bramsey.home.leetcode.problem226;

import com.bramsey.home.leetcode.common.TreeNode;
/**
 * Given the root of a binary tree, invert the tree, and return its root.
 */
public class Solution {

    public TreeNode invertTree(TreeNode root) {
        if (root != null) {
            TreeNode tmp = root.left;
            root.left = invertTree(root.right);
            root.right = invertTree(tmp);
        }
        return root;
    }

}
