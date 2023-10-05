//prac42
//20180634,√÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
#define N 10
int main() {
	int A[N], max, i, count=0;
	for (i = 0; i < N; i++) {
		printf("A[%d] = ", i);
		scanf_s("%d",&A[i]);
		if (i == 0) max = A[i];
		else {
			if (max <= A[i]) max = A[i];
		}
	}
	for (int j = 0; j < N; j++) 
		if (A[j] == max) count += 1;
	printf("\n< πËø≠ >\n\n");
	for (int n = 0; n < N; n++)
		printf("%3d", A[n]);
	printf("\n\n");
	printf("max : %d, count : %d\n\n", max,count);


	printf("%d",A[4]);

	system("pause");
	return 0;
}