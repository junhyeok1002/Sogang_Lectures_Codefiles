import numpy as np

# 행렬 A를 출력하는 함수
def pprint(msg, A):
    print("---", msg, "---")
    (n,m) = A.shape
    for i in range(0, n):
        line = ""
        for j in range(0, m):
            line += "{0:.2f}".format(A[i,j]) + "\t"
        print(line)
    print("")
    
A = np.eye(4)
pprint("A", A)
print("rank(A) =", np.linalg.matrix_rank(A)) # 행렬 A의 계수 계산

B = np.zeros((3,3))
pprint("B", B)
print("rank(B) =", np.linalg.matrix_rank(B)) # 행렬 B의 계수 계산

C = np.array([[2, 5, -3, -4, 8],
              [4, 7, -4, -3, 9],
              [6, 9, -5, 2, 4],
              [0, -9, 6, 5, -6]]);
pprint("C", C)
print("rank(C) =", np.linalg.matrix_rank(C)) # 행렬 C의 계수 계산

CT = np.transpose(C)
pprint("C^T", CT)
print("rank(C^T) =", np.linalg.matrix_rank(CT)) # 행렬 C^T의 계수 계산
