def insertion(x):
    x= list(x)
    for i in range(1,len(x)):
        key = x[i]
        j = i
        while j > 0 and key < x[j-1]:
            x[j] = x[j-1]
            j -= 1
        x[j] = key
    return ''.join(x)

def bubble(x):
    x = list(x)
    for i in range(0,len(x)-1):
        for j in range(0,len(x)-i-1):
            if x[j] > x[j+1] :
                tmp = x[j]
                x[j] = x[j+1]
                x[j+1] = tmp
    return ''.join(x)

x = input('정렬할 문자를 입력하세요: ')
L1 = insertion(x)
L2 = bubble(x)
print(L1, L2)

