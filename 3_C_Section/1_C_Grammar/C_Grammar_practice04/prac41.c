//prac41
//20180634,√÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>

int mypower(int a,int b);

int main() {
	int a, b, result;

	printf("Enter two positive integers : ");
	scanf_s("%d%d",&a,&b);

	result = mypower(a,b);

	printf("result : %d \n",result);

	system("pause");
	return 0;
}
int sum = 1;
int mypower(int a, int b) {
	if (b == 0) return 1;
	else{
		sum *= a;
		b--;
		if (b == 0) return sum;
	}
	mypower(a,b);
}
