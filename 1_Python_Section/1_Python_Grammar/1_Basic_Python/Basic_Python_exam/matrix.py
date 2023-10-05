def matrixform(n,m):
    LL = []
    y = list(int(x) for x in input('matrix: ').split())
    N = n*m
    print(y)
    for i in range(n):
        L = []
        for j in range(m):
            L.append(y[(i*m+j)])
        LL.append(L)
    return LL


def Rmatrix(x):
    for i in range(len(x)):
        for j in range(len(x[0])):
            print('{:>3d}'.format(x[i][j]), end= '')
        print()

def transpose(x):
    for i in range(len(x)):
        for j in range(len(x[0])):
            print('{:>3d}'.format(x[j][i]), end= '')
        print()

def minimatrix(x,a,b):
    for i in range(len(x)):
        if int(i)+1 == int(a):
            continue
        for j in range(len(x[0])):
            if int(j)+1 == int(b):
                continue
            print('{:>3d}'.format(x[i][j]), end= '')
        print()

aa = matrixform(3,3)
print(aa)
Rmatrix(aa)
print()
transpose(aa)
print()
minimatrix(aa,2,2)

    
