//20180634 ������
package practice2;

public class P2_20180634_2 {
	static boolean checkRepetition(int[] a, int[] b)
	{
		boolean flag = true;
		int x = a.length;
		int y = b.length;

		if (y%x != 0) return false;
		else {
			for (int i =0; i< y/x;i++) {
				for(int j=0;j<x;j++) {
					if(a[j] != b[j+x*i]) {
						flag = false;
						return false;
					}
				}
			}
		}
		return flag;
	}
	public static void main(String[] args)
	{
	int[] x1 = {2, 1};
	int[] x2 = {2, 1, 2, 1, 2, 1};
	System.out.println("x1 and x2 : " + checkRepetition(x1, x2));
	int[] x3 = {1, 2, 3};
	int[] x4 = {1, 2, 3, 1, 2, 3, 1};
	System.out.println("x3 and x4 : " + checkRepetition(x3, x4));
	int[] x5 = {5};
	int[] x6 = {5, 5, 5, 5, 5, 5};
	System.out.println("x5 and x6 : " + checkRepetition(x5, x6));
	int[] x7 = {1, 3, 5, 7, 9};
	int[] x8 = {1, 3, 5, 7, 9};
	System.out.println("x7 and x8 : " + checkRepetition(x7, x8));
	int[] x9 = {2, 3};
	int[] x10 = {2, 3, 4, 2, 3};
	System.out.println("x9 and x10 : " + checkRepetition(x9, x10));
	}

}
