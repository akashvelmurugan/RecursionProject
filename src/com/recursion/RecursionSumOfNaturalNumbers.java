package com.recursion;

import java.util.Scanner;

public class RecursionSumOfNaturalNumbers {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);	
		System.out.println("Enter The Number :");
		int number = scanner.nextInt();

		int sum=sumOfNaturalNumber(number);
		System.out.println(sum);

	}

	static int sumOfNaturalNumber(int num) {
		if (num==0) {
			return 0;
		}else {
			return num+sumOfNaturalNumber(num-1);
		}

	}
}