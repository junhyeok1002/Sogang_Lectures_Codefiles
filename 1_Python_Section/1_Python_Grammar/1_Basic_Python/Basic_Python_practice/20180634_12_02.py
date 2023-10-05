import random

def p_coin(x):
    global N ; N = [1,2,3,4,5,6,7,8,9,10,20,30,40,50,60,70,80,90,100]
    global P ; P = []
    global f 
    count = 0
    for i in range(1,x+1):
        coin = random.randint(0,1)
        if coin == 0:
            count += 1
            
        if i in N :
            P.append(count)
            f = count
        elif i == x :
            f = count

x = int(input('동전 던지기 시도 횟수를 입력(1 - 100): '))
if x < 1 or 100 < x:
    print('1에서 100까지의 숫자를 입력해 주세요')
elif 1 <= x <= 100:
    p_coin(x)
    for i in range(len(P)):
        y = int((P[i]/N[i])*100)
        print('   {:3d} 번째까지 던지기에서 앞면이 나온 확률 : {:3d}%'.format(N[i],y))
    print()
    print('*'*50)
    print('총 {:3d}번 동전 던지기에서 앞면이 나올 확률 : {:3d}%'.format(x,int((f/x)*100)))

