package com.leetcode.math;

/**
 * Created by charles on 3/28/17.
 * Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28

 */
public class ExcelSheetColumnNumber_171 {
    /**
     * Thought: A * 26 + A
     */
    private char[] letters = {'A','B','C'};

    public int titleToNumber(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        char[] chars = s.toCharArray();
        int len = chars.length;
        int sum = 0;
        for (int i = 0; i < len; i++) {
            sum = sum * 26 + chars[i] - 'A' + 1;
        }
        return sum;
    }
}
