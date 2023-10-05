// prac13
// 20180634, √÷¡ÿ«ı
#include <stdio.h>
#include <stdlib.h>

int main()
{
	int x, y;
	printf("Enter x : ");
	scanf_s("%d",&x);
	y = 2 * x*x*x + 10 * x*x + 5 * x + 7;
	printf("f(%d)=%d \n",x,y);

	system("pause");
	return 0;
}