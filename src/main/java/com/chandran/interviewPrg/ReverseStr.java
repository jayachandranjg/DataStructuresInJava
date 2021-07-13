package com.chandran.interviewPrg;

public class ReverseStr {

	public static void main(String[] args) {
		String str = "aidnI tcapneG";
		int len = str.length();
		char[] chrArr = str.toCharArray();
		char[] revChrArr = new char[len];
		for (int idx = 0; idx < len; idx++) {
			revChrArr[idx] = chrArr[(len-1)-idx];
		}
		System.out.println(new String(revChrArr));
	}

}
