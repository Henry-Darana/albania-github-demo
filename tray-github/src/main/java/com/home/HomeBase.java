package com.home;

import com.one.OneClass;
import com.two.TwoClass;

public class HomeBase {

	public static void main(String[] args) {
		System.out.println("Kicking Off Project.");

		OneClass oneClass = new OneClass();
		oneClass.getOutput();

		TwoClass twoClass = new TwoClass();
		twoClass.getOutput();
	}

}
