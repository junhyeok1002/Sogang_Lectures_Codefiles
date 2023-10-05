//prac92
//20180634, √÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
#define N 50

int main() {
	char X[N] = { 'R','T','T','B','B','B','G','G','G','G','G','G','E','E','E','F','F'};
	char x[N];
	char *a;
	int* b;
	int ac=0,nc=0, flag = 0;
	for (int i = 0; i < N; i++) {
		flag = 0;
		for (int j = 0; j < ac; j++) {
			if (x[j] == X[i]) flag = 1;
		}
		if (flag == 0) {
			x[ac] = X[i];
			ac++;
		}
	}
	ac--;
	a = (char*)malloc(4 * ac);
	for (int i = 0; i <= ac; i++) {
		*(a + i) = x[i];
	}

	b = (int*)malloc(4 * ac);

	for (int j = 0; j <= ac; j++) {
		for (int i = 0; i < N; i++) {
			if (*(a + j) == X[i]) nc++;
		}
		*(b + j) = nc;
		nc = 0;
	}

	printf("number of alphabet : %d \n\n", ac);
	printf("A : ");
	for (int i = 0; i <= ac; i++) {
		printf("%2c", *(a + i));
	}
	printf("\n");
	printf("B : ");
	for (int i = 0; i < ac; i++) {
		printf("%2d", *(b + i));
	}
	printf("\n");

	system("pause");
	return 0;
}