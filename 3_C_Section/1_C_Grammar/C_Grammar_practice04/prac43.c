//prac43
//20180634,최준혁

#include <stdio.h>
#include <stdlib.h>
#define N 10
#include <math.h>
int main() {
	int A[N],B, max, i, maxi;
	for (i = 0; i < N; i++) {
		printf("A[%d] = ", i);
		scanf_s("%d", &A[i]);
		if(i == 1){
			B= (int) abs((int)A[i]-A[i-1]);
			max = B;
		}
		else if(i>=2) {
			B = (int)abs((int)A[i] - A[i - 1]);
			if (B >= max) {
				max = B;
			}
		}
	}
	for (i = 0; i < N; i++) {
		if (i == 0) continue;
		else if (i >= 1) {
			B = (int)abs(A[i] - A[i - 1]);
			if (max == B) {
				maxi = i;
				break;
			}
		}
	}

	printf("\n< 배열 >\n\n");
	for (int n = 0; n < N; n++)
		printf("%3d", A[n]);

	printf("\n\n");
	printf("%d와 %d 사이의 절대값 차가 %d로 가장 크다\n\n", maxi-1,maxi,max);

	system("pause");
	return 0;
}