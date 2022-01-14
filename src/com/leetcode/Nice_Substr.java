package com.leetcode;
import java.util.*;

/*
https://leetcode.com/problems/longest-nice-substring/
Problem:
A string s is nice if, for every letter of the alphabet that s contains,
it appears both in uppercase and lowercase.
For example, "abABB" is nice because 'A' and 'a' appear, and 'B' and 'b' appear.
However, "abA" is not because 'b' appears, but 'B' does not.
 Given a string s, return the longest substring of s that is nice.
 - If there are multiple, return the substring of the earliest occurrence.
 - If there are none, return an empty string.

 Approach: Divide and Conquer
 Solution : https://leetcode.com/problems/longest-nice-substring/discuss/1074589/JavaStraightforward-Divide-and-Conquer

 */
public class Nice_Substr {

    public String longestNiceSubstring(String s) {
        if (s.length() < 2) return "";
        char[] arr = s.toCharArray();
        Set<Character> set = new HashSet<>();
        for (char c: arr) set.add(c);
        for (int i = 0; i < arr.length; i++) {
            char c = arr[i];
            if (set.contains(Character.toUpperCase(c)) && set.contains(Character.toLowerCase(c))) continue;
            String sub1 = longestNiceSubstring(s.substring(0, i));
            String sub2 = longestNiceSubstring(s.substring(i+1));
            return sub1.length() >= sub2.length() ? sub1 : sub2;
        }
        return s;
    }

    public static void main (String args[]){
        Nice_Substr sub = new Nice_Substr();
        String s ="YazaAay";
        System.out.println(sub.longestNiceSubstring(s));
    }
}
