sample = 'abcABCdEFaBCDeFAbC'
a = sample.lower()
x = 'abc'
y = 'def'
b = a.find(x)
c = a.count(x)
B = a.find(y)
C = a.count(y)
print('"abc 문자열 : %d 인덱스, %d 번 존재"' %(b, c))
print('"def 문자열 : %d 인덱스, %d 번 존재"' %(B, C))
