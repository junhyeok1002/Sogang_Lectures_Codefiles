// prac24
// 20180634, √÷¡ÿ«ı
#include <stdio.h>
#include <stdlib.h>

int main() {

	int n;

	printf("Enter n : ");
	scanf_s("%d",&n);

	for (int i = 1; i <= n; i++) {
		for (int j = 1; j <= i; j++) {
			printf("*");
		}
		printf("\n");
	}
	system("pause");
	return 0;
}