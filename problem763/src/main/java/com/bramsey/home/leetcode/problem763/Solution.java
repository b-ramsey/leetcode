package com.bramsey.home.leetcode.problem763;

import java.util.ArrayList;
import java.util.List;

/**
 * You are given a string s. We want to partition the string into as many parts as possible so that each letter appears in at most one part.
 * <p>
 * Return a list of integers representing the size of these parts.
 */
public class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> result = new ArrayList<>();

        int partitionStart = 0;

        while (partitionStart < s.length()) {
            int partitionEnd = s.lastIndexOf(s.charAt(partitionStart));
            for (int idx = partitionStart+1; idx <= partitionEnd; idx++) {
                int lastIndexCurrent = s.lastIndexOf(s.charAt(idx));
                if (lastIndexCurrent > partitionEnd) {
                    partitionEnd = lastIndexCurrent;
                }
            }
            result.add(partitionEnd - partitionStart + 1);
            partitionStart = partitionEnd + 1;
        }

        return result;
    }
}
