/*

Given an array of integers, find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.

You may assume that each input would have exactly one solution.

Input: numbers={2, 7, 11, 15}, target=9
Output: index1=1, index2=2


public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
    }
}

*/

/*
idea 1: space/time
sort the array -> 1/nlogn
for loop smaller than target, do bi-search -> 1/nlogn

sum up -> 1/ nlogn

*/


import java.util.HashMap;
public class TwoSum {
	public static int[] twoSum(int[] nums, int target) {
		HashMap <Integer, Integer> maps = new HashMap<Integer, Integer>();
		for(int i =0;i<nums.length;i++){
			if(maps.containsKey(nums[i])){
				return new int[]{maps.get(nums[i])+1, i+1};
			}else{
				maps.put(target-nums[i], i);
			}
		}
		return new int[2];
	}
	
	public static void main(String[] args){
		int[] array1 = { 0, 3, 2, 0 };
		//System.out.println(array1);
		//Arrays.sort(array1);
		//int x = Arrays.binarySearch(array1, 0);
		//System.out.println(array1);
		int[] result = twoSum(array1, 0);
		System.out.println(result[0]);
		System.out.println(result[1]);
	}
}

