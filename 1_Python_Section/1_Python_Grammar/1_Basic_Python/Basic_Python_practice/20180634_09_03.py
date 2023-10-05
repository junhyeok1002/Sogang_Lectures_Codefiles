A = [4,8,2,3,4,2]
B = [7,2,5,2,3,6,5]
C = []
for x in A:
    for y in B:
        if x == y :
            if x in C :
                continue
            C.append(x)
print(C)

