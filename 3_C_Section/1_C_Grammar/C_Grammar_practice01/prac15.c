// prac15
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a, b, c;
	printf("�� ���� ������ �Է��Ͻÿ� : ");
	scanf_s("%d%d%d", &a, &b, &c);
	if (a == b) {
		if (b == c)
			printf("%d, %d, %d�� ��� ���� ���Դϴ�. \n",a,b,c);
		else
			printf("%d, %d, %d���� ù ��° ���� �� ��° ���� �����ϴ�. \n", a, b, c);
	}
	else {
		if (a == c)
			printf("%d, %d, %d���� ù ��° ���� �� ��° ���� �����ϴ�. \n", a, b, c);
		else if (b == c)
			printf("%d, %d, %d���� �� ��° ���� �� ��° ���� �����ϴ�. \n", a, b, c);
		else
			printf("%d, %d, %d�� ��� �ٸ� ���Դϴ�. \n", a, b, c);
	}
	system("pause");
	return 0;
}