package com.recursion;

import java.util.Scanner;

public class SumOfDIgits {
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();

		int sum=sumOfDigits(number);
		System.out.println(sum);
	}

	static int sumOfDigits(int number) {
		if (number==0) {
			return 0;
		}
		else {
			return (number%10)+sumOfDigits(number/10);
		}		
		
	}
}
