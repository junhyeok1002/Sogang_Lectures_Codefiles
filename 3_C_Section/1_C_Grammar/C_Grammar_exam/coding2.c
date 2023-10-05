//20180634, √÷¡ÿ«ı
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#define L 30

int main() {
	int i, num;
	char s[L], *check[10];
	FILE* fp;

	fp = fopen("data.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}
	fscanf(fp, "%d", &num);
	for (i = 0; i < num; i++) {
		fscanf(fp, "%s", s);
		*check = "Accepted";

		for (int j = 0; j < strlen(s) - 1; j++) {
			if (s[j] == s[j + 1]) *check = "Rejected";
		}

		printf("%10s : %8s\n", s, *check);
	}


	system("pause");
	return 0;
}