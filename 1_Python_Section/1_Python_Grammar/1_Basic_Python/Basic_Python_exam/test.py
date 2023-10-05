def makeTree(x):
    global d
    d = dict()
    for i in range(len(x)):
        l = []
        for n in range(len(x)):
            if i == x[n]:
                l.append(n)
            d[i] = l
    return d

def findParent(a,T):
    for i in range(len(T)):
        if int(a) in T.get(i):
            return i
                
TreeInfo = [-1, 0 ,1, 1, 2, 2, 2]
N = len(TreeInfo)

T = makeTree(TreeInfo)

print('{}개의 노드가 존재하는 트리입니다'.format(N))
print()

while True:
    id= input('노드 번호 입력 : ')
    if id.isnumeric() :
        id = int(id)
        if id >= N:
            print('노드 번호 {}은 존재하지 않는 노드 번호입니다.'.format(id))
            print()
        
        elif id == 0:
            print('노드 번호 {}은 부모 노드가 없는 루트 노드입니다.'.format(id))
            print()
        else :
            parent = findParent(id,T)
            print('노드 번호 {}의 부모 노드 번호는 {}입니다.'.format(id,parent))
            print()
    else :
        print()
        print('******프로그램 종료')
        break


