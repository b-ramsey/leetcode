package com.bramsey.home.leetcode.problem2;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        return addTwoNumbers(l1, l2, 0);
    }

    private ListNode addTwoNumbers(ListNode l1, ListNode l2, int carry) {
        if (l1 == null && l2 == null) {
            return carry != 0 ? new ListNode(carry) : null;
        }
        int l1val = l1 != null ? l1.val : 0;
        int l2val = l2 != null ? l2.val : 0;
        int sum = l1val + l2val + carry;
        return new ListNode(sum % 10, addTwoNumbers(l1 == null ? null : l1.next, l2 == null ? null : l2.next, sum / 10));
    }
}
