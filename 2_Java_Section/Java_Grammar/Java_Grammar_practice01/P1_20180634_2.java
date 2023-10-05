package package1;

import java.util.Scanner;

public class P1_20180634_2 {
	public static void main(String args[])
	{
		int count=0;
		
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter one integer : ");
		int num = scin.nextInt();
		
		System.out.println("");
		
		for (int a=1;a<=num;a++) {
			if(num % a == 0) {
				System.out.print(a); 
				count++;
				if(a==num) break;
				System.out.print(", "); 
			}
		}
		
		System.out.println("\n");
		System.out.println("count : "+count); 
	
	}
}
