package com.bridgelabz.basic;

import java.util.Scanner;

import com.bridgelabz.utility.Utility;

public class PrimeFactors 
{


	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt();
		Utility.checkFactors(num);
	}

}