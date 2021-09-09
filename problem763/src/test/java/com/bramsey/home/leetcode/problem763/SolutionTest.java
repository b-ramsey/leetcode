package com.bramsey.home.leetcode.problem763;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;

class SolutionTest {

    Solution solution;

    @BeforeEach
    void setup() {
        solution = new Solution();
    }

    @Test
    void exampleOne() {
        List<Integer> expected = List.of(9,7,8);

        assertThat(solution.partitionLabels("ababcbacadefegdehijhklij"))
                .hasSameElementsAs(expected);
    }

    @Test
    void exampleTwo() {
        assertThat(solution.partitionLabels("eccbbbbdec"))
                .hasSameElementsAs(List.of(10));
    }

    @Test
    void onlyPartitions() {
        assertThat(solution.partitionLabels("abc"))
                .hasSameElementsAs(List.of(1,1,1));
    }

}