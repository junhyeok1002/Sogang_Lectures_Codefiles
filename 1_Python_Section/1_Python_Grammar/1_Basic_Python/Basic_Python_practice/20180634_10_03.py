L = list(input('랜덤하게 원하는 횟수만큼 입력(1에서 10사이): ').split())
n = 1
while n <= 10:
    i = 0
    k = 0
    n = str(n)
    while i < len(L):
        if L[i] == n :
            k=k+1
        i=i+1
    print('숫자 {}는 {}번 입력 되었습니다.'.format(n,k))
    n = int(n)
    n = n+1

