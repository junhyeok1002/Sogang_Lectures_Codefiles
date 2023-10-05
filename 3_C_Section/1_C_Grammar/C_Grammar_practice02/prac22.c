// prac22
// 20180634, √÷¡ÿ«ı
#include <stdio.h>
#include <stdlib.h>

int main() {

	int n, i = 1, count;
	printf("Enter n : ");
	scanf_s("%d", &n);

	count = 0;
	while (i <= n)
	{
		if (n % i == 0) {
			count++;
			printf("%3d", i);
		}
		i++;
	}
	printf("\ncount : %d \n", count);

	system("pause");
	return 0;
}