package com.demo;

public class OddEven {
	public static void main(String[] args) {

		int a[] = { 1, 2, 3, 13, 16, 18 };

		System.out.println("odd numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 != 0) {
				System.out.println(a[i]);
			}
		}
		System.out.println("even numbers");
		for (int i = 0; i < a.length; i++) {
			if (a[i] % 2 == 0) {
				System.out.println(a[i]);
			}
		}
	}
}
