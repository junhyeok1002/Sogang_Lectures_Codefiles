n = 1
L = []
sum = 0
k = 0
while(True):
    a = input('정수를 입력 (0을 입력하면 종료): ')
    if (a == '0' or a == ''):
        break
    L.append(int(a))
    sum = sum + int(a)
    k = k + 1
if k == 0:
    k= 1
print('입력한 정수 리스트 :',L)
print('합계 :',sum)
print('평균 :',sum/k)

    
