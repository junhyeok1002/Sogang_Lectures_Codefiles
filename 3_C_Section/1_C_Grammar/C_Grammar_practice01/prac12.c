// prac12
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main()
{
	double ctemp;
	double ftemp;

	printf("���� �µ��� �Է��Ͻÿ� : ");
	scanf_s("%lf",&ctemp);
	ftemp = ctemp * 1.8 + 32;
	printf("���� �µ� : %.3f \n",ctemp);
	printf("ȭ�� �µ� : %.3f \n",ftemp);

	system("pause");
	return 0;
}