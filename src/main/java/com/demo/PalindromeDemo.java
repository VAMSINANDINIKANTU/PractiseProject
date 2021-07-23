package com.demo;

public class PalindromeDemo {
	public static void main(String[] args) {
		int n=545,r,temp,sum=0; 
		temp=n;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
			
		}
		if(temp==sum)
			System.out.println("palindrome number");
		else
			System.out.println("not palindrome number");
	}

}
