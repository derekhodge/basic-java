package com.hodge.derek.tutorial.coreJava;

import java.text.NumberFormat;
import java.util.Arrays;
import java.util.Locale;

public class CoreJavaApp {
	public static void main(String[] args) {
		CoreJavaApp app = new CoreJavaApp();
		
	}
	
	public CoreJavaApp() {
		callLoops();
		callVariables();
		
		Person.taxRate = .183;
		Person bob = new Person();
		Person bill = new Person();
		Person burt = new Person();
		
		bob.income = 20;
		bill.income = 50;
		burt.income = 1000;
		
		NumberFormat curr = NumberFormat.getCurrencyInstance(Locale.getDefault());
		System.out.println(curr.format(bob.taxRate * bob.income));
		System.out.println(curr.format(bill.taxRate * bill.income));
		System.out.println(curr.format(burt.taxRate * burt.income));
		

	}

	private void callVariables() {
		String myString = "0|1|2|3|4|5|6|7|8|9";
		String myString2 = myString;
		
		int myInt;
		myInt = 3;
		final int myInt2 = myInt;
		
		int[] myInts = new int[5];
		int[] myInts2 = new int[] {1, 2, 3};
		int[] myInts3 = new int[myInts.length * 2];
		int last = myInts2[2];
		
		System.arraycopy(myInts,  0,  myInts3, 0, myInts.length);
		System.out.println(Arrays.toString(myInts3 ));
	}

	private void callLoops() {
		
		for(int i = 0 ; i < 10 ; i++) {
			System.out.println(i);
		}
		do {
			break;
		}while(true == Boolean.TRUE); 
			
		while(true == Boolean.TRUE) {
			break;
		}
			

	}
}


