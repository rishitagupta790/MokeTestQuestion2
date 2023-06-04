package com.in;


public class UniqueChar {
	public static int firstUniqChar(String s) {
		int[] charCounts = new int[26];

		for (char c : s.toCharArray()) {
			charCounts[c - 'a']++;
		}

		for (int i = 0; i < s.length(); i++) {
			if (charCounts[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		String s1 = "leetcode";
		int index1 = firstUniqChar(s1);
		System.out.println(index1);

		String s2 = "loveleetcode";
		int index2 = firstUniqChar(s2);
		System.out.println(index2);
	}

}
