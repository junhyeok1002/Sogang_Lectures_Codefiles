// prac14
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a, b, c;
	printf("�� ���� ������ �Է��Ͻÿ� : ");
	scanf_s("%d%d%d", &a,&b,&c);
	if (a < b) {
		if (b < c)
			printf("���� ū �� : %d \n", c);
		else 
			printf("���� ū �� : %d \n", b);
	}
	else {
		if (a < c)
			printf("���� ū �� : %d \n", c);
		else
			printf("���� ū �� : %d \n", a);
	}

	system("pause");
	return 0;
}