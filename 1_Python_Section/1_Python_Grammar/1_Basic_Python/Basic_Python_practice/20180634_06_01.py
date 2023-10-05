a, b, c = input('세 개의 정수를 입력하시오:').split()
a = int(a) ; b = int(b) ; c = int(c)
if (a <= b):
    if (b <= c):
        d,e,f = c, b, a
    elif(b > c):
        if (a >= c):
            d,e,f = b, a, c
        elif (a < c):
            d,e,f = b, c, a
if (b <= c):
    if (c <= a):
        d,e,f = a, c, b
    elif (c > a):
        if(a >= b):
            d,e,f = c, a, b
        elif(a < b):
            d,e,f = c, b, a
if (c <= a):
    if(a <= b):
        d,e,f = b, a, c
    elif(a > b):
        if(b >= c):
            d,e,f = a, b, c
        elif(b < c):
            d,e,f = a, c, b
print("내림차순 정렬: %d %d %d"%(d,e,f))    

