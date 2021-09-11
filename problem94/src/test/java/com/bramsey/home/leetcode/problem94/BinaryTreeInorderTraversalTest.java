package com.bramsey.home.leetcode.problem94;

import com.bramsey.home.leetcode.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class BinaryTreeInorderTraversalTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void emptyTree() {
        assertThat(solution.inorderTraversal(TreeNode.from(new Integer[]{}))).isEmpty();
    }

    @Test
    void simpleTreeTest() {
        TreeNode input = TreeNode.from(new Integer[]{1,null,2,null, null,3});
        assertThat(solution.inorderTraversal(input)).containsExactly(1,3,2);
    }

    @Test
    void oneElementTest() {
        TreeNode input = TreeNode.from(new Integer[]{1});
        assertThat(solution.inorderTraversal(input)).containsExactly(1);
    }

    @Test
    void singleHeightTreeTest() {
        TreeNode input = TreeNode.from(new Integer[]{1,2,3});
        assertThat(solution.inorderTraversal(input)).containsExactly(2,1,3);
    }
}