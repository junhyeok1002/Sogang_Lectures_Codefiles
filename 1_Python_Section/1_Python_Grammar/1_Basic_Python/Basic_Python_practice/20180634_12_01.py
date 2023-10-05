def add(a,c):
    y = a + c
    return y

def minus(a,c):
    y = a - c
    return y

def mul(a,c):
    y = a * c
    return y

def div(a,c):
    y = a / c
    return y


a, b, c = input('수식 입력(예: 20 * 40): ').split()
a = float(a);c = float(c)
if(b == '+'):
    s = add(a,c)
    print('%.6f %s %.6f = %.6f'%(a, b, c, s))
elif(b == '-'):
    s = minus(a,c)
    print('%.6f %s %.6f = %.6f'%(a, b, c, s))
elif(b == '*'):
    s = mul(a,c)
    print('%.6f %s %.6f = %.6f'%(a, b, c, s))
elif(b == '/'):
    if(c == 0):
        print('%.6f 로 나누기를 수행할 수 없습니다'%(0))
    else:
        s = div(a,c)
        print('%.6f %s %.6f = %.6f'%(a, b, c, s))

else:
    print('{} 지원하지 않는 연산자입니다'.format(b))

