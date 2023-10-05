// prac23
// 20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

int main(){

	int n, i=1, a, max, min;

	printf("입력받을 정수 개수를 입력하시오 : ");
	scanf_s("%d",&n);
	printf("\n");

	while (i <= n) {
		printf("%d 번째 정수 입력 : ",i);
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
	printf("\n가장 큰 수 : %d \n",max);
	printf("가장 작은 수 : %d \n", min);

	system("pause");
	return 0;
}