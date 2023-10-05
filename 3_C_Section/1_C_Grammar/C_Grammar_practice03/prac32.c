// prac32
// 20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

int main() {
	while (1) {
		int age, fee , mile;
		printf("나이를 입력하시오 : ");
		scanf_s("%d", &age);

		if (age == 0)
			break;

		else if (age <= 10 || age >= 65) {
			fee = 8000;
			fee = fee * 0.8;
			mile = fee * 0.05;
			printf("당신의 관람표는 %.2f원이고 적립금은 %.2f원입니다.\n\n", (double)fee, (double)mile);
		}

		else if (10 < age && age < 65) {
			fee = 8000;
			mile = fee * 0.05;
			printf("당신의 관람표는 %.2f원이고 적립금은 %.2f원입니다.\n\n", (double)fee, (double)mile);
		}
	}
	system("pause");
	return 0;
}
