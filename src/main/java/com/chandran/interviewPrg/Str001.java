package com.chandran.interviewPrg;

public class Str001 {

	public static void main(String[] args) {
		String message = "Hello World!";
		String newMessage = message.substring(6, 11) + message.substring(11,6);
		System.out.println(newMessage);
	}

}
