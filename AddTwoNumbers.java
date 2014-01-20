//Write a function Add() that returns sum of two integers. The function should not use any of the arithmetic operators (+, ++, –, -, .. etc).
public class AddTwoNumbers {
	public static void main(Strinng[] args) {
		int x = 5, y = 4;
		while (y != 0) {
			int carry = x & y;
			x = x ^ y;
			y = carry << 1;
		}
		System.out.println("The sum is : " + x);
	}

	public static int add(int a, int b) {
		if (b == 0) {
			return a;
		}
		else {
			return add(a ^ b, (a & b) << 1);
		}
	}
}

