package com.recursion;

import java.util.Scanner;

import javax.print.attribute.standard.RequestingUserName;

public class FactorialNumber {
	public static void main(String[] args) {

		//		Scanner scanner= new Scanner(System.in);
		//		System.out.println("Enter The Number :");
		//		int number = scanner.nextInt();
		int number=5;

		int result=factorialNumber(number);
		System.out.println(result);
	}
	private static int factorialNumber(int num) {		
		if (num==0) {
			return 1;
		}else {		
			System.out.println();
			return num*factorialNumber(num-1);
		}
	}
}

// 5 4 3 2 1