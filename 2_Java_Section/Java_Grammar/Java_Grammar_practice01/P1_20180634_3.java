package package1;

import java.util.Scanner;

public class P1_20180634_3 {
	public static void main(String args[])
	{
		Scanner scin = new Scanner(System.in);
		System.out.print("Enter two integer : ");
		int x = scin.nextInt();
		int y = scin.nextInt();
		
		for(int i = 0;i<x;i++) {
			if (i == 0 || i == x-1) {
				for(int j=0;j<y;j++) {
					System.out.print("*"); 
				}
			}
			else {
				for(int j=0;j<y;j++) {
					if (j == 0 || j == y-1) System.out.print("*"); 
					else System.out.print(" "); 
				}
			}
			System.out.println("");	
		}

	}
}
