//prac34
//20180634,최준혁
#include <stdio.h>
#include <stdlib.h>

int total(int x);
int subTotal(int x);

int main() {
	int n, result;

	printf("Enter n : ");
	scanf_s("%d", &n);

	if (n >= 0) {
		result = total(n);
		printf("result : %d\n",result);
	}
	else
		printf("잘못된 입력입니다\n");

	system("pause");
	return 0;
}
int total(int x) {
	int hang, result=0;
	for (int i = 1; i <= x; i++) {
		hang = subTotal(i);
		result += hang;
	}
	return result;
}
int subTotal(int x) {
	int hang = 0;
	for (int j = 1; j <= x; j++)
		hang += j;

	return hang;
}