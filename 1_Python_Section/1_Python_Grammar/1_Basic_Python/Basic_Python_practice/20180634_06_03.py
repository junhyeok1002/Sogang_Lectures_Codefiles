a, b = input('두 자리 정수 두개를 입력:').split()
a = int(a) ; b = int(b)
a1 = a // 10 ; a2 = a % 10 ; b1 = b //10 ; b2 = b % 10
if(a1 ==b1 and a2 == b2):
    print('두 정수는 모두 {} 로 같은 정수입니다.'.format(a))
elif(a1 == b1 or a2 == b2 or a1 == b2 or a2 == b1):
    print('{}, {} : 하나의 숫자만 일치합니다.'.format(a, b))
elif(a1 == b2 and a2 == b1):
    print('{}, {} : 자리 값만 다른 정수입니다.'.format(a, b))
else:
    print('{}, {} : 일치하지 않는 정수입니다.'.format(a, b))
