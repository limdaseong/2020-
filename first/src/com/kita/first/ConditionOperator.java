package com.kita.first;

public class ConditionOperator {
	public static void main(String[] args) {
		int num = 3;
		
		//boolean IsOdd = (num % 2 == 1 ? true : false);
		
		String result = (num % 2 == 1 ? "홀수" : "짝수");
		
		System.out.printf("%d is %s\n", num, result);
	}
}
