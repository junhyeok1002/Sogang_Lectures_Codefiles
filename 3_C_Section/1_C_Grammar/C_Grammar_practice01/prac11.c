// prac11
// 20180634, √÷¡ÿ«ı
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int n, total;
	double average;

	printf("Enter math score : ");
	scanf_s("%d", &n);
	total = n;

	printf("Enter korean score : ");
	scanf_s("%d", &n);
	total += n;

	printf("Enter english score : ");
	scanf_s("%d", &n);
	total += n;

	average = (double)total / 3;

	printf("total : %d \n",total);
	printf("average : %.2f \n",average);

	system("pause");
	return 0;
}