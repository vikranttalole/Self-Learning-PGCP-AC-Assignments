package com.demo;

import java.util.Scanner;

public class Equals {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter First Number:");
		int num1=sc.nextInt();
		System.out.println("Enter Second Number :");
		int num2=sc.nextInt();
		if(num1==num2) {
			System.out.println("Two number are equals");
		}
		else if(num1>num2){
			System.out.println("Fisrt is larger");
		}
		else {
			System.out.println("Second is lesser");
		}
	}

}
