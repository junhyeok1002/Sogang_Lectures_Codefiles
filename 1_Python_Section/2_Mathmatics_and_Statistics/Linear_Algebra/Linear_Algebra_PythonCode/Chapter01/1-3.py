import numpy as np

A = np.array([[1, 2, 3], # 3x3 행렬 A 생성
              [4, 5, 6],
              [7, 8, 9]])

v = np.array([[1], # 3x1 벡터 v 생성
              [2],
              [3]])

print("A =", A)
print("v =", v)

print("A.shape =", A.shape) # 행렬 A의 크기
print("v.shape =", v.shape) # 벡터 v의 크기

w = np.array([1, 2, 3]) # 1x3 벡터 w 생성
print("w =", w)
print("w.shape =", w.shape) # 벡터 w의 크기

B = np.array([[1, 2, 3], [4, 5, 6]]) # 2x3 행렬 B 생성
print("B = ", B)
print("B.shape =", B.shape) # 행렬 B의 크기
