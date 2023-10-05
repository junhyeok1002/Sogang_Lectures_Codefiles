L = [[1,3,5],[7,9],[],[11]]
a1, a2, a3 = L[0][0], L[0][1], L[0][2]
a = a1**2 + a2**2 + a3**2
b1, b2 = L[1][0], L[1][1]
b = b1**2 + b2**2
d = L[3][0]**2
DL = []
DL.append(a)
DL.append(b)
DL.append(d)
print('DoubleL = ',DL)
