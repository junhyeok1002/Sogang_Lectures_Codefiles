// prac32
// 20180634, ������
#include <stdio.h>
#include <stdlib.h>

int main() {
	while (1) {
		int age, fee , mile;
		printf("���̸� �Է��Ͻÿ� : ");
		scanf_s("%d", &age);

		if (age == 0)
			break;

		else if (age <= 10 || age >= 65) {
			fee = 8000;
			fee = fee * 0.8;
			mile = fee * 0.05;
			printf("����� ����ǥ�� %.2f���̰� �������� %.2f���Դϴ�.\n\n", (double)fee, (double)mile);
		}

		else if (10 < age && age < 65) {
			fee = 8000;
			mile = fee * 0.05;
			printf("����� ����ǥ�� %.2f���̰� �������� %.2f���Դϴ�.\n\n", (double)fee, (double)mile);
		}
	}
	system("pause");
	return 0;
}
