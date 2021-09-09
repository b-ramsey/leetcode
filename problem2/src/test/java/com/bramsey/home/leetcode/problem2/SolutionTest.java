package com.bramsey.home.leetcode.problem2;

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
    void addTwoNumbersBasic() {
        ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode expected = new ListNode(7, new ListNode(0, new ListNode(8)));
        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void addZero() {
        ListNode list = new ListNode(0);

        assertEquals(list, solution.addTwoNumbers(list, list));
    }

    @Test
    void addDifferentLengths() {
        ListNode l1 = new ListNode(3, new ListNode(4));
        ListNode l2 = new ListNode(5);

        ListNode expected = new ListNode(8, new ListNode(4));

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void carryEnd() {
        ListNode l1 = new ListNode(6);
        ListNode l2 = new ListNode(7);
        ListNode expected = new ListNode(3, new ListNode(1));

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }

    @Test
    void followingCarry() {
        ListNode l1 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

        ListNode expected = new ListNode(8, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(0, new ListNode(0, new ListNode(0, new ListNode(1))))))));

        assertEquals(expected, solution.addTwoNumbers(l1, l2));
    }
}