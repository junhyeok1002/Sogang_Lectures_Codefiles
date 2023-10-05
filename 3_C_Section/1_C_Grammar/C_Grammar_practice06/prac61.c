//prac61
//20180634, √÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#define N 100

int main() {
	int n, p,n1,n2,n3,a,A[N],result,cycle,flag = 0;
	printf("Enter n and p: ");
	scanf_s("%d %d",&n,&p);
	A[0] = n;
	for (int i = 1; i < N; i++) {
		n3 = A[i-1] %10;
		n2 = ((A[i - 1] - n3) / 10)%10;
		n1 = (A[i - 1] - n2 * 10 - n3) / 100;
		a = pow(n1,p) + pow(n2, p) + pow(n3, p);
		A[i] = a;
	}
	flag = 0;
	for(int i = 0; i < N; i++) {
		for (int j = 0; j < N; j++) {
			if (i != j && A[i] == A[j]) {
				result = i;
				cycle = j;
				flag = 1;
				break;
			}
		}
		if (flag == 1) break;
	}
	printf("\nA:   ");
	for (int i = 0; i <= cycle; i++) {
		printf("%d ", A[i]);
	}

	printf("\n\nresult : %d\n",result);

	system("pause");
	return 0;
}
