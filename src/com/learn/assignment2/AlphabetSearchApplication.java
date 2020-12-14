package com.learn.assignment2;



/* Problem: Write a java function that checks if the input string contains all the letters of the alphabet a-z
(case-insensitive). Write time and space complexity of your solution as comments in the source file.
 Time Complexity: O(n)
 Space Complexity: O(1)
 */

public class AlphabetSearchApplication {

    public static void main(String[] args) {

        System.out.println(containsAllAlphabets("abcdefghijklmadsafsdfdfnopqrstuvwxyZ", input -> input.toLowerCase()));
        System.out.println(containsAllAlphabets("naveen", input -> input.toUpperCase()));
    }

    public static boolean containsAllAlphabets(String input, FormatString formatString) {

        int[] charCount = new int[26];

        if (input == null || input.isEmpty())
            return false;

        input = input.toLowerCase();
        char[] chars = input.toCharArray();

        if (chars.length < 26)
            return false;

        for(char ch: chars) {
            int index = ch - 'a';
            charCount[index] = 1;
        }

        for (int count: charCount) {
            if (count == 0)
                return false;
        }
        return true;
    }
}
