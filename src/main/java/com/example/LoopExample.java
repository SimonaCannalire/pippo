package com.example;

public class LoopExample {
	public static void main(String[] args) {
		boolean condition = true;
		boolean something = args.length == 0;

//if (args.lentgh == 0 ) {
//something = true;
//} else {
//something = false;
//}
		do {
			System.out.println("che bello questo loop " + something);

			if (something) {
				condition = false;
			}
		} while (condition);
	}
}