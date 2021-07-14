package com.chandran.interviewPrg;

public class SecondHighest {

	public static void main(String[] args) {
		int[] nums = {10,2,3,2,55,55,67,12,67,34};
		int firstHighest = Integer.MIN_VALUE;
		int secondHight = firstHighest ;
		
		for (int num : nums) {
			if(num > firstHighest) {
				secondHight = firstHighest;
				firstHighest = num;
			}else if (num > secondHight && num != firstHighest){
				secondHight = num;
			}
		}
		System.out.println(firstHighest+" and "+secondHight);
	}
}
