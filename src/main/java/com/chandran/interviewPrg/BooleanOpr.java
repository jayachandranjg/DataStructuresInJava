package com.chandran.interviewPrg;

import java.util.ArrayList;
import java.util.List;

public class BooleanOpr {

	public static void main(String[] args) {
		List<Boolean> list = new ArrayList<>();
		list.add(true);
		list.add(Boolean.parseBoolean("FlaSe"));
		list.add(Boolean.TRUE);
		System.out.println(list.size());
		System.out.println(list.get(1) instanceof Boolean);
	}

}
