package com.kita.first;

public class PrintF {
	public static void main(String[] args) {
	int age = 3600;
	String name = "임다성";
	float vision = 0.41f;
	char bloodType = 'O';
	
	System.out.println("나의 이름은 "+ name + "입니다, 나의 나이는 "+ age + "입니다."
	+ "나의 시력은 "+ vision +"입니다. 나의 혈액형은 "+ bloodType + "입니다.");
	
	System.out.printf("나의 이름은 %s입니다. 나의 나이는 %,d입니다. 나의 시력은 %.2f입니다. 나의 혈액형은 %c입니다.\n"
			, name, age, vision, bloodType);
	
	char v1 = 'A';
	System.out.printf("%c : %d\n", v1, (int)v1);
	
	byte v2 = 66;
	System.out.printf("%c : %d\n", (char)v2, v2);
	}
}
