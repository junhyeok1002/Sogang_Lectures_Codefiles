//prac101
//20180634,최준혁 

#include <stdio.h>
#include <stdlib.h>

typedef struct student{
	int num;
	char name[10];
	int score;
}  STUDENT;

int main() {

	STUDENT p[100];
	int i,count = 0,max = -1,maxi=0;
	FILE* fp;


	fp = fopen("score.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}

	i = 0;
	while (fscanf(fp, "%d%s%d", &p[i].num, p[i].name, &p[i].score) != -1) {
		i++;
		count++;	
	}

	for (i = 0; i < count; i++) {
		if (p[i].score > max) max = p[i].score;
	}

	printf("<< 학생 정보 >>\n");
	printf("----------------------\n");

	for (i = 0; i < count; i++) {
		printf("%d%10s%3d\n", p[i].num, p[i].name,p[i].score);
	}
	printf("\n----------------------\n");

	fclose(fp);
	fp = fopen("score.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}

	for (i = 0; i < count; i++) {
		if (p[i].score == max) maxi++;
	}

	printf("<< 최고 성적 : %d (총 %d명) >>\n",max,maxi);

	fclose(fp);
	fp = fopen("score.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}

	for (i = 0; i < count; i++) {
		if(p[i].score == max ) printf("%d%10s%3d\n", p[i].num, p[i].name, p[i].score);
	}

	system("pause");
	return 0;

}