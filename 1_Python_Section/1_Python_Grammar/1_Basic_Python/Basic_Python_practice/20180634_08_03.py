a = {'컴퓨터공학':'AS','수학':'R','전자공학':'R','영어영문':'GA','심리학':'X'}
b = input('찾는 학과명을 입력 : ')
x = a.get(b, 'NotYet')
if x == 'NotYet' :
    a[b] = 'GN'
    print('{}과는 아직 빌딩 정보가 없습니다. "GN" 건물에 배정합니다.'.format(b))

else :
    print('{}과는 {} 건물에 있습니다.'.format(b,a[b]))
print('**** Building Information ****')
print(a)
