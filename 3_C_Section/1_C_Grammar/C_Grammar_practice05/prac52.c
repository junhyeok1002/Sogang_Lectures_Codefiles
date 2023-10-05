//prac52
//20180634, √÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
#define N 8

int main() {
	int A[N][N];
	for (int i = 1; i <= N; i++) {
		if (i % 2 == 1) {
			for (int j = 1; j <= N; j++) {
				A[i - 1][j - 1] = (i - 1) * N + j;
				printf("%3d", (i - 1) * N + j);
			}
		}
		else if (i % 2 == 0) {
			for (int j = N; j >= 1; j--) {
				A[i - 1][j - 1] = (i - 1) * N + j;
				printf("%3d", (i - 1) * N + j);
			}
		}
		printf("\n");
	}
	system("pause");
	return 0;

}