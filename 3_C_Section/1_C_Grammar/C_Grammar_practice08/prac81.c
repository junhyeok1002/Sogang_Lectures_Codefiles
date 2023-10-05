//prac81
//20180634, √÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>

int mylen(char*);
void mycpy(char*, char*);
void mycat(char*, char*);
int mycmp(char*, char*);

int main()
{
	char a[50] = { '\0' };
	char b[50] = { '\0' };
	char c[50] = { 0 };
	char d[50] = { 0 };

	printf("Enter string a : ");
	scanf("%s", a);
	printf("Enter string b : ");
	scanf("%s", b);
	printf("Enter string c : ");
	scanf("%s", c);
	printf("Enter string d : ");
	scanf("%s", d);

	printf("\n");
	printf("STRING LENGTH : \n");
	printf("a : %s (length %d) \n", a, mylen(a));
	printf("b : %s (length %d) \n", b, mylen(b));
	printf("c : %s (length %d) \n", c, mylen(c));
	printf("d : %s (length %d) \n", d, mylen(d));

	printf("\n");
	printf("AFTER COPY mycpy(a,b) \n");
	mycpy(a, b);
	printf("a : %s (length %d) \n", a, mylen(a));
	printf("b : %s (length %d) \n", b, mylen(b));

	printf("\n");
	printf("AFTER mycmp(c,d) \n");

	printf("mycmp(%s, %s) : %d \n", c, d, mycmp(c, d));

	printf("\n");
	printf("AFTER mycat(c,d) \n");

	mycat(c, d);
	printf("c : %s (length %d) \n", c, mylen(c));
	printf("d : %s (length %d) \n", d, mylen(d));

	system("pause");
	return 0;
}
int mylen(char*x) {
	int count = 0;
	for (int i = 0;; i++) {
		if (x[i] == '\0') break;
		count++;
	}
	return count;
}
void mycpy(char*x, char*y) {
	for (int i = 0; i <= mylen(y); i++) {
		*(x+i) = *(y + i);
	}
}
void mycat(char*x, char*y) {
	int n = mylen(x);
	for (int i = 0; i <= mylen(y); i++) {
		*(x + (i + n)) = *(y + i);
	}
}
int mycmp(char*x, char*y) {
	if (mylen(x) < mylen(y)) {
		for (int i = 0; i < mylen(x); i++) {
			if (*(x + i) == *(y + i)) continue;
			else if (*(x + i) != *(y + i)) {
				if (*(x + i) - *(y + i) < 0) return -1;
				else if (*(x + i) - *(y + i) > 0) return 1;
			}
		}
		return -1;
	}
	else if (mylen(x) > mylen(y)) {
		for (int i = 0; i < mylen(y); i++) {
			if (*(x + i) == *(y + i)) continue;
			else if (*(x + i) != *(y + i)) {
				if (*(x + i) - *(y + i) < 0) return -1;
				else if (*(x + i) - *(y + i) > 0) return 1;
			}
		}
		return 1;
	}
	else {
		for (int i = 0; i < mylen(x); i++) {
			if (*(x + i) == *(y + i)) continue;
			else if (*(x + i) != *(y + i)) {
				if (*(x + i) - *(y + i) < 0) return -1;
				else if (*(x + i) - *(y + i) > 0) return 1;
			}
		}
		return 0;
	}
}