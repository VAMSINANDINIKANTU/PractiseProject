package com.demo;

public class ReverseStringDemo {

	public static void main(String[] args) {
		// using charat() method
		String str = "Hellow World";
		String revstring = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			revstring = revstring + str.charAt(i);
		}

		System.out.println("reverse String is"+revstring);
		String str1="Vamsinandinikantu";
		StringBuilder sb=new StringBuilder(str1);
		str1=sb.reverse().toString();
		System.out.println("reverse String is"+str1);

	}
}