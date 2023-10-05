//prac31
//20180634, 최준혁
#include<stdio.h>
#include<stdlib.h>
int main() {
	int n,a1=1,a2=1,fibo,i =3;
	printf("Enter input : ");
	scanf_s("%d",&n);

	if (n == 1 || n == 2) {
		fibo = 1;
		printf("fibonacci(%d) = %d\n", n, fibo);
	}

	else if (n >= 3) {
		while (i <= n) {
			fibo = a1 + a2;
			a1 = a2;
			a2 = fibo;
			i++;
		}
		printf("fibonacci(%d) = %d\n", n, fibo);
	}

	else
		printf("잘못된 입력입니다\n");
	
	system("pause");
	return 0;
}
