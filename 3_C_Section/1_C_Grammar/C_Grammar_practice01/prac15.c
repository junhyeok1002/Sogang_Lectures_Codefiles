// prac15
// 20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int a, b, c;
	printf("세 개의 정수를 입력하시오 : ");
	scanf_s("%d%d%d", &a, &b, &c);
	if (a == b) {
		if (b == c)
			printf("%d, %d, %d는 모두 같은 수입니다. \n",a,b,c);
		else
			printf("%d, %d, %d에서 첫 번째 수와 두 번째 수가 같습니다. \n", a, b, c);
	}
	else {
		if (a == c)
			printf("%d, %d, %d에서 첫 번째 수와 세 번째 수가 같습니다. \n", a, b, c);
		else if (b == c)
			printf("%d, %d, %d에서 두 번째 수와 세 번째 수가 같습니다. \n", a, b, c);
		else
			printf("%d, %d, %d는 모두 다른 수입니다. \n", a, b, c);
	}
	system("pause");
	return 0;
}