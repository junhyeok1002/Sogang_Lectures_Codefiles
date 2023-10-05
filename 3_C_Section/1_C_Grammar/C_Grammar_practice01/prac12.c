// prac12
// 20180634, ÃÖÁØÇõ
#include <stdio.h>
#include <stdlib.h>

int main()
{
	double ctemp;
	double ftemp;

	printf("¼·¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À : ");
	scanf_s("%lf",&ctemp);
	ftemp = ctemp * 1.8 + 32;
	printf("¼·¾¾ ¿Âµµ : %.3f \n",ctemp);
	printf("È­¾¾ ¿Âµµ : %.3f \n",ftemp);

	system("pause");
	return 0;
}