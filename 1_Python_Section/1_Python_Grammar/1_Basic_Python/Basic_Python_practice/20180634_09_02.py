L = []
for x in range(1,101):
    if x % 2 == 0:
        L.append(x)

for y in L :
    if y % 8 ==0:
        print(y, end=' ')
