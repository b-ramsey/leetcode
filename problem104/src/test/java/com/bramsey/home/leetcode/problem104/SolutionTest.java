package com.bramsey.home.leetcode.problem104;

import com.bramsey.home.leetcode.common.TreeNode;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void testEmpty() {
        TreeNode input = TreeNode.from(new Integer[]{});
        assertEquals(0, solution.maxDepth(input));
    }

    @Test
    void testExampleOne() {
        TreeNode input = TreeNode.from(new Integer[]{3,9,20,null,null,15,7});
        assertEquals(3, solution.maxDepth(input));
    }

    @Test
    void testExampleTwo() {
        TreeNode input = TreeNode.from(new Integer[]{1, null, 2});
        assertEquals(2, solution.maxDepth(input));
    }

    @Test
    void testNull() {
        assertEquals(0, solution.maxDepth(null));
    }
}