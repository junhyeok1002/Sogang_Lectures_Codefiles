// prac21
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int elec, grade, tax, won ;
	double total;

	printf("���� ��뷮�� �Է��Ͻÿ� : ");
	scanf_s("%d",&elec);
	printf("����� �Է��Ͻÿ� : ");
	scanf_s("%d", &grade);

	switch (grade) {
	case 1: won = 1000;
		break;
	case 2: won = 800;
		break;
	case 3: won = 600;
		break;
	default: won = 0;
	}
	
	total = elec * won;
	tax = total * 0.1;
	total += tax;

	if (won == 0)
		printf("%d�� ���� ����Դϴ�. \n", grade);
	else 
		printf("�� �ݾ��� %.2f ���Դϴ�. \n",(double) total);

	system("pause");
	return 0;
}