package AllHomeworks;

import java.util.Arrays;

public class Day20_Map {
    public static void main(String[] args) {
        /*
Given two strings s and t ,
write a java program to determine if t is an anagram of s.
Example 1:
a:3
n:1
g:1
r:1
m:1
Input: s = "anagram", t = "nagaram"
Output: true
Example 2:
Input: s = "rat", t = "car"
Output: false
Note:
You may assume the string contains only lowercase alphabets.
 */

// approach
//

       // public class AnagramSample  {
           // public static void main(String args[]) {
                String str1 = "anagram";
                String str2 = "nagaram";

                if (str1.length()==str2.length()) {
                    char[] arr1 = str1.toCharArray();
                    Arrays.sort(arr1);
                    System.out.println(Arrays.toString(arr1));
                    char[] arr2 = str2.toCharArray();
                    Arrays.sort(arr2);
                    System.out.println(Arrays.toString(arr2));
                    System.out.println(Arrays.equals(arr1, arr2));
                    if(arr1.equals(arr2)) {
                        System.out.println("Given strings are anagrams");
                    } else {
                        System.out.println("Given strings are not anagrams");
                    }
   }


    }

}
