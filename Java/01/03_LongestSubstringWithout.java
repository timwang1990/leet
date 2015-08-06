/*

Given a string, find the length of the longest substring without repeating characters. 
For example, the longest substring without repeating letters for "abcabcbb" is "abc", 
which the length is 3. For "bbbbb" the longest substring is "b", with the length of 1.

*/

import java.util.HashMap;

public class LongestWithout {

	public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> maps = new HashMap<Character, Integer>();
        int max = 0;
		for(int i =0, j = 0;i<s.length();i++){
        	if(maps.get(s.charAt(i))!=null){  
        		j = Math.max(maps.get(s.charAt(i))+1,j);                                              
        		maps.put(s.charAt(i), i);
        		
        		//System.out.println(i+" "+j);
        	}
        	maps.put(s.charAt(i), i);
        	max = Math.max((i - j + 1), max);
        }
		return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        boolean[] array = new boolean[255];
        //array[(int)'z'] = true;
       // System.out.println(lengthOfLongestSubstring("aaa"));
        System.out.println(lengthOfLongestSubstring("abba"));

        //System.out.println(lengthOfLongestSubstring("pwwkew"));
       // for(boolean i:array){
        //	System.out.println(i);
        //}
        
	}

}
