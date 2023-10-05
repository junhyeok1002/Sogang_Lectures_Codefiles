a = int(input('구하려는 소수의 개수를 입력 : '))
L = []
n = 2
while(len(L) < a):
    if a == 0 :
        break
    prime = True
    k = 2
    while k < n:
        if n % k == 0:
            prime = False
            break
        k = k + 1
    if prime == True :
        if n not in L:
            L.append(n)
            print(n)
        else :
            continue
    n = n+1
print('{} 개의 소수를 찾았습니다'.format(a))
