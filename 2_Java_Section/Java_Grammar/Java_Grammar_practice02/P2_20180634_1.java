//20180634 √÷¡ÿ«ı
package practice2;

import java.util.Scanner;

public class P2_20180634_1 {
	
	static int fibonacci(int x) {
		int x1 = 1, x2 = 1, sum;
		if (x<1) {
			System.out.println("Should enter a positive number");
			return -1;
		}
		else if(x==1||x==2) return 1;
		else {
			for(int i=3;i<x;i++) {
				sum = x1 + x2;
				x1 = x2;
				x2 = sum;
			}
			return x1 + x2;
		}
	}
	
	public static void main(String[] args) {
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter n : ");
		int n = scin.nextInt();
		int result = fibonacci(n);
		
		if (result != -1) System.out.println("fibonacci("+n+") = "+result);
		
		scin.close();
		}
	}
