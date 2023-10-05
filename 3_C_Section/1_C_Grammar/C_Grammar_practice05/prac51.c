//prac51
//20180634, ������

#include <stdio.h>
#include <stdlib.h>
#define N 9

int fill(int A[]);
int print(int A[]);
int find(int A[], int* x, int* y, int* z);

int main() {
	int A[N] = { 0 };
	int max, min, mid;

	printf("�Լ� fill()�� �̿��Ͽ� �迭 A ä��� \n");
	fill(A);

	printf("\n�Լ� print()�� �̿��Ͽ� �迭 ����ϱ� \n");
	print(A);

	printf("\n�ִ밪, �ּҰ�, �߰��� ã��\n");
	find(A, &max, &min, &mid);
	printf("-----------------------------\n");
	printf("�ִ밪 : %d\n", max);
	printf("�ּҰ� : %d\n", min);
	printf("�߰��� : %d\n", mid);

	system("pause");
	return 0;
}
int fill(int A[]) {
	int i;
	for (i = 0; i < N; i++) {
		printf("A[%d] = ", i);
		scanf_s("%d", &A[i]);
	}
}
int find(int A[], int* x, int* y, int* z) {
	int tmp, max, min, mid;
	for (int j = 0; j < N; j++) {
		for (int i = 0; i < N - 1; i++) {
			if (A[i] > A[i + 1]) {
				tmp = A[i + 1];
				A[i + 1] = A[i];
				A[i] = tmp;
			}
		}
	}
	*x = A[N - 1];
	*y = A[0];
	*z = A[(N-1)/2];
}
int print(int A[]) {
	for (int i = 0; i < N; i++) {
		printf("%3d",A[i]);
	}
}