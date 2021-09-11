package com.bramsey.home.leetcode.problem94;

import com.bramsey.home.leetcode.common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> results = new ArrayList<>();

        if (root != null) {
            results.addAll(inorderTraversal(root.left));
            results.addAll(List.of(root.val));
            results.addAll(inorderTraversal(root.right));
        }
        return results;
    }
}
