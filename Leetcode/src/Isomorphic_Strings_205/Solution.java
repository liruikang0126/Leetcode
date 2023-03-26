package Isomorphic_Strings_205;

import java.util.HashMap;

/**
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character, but a character may map to itself.
 * Example 1:
 * Input: s = "egg", t = "add"
 * Output: true
 * Example 2:
 * Input: s = "foo", t = "bar"
 * Output: false
 * Example 3:
 * Input: s = "paper", t = "title"
 * Output: true
 * Constraints:
 * 1 <= s.length <= 5 * 104
 * t.length == s.length
 * s and t consist of any valid ascii character.
 */

public class Solution {

    /**
     * This method is accepted but too slow since I used two contains check in a loop.
     * @param s
     * @param t
     * @return result

    public static boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hm = new HashMap<>();
        boolean result = true;

        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            char l1 = s.charAt(i);
            char l2 = t.charAt(i);
            if (!hm.containsKey(l1)) {
                if (hm.containsValue(l2)) {
                    result = false;
                }
                hm.put(l1, l2);
            }
            if (hm.get(l1) != l2) {
                result = false;
            }
        }

        System.out.println(hm.toString());
        return result;
    }
    */

    public static boolean isIsomorphic(String s, String t) {
        int[] map1 = new int[256];
        int[] map2 = new int[256];
        if (s.length() != t.length()) {
            return false;
        }

        for (int i = 0; i < s.length(); i++) {
            if (map1[s.charAt(i)] != map2[t.charAt(i)]) {
                return false;
            }
            map1[s.charAt(i)] = i + 1;
            map2[t.charAt(i)] = i + 1;
        }
        return true;
    }
}
