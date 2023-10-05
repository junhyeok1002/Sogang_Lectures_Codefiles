// prac21
// 20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int elec, grade, tax, won ;
	double total;

	printf("전기 사용량을 입력하시오 : ");
	scanf_s("%d",&elec);
	printf("등급을 입력하시오 : ");
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
		printf("%d는 없는 등급입니다. \n", grade);
	else 
		printf("총 금액은 %.2f 원입니다. \n",(double) total);

	system("pause");
	return 0;
}