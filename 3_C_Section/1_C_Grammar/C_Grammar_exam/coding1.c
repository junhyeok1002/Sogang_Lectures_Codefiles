//20180634, 최준혁
#include <stdio.h>
#include <stdlib.h>

#include <math.h>

typedef struct account {
	int no;         
	char name[10];  
	int credit;       
	int debit;      
	int amount;    
} Account;

int main() {
	Account *info = NULL;
	int i, no, credit, debit, cnt, max,maxcnt=0,amount = 0;
	char name[10];
	FILE* fp;

	fp = fopen("data.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}
	i = 0;
	while (fscanf(fp, "%d%s%d%d", &no, name, &credit, &debit) != -1) {
		i++;
	}
	cnt = i;

	info = (Account*)malloc(sizeof(Account) * cnt);

	fclose(fp);

	fp = fopen("data.txt", "r");
	if (fp == NULL) {
		fprintf(stderr, "file open error\n");
		exit(1);
	}

	i = 0;
	while (fscanf(fp, "%d%s%d%d", &info[i].no, info[i].name, &info[i].credit, &info[i].debit) != -1) {
		i++;
	}

	printf("        <<고객 정보>>\n");
	printf("---------------------------------------------------------\n");
	printf(" 번호      이름      저금액     대출액    실제보유금액\n");
	printf("---------------------------------------------------------\n");
	for (i = 0; i < cnt; i++) {
		info[i].amount = info[i].credit - info[i].debit;
		printf("%5d %10s %10d %10d %10d\n", info[i].no, info[i].name, info[i].credit, info[i].debit, info[i].amount);
	}
	printf("\n");
	printf("---------------------------------------------------------\n");



	max = info[0].amount;
	for (i = 1; i < cnt; i++) {
		if (info[i].amount > max) max = info[i].amount;
	}
	for (i = 0; i < cnt; i++) {
		if (info[i].amount == max) maxcnt++;
	}

	printf("\n<< 가장 저축을 많이 한 사람 : %d (총 %d명) >>\n",max,maxcnt);
	for (i = 0; i < cnt; i++) {
		if (info[i].amount == max)
			printf("%2d %10s %10d \n",info[i].no, info[i].name, info[i].amount);
	}
	printf("\n");
	system("pause");
	return 0;
}