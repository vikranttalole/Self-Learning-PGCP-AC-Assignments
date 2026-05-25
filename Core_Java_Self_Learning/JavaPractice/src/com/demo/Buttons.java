package com.demo;

import java.util.Scanner;

public class Buttons {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Button Number 1/2/3/4");
	int button= sc.nextInt();
	if(button == 1) {
		
		System.out.println("Hello");
	}
	
	else if(button==2) {
		System.out.println("Namaste");
	}
	else if(button==3) {
		System.out.println("Happy");
	}
	else {
		System.out.println("Invalid Button");
	}
	
	}
	

}
