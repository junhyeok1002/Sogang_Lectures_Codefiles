//20180634 ������;
// �� ���� �Ĳ��� �ٽ� ����

package p1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class P7_20180634_1 {
	public static void main(String args[]) { 
		int tryNum = 1;
		int AnsNum = (int)(Math.random()*100) ;
		AnsNum++;
		System.out.println("1���� 100������ �ϳ��� ������ �����߽��ϴ�.");
		System.out.println("���� ������ ^^");
		System.out.println("--------------------------------");

		while(true) {
			try {
				Scanner scin= new Scanner(System.in); 
				System.out.print("1�� 100������ ���� �Է��ϼ��� : "); 
				
				int i= scin.nextInt(); 
				
				if(AnsNum < i) System.out.println("�� ���� ���� �Է��ϼ���.");
				else if(AnsNum > i) System.out.println("�� ū ���� �Է��ϼ���.");
				else if(AnsNum == i) { 
					System.out.println("������ϴ�.");
					System.out.println("�õ�Ƚ���� "+tryNum+"���Դϴ�.");
					break;
				}
				tryNum++;
			}catch(InputMismatchException e) {
				System.out.println("***** ��ȿ���� ���� �Է��Դϴ�. �ٽ� �����ϼ���. *****");
				System.out.println();
				tryNum++;
			}
		}
	}	
}
