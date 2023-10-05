//prac91
//20180634,√÷¡ÿ«ı

#include <stdio.h>
#include <stdlib.h>
struct complex {
	double real; 
	double imag;
};

typedef struct complex COMP;

COMP add(COMP, COMP);
COMP minus(COMP, COMP);
COMP mult(COMP, COMP);
COMP divide(COMP, COMP);

int main()
{
	COMP a, b, c, d, e, f;

	printf("Enter a.real and a.imag : ");
	scanf("%lf%lf", &a.real, &a.imag);

	printf("Enter b.real and b.imag : ");
	scanf("%lf%lf", &b.real, &b.imag);

	c = add(a, b);
	d = minus(a, b);
	e = mult(a, b);
	f = divide(a, b);

	printf("a = %.2lf + %.2lfi \n", a.real, a.imag);
	printf("b = %.2lf + %.2lfi \n", b.real, b.imag);
	printf("a + b = %.2lf + %.2lfi \n", c.real, c.imag);
	printf("a - b = %.2lf + %.2lfi \n", d.real, d.imag);
	printf("a * b = %.2lf + %.2lfi \n", e.real, e.imag);
	printf("a / b = %.2lf + %.2lfi \n", f.real, f.imag);

	system("pause");
	return 0;
}
COMP add(COMP x, COMP y) {
	COMP z;
	z.real = x.real + y.real;
	z.imag = x.imag + y.imag;
	return z;
}
COMP minus(COMP x, COMP y) {
	COMP z;
	z.real = x.real - y.real;
	z.imag = x.imag - y.imag;
	return z;
}
COMP mult(COMP x, COMP y) {
	COMP z;
	z.real = x.real * y.real - x.imag * y.imag;
	z.imag = x.real * y.imag + x.imag * y.real;
	return z;
}
COMP divide(COMP x, COMP y) {
	COMP z;
	int k;
	z.real = x.real * y.real - x.imag * (-y.imag);
	z.imag = x.real * (-y.imag) +  x.imag * y.real;
	k = y.real*y.real + y.imag*y.imag;
	z.real /= k;
	z.imag /= k;
	return z;
}

