package package1;

import java.util.Scanner;

public class P1_20180634_1 {
	public static void main(String args[])
	{
		int max,min,result;
		Scanner scin = new Scanner(System.in);
		System.out.print("서로 다른 정수 두 개를 입력하시오 : ");
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

	System.out.println("큰 수 : "+max); 
	System.out.println("작은 수 : "+min); 
	System.out.println("결과 : "+result); 
	}
}
