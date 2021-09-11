package com.bramsey.home.leetcode.problem338;

/**
 * Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.
 */
public class Solution {

    public int[] countBits(int n) {
        int[] ans = new int[n+1];

        for (int idx = 1; idx <= n; idx++) {
            ans[idx] = (idx & 1) + ans[idx >> 1];
        }

        return ans;
    }

}
