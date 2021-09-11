package com.bramsey.home.leetcode.problem226;

import com.bramsey.home.leetcode.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class InvertBinaryTreeTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void emptyTree() {
        TreeNode empty = TreeNode.from(new Integer[]{});
        assertThat(solution.invertTree(empty)).isEqualTo(empty);
    }

    @Test
    void singleHeightTree() {
        TreeNode input = TreeNode.from(new Integer[]{2,1,3});
        TreeNode expected = TreeNode.from(new Integer[]{2,3,1});

        assertThat(solution.invertTree(input)).isEqualTo(expected);
    }

    @Test
    void standardTreeTest() {
        TreeNode input = TreeNode.from(new Integer[]{4,2,7,1,3,6,9});
        TreeNode expected = TreeNode.from(new Integer[]{4,7,2,9,6,3,1});

        assertThat(solution.invertTree(input)).isEqualTo(expected);
    }

    @Test
    void withNullsTest() {
        TreeNode input = TreeNode.from(new Integer[]{1,3,null,2,1});
        TreeNode expected = TreeNode.from(new Integer[]{1,null,3,null,null,1,2});

        assertThat(solution.invertTree(input)).isEqualTo(expected);
    }
}