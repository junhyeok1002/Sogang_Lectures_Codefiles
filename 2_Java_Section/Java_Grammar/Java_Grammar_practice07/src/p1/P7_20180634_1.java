//20180634 최준혁;
// 이 문제 꼼꼼히 다시 공부

package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P7_20180634_1 {
	public static void main(String args[]) { 
		int tryNum = 1;
		int AnsNum = (int)(Math.random()*100) ;
		AnsNum++;
		System.out.println("1부터 100사이의 하나의 정수를 선택했습니다.");
		System.out.println("맞춰 보세요 ^^");
		System.out.println("--------------------------------");

		while(true) {
			try {
				Scanner scin= new Scanner(System.in); 
				System.out.print("1과 100사이의 값을 입력하세요 : "); 
				
				int i= scin.nextInt(); 
				
				if(AnsNum < i) System.out.println("더 작은 수를 입력하세요.");
				else if(AnsNum > i) System.out.println("더 큰 수를 입력하세요.");
				else if(AnsNum == i) { 
					System.out.println("맞췄습니다.");
					System.out.println("시도횟수는 "+tryNum+"번입니다.");
					break;
				}
				tryNum++;
			}catch(InputMismatchException e) {
				System.out.println("***** 유효하지 않은 입력입니다. 다시 시작하세요. *****");
				System.out.println();
				tryNum++;
			}
		}
	}	
}
