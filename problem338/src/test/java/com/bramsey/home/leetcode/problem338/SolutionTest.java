package com.bramsey.home.leetcode.problem338;

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
    void testCountBitsZero() {
        assertThat(solution.countBits(0)).containsExactly(0);
    }

    @Test
    void testCountBitsOne() {
        assertThat(solution.countBits(1)).containsExactly(0,1);
    }

    @Test
    void testCountBitsTwo() {
        assertThat(solution.countBits(2)).containsExactly(0,1,1);
    }

    @Test
    void testCountBitsFive() {
        assertThat(solution.countBits(5)).containsExactly(0,1,1,2,1,2);
    }
}