package com.bramsey.home.leetcode.problem617;

import com.bramsey.home.leetcode.common.TreeNode;
import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }



    @Test
    void exampleOne() {
        TreeNode root1 = TreeNode.from(Arrays.array(1,3,2,5));
        TreeNode root2 = TreeNode.from(Arrays.array(2,1,3,null,4,null,7));
        TreeNode expected = TreeNode.from(Arrays.array(3,4,5,5,4,null,7));

        assertThat(solution.mergeTrees(root1, root2))
                .isEqualTo(expected);
    }

    @Test
    void exampleTwo() {
        TreeNode root1 = TreeNode.from(Arrays.array(1));
        TreeNode root2 = TreeNode.from(Arrays.array(1,2));
        TreeNode expected = TreeNode.from(Arrays.array(2,2));

        assertThat(solution.mergeTrees(root1, root2))
                .isEqualTo(expected);
    }


    @Test
    void nullTest() {
        assertThat(solution.mergeTrees(null, null)).isNull();
    }

    @Test
    void toCompleteTest() {
        TreeNode root1 = TreeNode.from(Arrays.array(1,2));
        TreeNode root2 = TreeNode.from(Arrays.array(1, null, 3));
        TreeNode expected = TreeNode.from(Arrays.array(2,2,3));

        assertThat(solution.mergeTrees(root1, root2)).isEqualTo(expected);
    }
}