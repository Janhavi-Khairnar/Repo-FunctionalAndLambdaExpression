package com.technospace.java8;

@FunctionalInterface
interface Calculator {
	void add(int x, int y);
}

interface Calculator2 {
	void square(int a);
}


public class LambdaExpression {

	public static void main(String[] args) {
		
		//Lambda Expression
		Calculator c = (int x, int y) -> System.out.println("Addition :"+(x+y));
		c.add(10, 30);
		
		
		Calculator2 calculator2 = (a) -> System.out.println("Square Root :"+a*a);
		calculator2.square(3);
	}
		
}


