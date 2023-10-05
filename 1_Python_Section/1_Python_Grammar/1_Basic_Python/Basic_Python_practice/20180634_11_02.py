def findword(a):
    a=a.lower()
    L=list(a.lower())
    L.remove(' ')

    d = dict()
    for i in range(len(L)):
        c= L.count(L[i])
        d[L[i]]=c
    return d

a= input('문자열 입력 : ')
x= findword(a)
LL=list(x)
for i in range(len(LL)):
    print('{}:{}'.format(LL[i],x[LL[i]]))
