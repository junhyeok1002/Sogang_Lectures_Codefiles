//20180634 최준혁

package practice3;

import java.util.Arrays;

public class P3_20180634_3 {

	static void rearrange(int[] A, int[] B) {
		// 메소드 완성할 것
		int Aeven[] = new int[A.length];
		int Aodd[] = new int[A.length];
		int evnum = 0, odnum=0;
		
		for(int i = 0; i < A.length ; i++) {
			if (A[i]%2 == 0) {
				Aeven[evnum] = A[i];
				evnum++;
			}
			else {
				Aodd[odnum] = A[i];
				odnum++;
			}
		}
		
		for(int i = evnum+1;i<A.length;i++) {
			Aeven[i] = 0;
		}
		for(int i = odnum+1;i<A.length;i++) {
			Aodd[i] = 0;
		}
		
		for(int i = 0;i<B.length;i++) {
			if (i%2 == 0) B[i] = Aeven[i/2];
			else B[i] = Aodd[(i-1)/2];
		}
		
		
	}
	public static void main(String[] args)
	{
		int A1[] = {3, 2, 1, 5, 7, 6, 9, 7};
		int A2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int A3[] = {1, 3, 5, 7, 9, 2, 4};
		int A4[] = {2, 2, 2, 1, 2, 5};
		int A5[] = {4};
		int A6[] = {7};
		
		int B1[] = new int[A1.length*2];
		int B2[] = new int[A2.length*2];
		int B3[] = new int[A3.length*2];
		int B4[] = new int[A4.length*2];
		int B5[] = new int[A5.length*2];
		int B6[] = new int[A6.length*2];
		
		rearrange(A1,B1);
		rearrange(A2,B2);
		rearrange(A3,B3);
		rearrange(A4,B4);
		rearrange(A5,B5);
		rearrange(A6,B6);
		
		// 배열 B1 ~ B6를 생성하고 메소드 rearrange()를 사용하여 채운다. 
		System.out.println("B1 : " + Arrays.toString(B1));
		System.out.println("B2 : " + Arrays.toString(B2));
		System.out.println("B3 : " + Arrays.toString(B3));
		System.out.println("B4 : " + Arrays.toString(B4));
		System.out.println("B5 : " + Arrays.toString(B5));
		System.out.println("B6 : " + Arrays.toString(B6));
	}
}
