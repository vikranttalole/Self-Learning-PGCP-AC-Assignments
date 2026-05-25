package com.demo;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner Sc=new Scanner(System.in);
		System.out.println("Enter any number :");
		int num=Sc.nextInt();
		if(num%2==0) {
			System.out.println("This is an even number");
		}
		else{
			System.out.println("This is an odd number");
		}
		
		
		
	}
}
