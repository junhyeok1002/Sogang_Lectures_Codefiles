package package1;

import java.util.Scanner;

public class P1_20180634_1 {
	public static void main(String args[])
	{
		int max,min,result;
		Scanner scin = new Scanner(System.in);
		System.out.print("���� �ٸ� ���� �� ���� �Է��Ͻÿ� : ");
		int x = scin.nextInt();
		int y = scin.nextInt();
		
		if(x>y) {
			max = x;
			min =y;}
		else {
			max = y;
		    min = x;	
		}
		
	result = 1;
	for(int a =1;a<=min;a++) {
		result *= max;
	}

	System.out.println("ū �� : "+max); 
	System.out.println("���� �� : "+min); 
	System.out.println("��� : "+result); 
	}
}
