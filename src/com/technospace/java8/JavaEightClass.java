package com.technospace.java8;

import javax.swing.DefaultBoundedRangeModel;

interface Bike {
	void show();
	static void showAll() {
		System.out.println("---- These are Bike Companies. ----");
	}
	default void tagline() {
		System.out.println("Try it once!");
	}
}

class Honda implements Bike{

	@Override
	public void show() {
		System.out.println("\n\tHonda \n*** The Power of Dreams!!! ***");
		System.out.println("This Company is Launched recently the Dream Yuga Bike.");
	}
}


class SkySuzuki implements Bike{
	@Override
	public void show() {
		System.out.println("\n\n\tSkySuzuki  \n*** Giving Wings to Your Dream!!! ***");
		System.out.println("This Bike company is launched the Access 125 Scooty.");
	}
}

public class JavaEightClass {

	public static void main(String[] args) {
		
		Bike.showAll();
		
		Honda honda = new Honda();
		honda.show();
		honda.tagline();
		
		SkySuzuki skySuzuki = new SkySuzuki();
		skySuzuki.show();
		skySuzuki.tagline();

	}

}
