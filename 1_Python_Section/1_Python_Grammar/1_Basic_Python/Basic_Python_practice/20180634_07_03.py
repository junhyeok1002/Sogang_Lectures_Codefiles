a = input('첫번째 문자열을 입력:')
b = input('두번째 문자열을 입력:')
A = list(a)
B = list(b)
A1 = sorted(A)
B1 = sorted(B)
if A1 == B1 :
    print('{}, {} 는 anagram입니다.'.format(a, b))
else :
    print('{}, {} 는 anagram이 아닙니다.'.format(a, b))
