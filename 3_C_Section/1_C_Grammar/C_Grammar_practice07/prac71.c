//prac71
//20180634, √÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int* fillArray(int);
void sortArray(int*, int);
void printArray(int*, int);
int main()
{
	int *A;
	int size;

	srand(time(NULL));
	
	printf("Enter size : ");
	scanf_s("%d", &size);
	
	A = fillArray(size);
	sortArray(A, size);
	printArray(A, size);
	
	system("pause");
	return 0;
}
int* fillArray(int s)
{
	int* p;
	p = (int*) malloc(4*s);
	
	for (int i = 0; i < s; i++) {
		p[i] = rand() % 30;
		for (int j = 0; j < i; j++) {
			if (p[i] == p[j]) {
				i--;
				j = 0;
			}
		}
	}
	return p;
}
void sortArray(int *a, int s)
{
	int temp;

	for (int i = 0; i < s - 1; i++) {
		for (int k = 1; k < s; k++) {
			if (a[k] < a[k - 1]) {
				temp = a[k];
				a[k] = a[k - 1];
				a[k - 1] = temp;
			}
		}
	}
}
void printArray(int *a, int s)
{
	printf("A : ");
	for (int i = 0; i < s; i++) {
		printf("%3d", a[i]);
	}
	printf("\n\n");
}
