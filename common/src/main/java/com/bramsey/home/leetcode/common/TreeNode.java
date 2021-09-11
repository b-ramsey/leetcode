package com.bramsey.home.leetcode.common;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    public TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static TreeNode from(Integer[] array) {
        return from(array, 0);
    }

    private static TreeNode from(Integer[] array, int index) {
        if (index >= array.length) return null;
        if (array[index] == null) return null;
        return new TreeNode(array[index], from(array, index * 2 + 1), from(array, index *2 + 2));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TreeNode treeNode = (TreeNode) o;
        return val == treeNode.val && Objects.equals(left, treeNode.left) && Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        return Objects.hash(val, left, right);
    }
}
