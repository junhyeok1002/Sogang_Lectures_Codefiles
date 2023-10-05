z = 'whileloop'
Z= list(z)
zz = '*'*len(z)
ZZ = list(zz)
x = 0
print('{}개의 문자로 이루어진 단어입니다. * 자리에 들어갈 문자를 입력하세요.'.format(len(z)))
print()
while(zz != z):
    i = 0
    a = input('추측하는 문자 하나 입력({}): '.format(zz))
    if a in z :
        if a in zz:
             print('{}은 이미 찾은 문자입니다.'.format(a))
        else :
            while i < len(Z):
                if Z[i] == a:
                    ZZ[i] = a 
                    zz = ''.join(ZZ)
                i = i+1
                
    elif a not in z :
        x = x + 1
        print('{}은 존재하지 않는 문자입니다.'.format(a))
print('찾은 단어는 {}입니다.'.format(z))
print('{}번 찾기 실패 했습니다.'.format(x))
