package com.home;

import com.one.OneClass;
import com.three.ThreeClass;

public class HomeBase {

	public static void main(String[] args) {
		System.out.println("Kicking Off Project.");

		OneClass oneClass = new OneClass();
		oneClass.getOutput();
		
		ThreeClass threeClass = new ThreeClass();
		threeClass.getOutput();
	}

}
