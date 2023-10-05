L = list(int(x) for x in input('공백으로 구분한 숫자들을 입력 : ').split())
y = L[0]
for a in L :
    if a <= y :
        y = a
for b in range(len(L)) :
    if L[b] == y :
        break
print('가장 작은 값을 가지는 원소의 인덱스 : {}'.format(b))
