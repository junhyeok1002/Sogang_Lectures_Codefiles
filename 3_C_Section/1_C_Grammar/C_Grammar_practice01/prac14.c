// prac14
// 20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a, b, c;
	printf("세 개의 정수를 입력하시오 : ");
	scanf_s("%d%d%d", &a,&b,&c);
	if (a < b) {
		if (b < c)
			printf("가장 큰 수 : %d \n", c);
		else 
			printf("가장 큰 수 : %d \n", b);
	}
	else {
		if (a < c)
			printf("가장 큰 수 : %d \n", c);
		else
			printf("가장 큰 수 : %d \n", a);
	}

	system("pause");
	return 0;
}