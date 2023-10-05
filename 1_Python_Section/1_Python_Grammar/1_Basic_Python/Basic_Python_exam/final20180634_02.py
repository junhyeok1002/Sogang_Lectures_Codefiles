from random import*
L = []
while(True):
    x = randint(1,50)
    if x in L:
        continue
    L.append(x)
    if len(L) == 10:
        break


def bubble1(x):
    for j in range(len(x)):
        for i in range(0,len(x)-1):
            if x[i] > x[i+1]:
                tmp = x[i]
                x[i] = x[i+1]
                x[i+1] = tmp
    return x

def bubble2(x):
    for j in range(len(x)):
        for i in range(0,len(x)-1):
            if x[i] < x[i+1]:
                tmp = x[i]
                x[i] = x[i+1]
                x[i+1] = tmp
    return x


print('Before bubble sort : {}'.format(L))
a = int(input('1. acending sort 2. descending sort : '))
if a == 1:
    print('After bbubble sort :',bubble1(L))
elif a == 2 :
    print('After bbubble sort :',bubble2(L))

