// prac23
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main(){

	int n, i=1, a, max, min;

	printf("�Է¹��� ���� ������ �Է��Ͻÿ� : ");
	scanf_s("%d",&n);
	printf("\n");

	while (i <= n) {
		printf("%d ��° ���� �Է� : ",i);
		scanf_s("%d",&a);

		if (i == 1) {
			max = a;
			min = a;
		}
		else if (i >= 2) {
			if (max <= a)
				max = a;
			if (min >= a)
				min = a;
		}
		i++;
	}
	printf("\n���� ū �� : %d \n",max);
	printf("���� ���� �� : %d \n", min);

	system("pause");
	return 0;
}