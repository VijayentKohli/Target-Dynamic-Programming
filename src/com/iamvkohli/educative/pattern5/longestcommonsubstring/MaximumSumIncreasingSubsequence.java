package com.iamvkohli.educative.pattern5.longestcommonsubstring;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class MaximumSumIncreasingSubsequence {

	public int findMSIS(int[] nums) {
		Map<String, Integer> dp = new HashMap<>();
		return findMSISRecursive(dp, nums, 0, -1, 0);
	}

	private int findMSISRecursive(Map<String, Integer> dp, int[] nums, int currentIndex, int previousIndex, int sum) {
		if (currentIndex == nums.length)
			return sum;

		String subProblemKey = currentIndex + "-" + previousIndex + "-" + sum;
		if (!dp.containsKey(subProblemKey)) {
			// include nums[currentIndex] if it is larger than the last included number
			int s1 = sum;
			if (previousIndex == -1 || nums[currentIndex] > nums[previousIndex])
				s1 = findMSISRecursive(dp, nums, currentIndex + 1, currentIndex, sum + nums[currentIndex]);

			// excluding the number at currentIndex
			int s2 = findMSISRecursive(dp, nums, currentIndex + 1, previousIndex, sum);
			dp.put(subProblemKey, Math.max(s1, s2));
		}

		return dp.get(subProblemKey);
	}

	//DP
	public int findMSISwithDP(int[] nums) {
		int[] dp = new int[nums.length];
		dp[0] = nums[0];

		int maxSum = nums[0];
		for (int i = 1; i < nums.length; i++) {
			dp[i] = nums[i];
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j] && dp[i] < dp[j] + nums[i])
					dp[i] = dp[j] + nums[i];
			}
			maxSum = Math.max(maxSum, dp[i]);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		MaximumSumIncreasingSubsequence msis = new MaximumSumIncreasingSubsequence();
		int[] nums = { 4, 1, 2, 6, 10, 1, 12 };
//		System.out.println(msis.findMSIS(nums));
		nums = new int[] { -4, 10, 3, 7, 15 };
//		System.out.println(msis.findMSISwithDP(nums));
		nums = new int[] { 1, 3, 8, 4, 14, 6, 14, 1, 9, 4, 13, 3, 11, 17, 29};
//		System.out.println(msis.findMSIS(nums));
		
		String s = "abc";
		System.out.println("ONE"+ s.substring(0, 0));
		System.out.println(s.substring(0, 1));
		System.out.println(s.substring(1, 1));
		System.out.println(s.substring(2, 2));
		System.out.println("FIvE "+s.substring(2, 3));
		
		HashSet<int []> hs = new HashSet<>();
		int[] arr1 = {1,0,0,0};
		int[] arr2 = {1,0,0,0};
		int[] arr3 = {0,0,0};
		
		System.out.println(hs.add(arr1));
		System.out.println(hs.add(arr3));
		System.out.println(hs.add(arr2));
		System.out.println(hs);
		
		
	}

}
