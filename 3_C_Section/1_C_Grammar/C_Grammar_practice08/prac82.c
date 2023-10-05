//prac82
//20180634, 최준혁

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main() 
{
	srand(time(NULL));

	int a,b,count=0,n=0;
	int* p,*q;

	printf("Enter count : ");
	scanf_s("%d",&a);

	p = (int*)malloc(4 * a);

	for (int i = 0; i < a; i++) {
		*(p + i) = rand() % 51;
		if (*(p + i) == 0) i--;
	}
	printf("A: ");
	for (int i = 0; i < a; i++) {
		printf("%3d", *(p + i));
	}

	printf("\nEnter n : ");
	scanf_s("%d", &b);

	for (int i = 0; i < a; i++) {
		if (b % *(p + i) == 0) {
			count++;
		}
	}

	q = (int*)malloc(4 * count);

	for (int i = 0; i < a; i++) {
		if (b % *(p + i) == 0) {
			*(q + n) = *(p + i);
			n++;
		}
	}

	printf("%d의 약수의 개수 : %d",b,count);
	printf("\nB: ");
	for (int i = 0; i < count; i++) {
		printf("%3d", *(q + i));
	}
	printf("\n");

	system("pause");
	return 0;
}