import numpy as np

A = np.array([[2, 3], [3, -6]])
w1, V1 = np.linalg.eig(A) # A의 고윳값과 고유벡터 계산

print("A의 고윳값 = ", w1)
print("A의 고유벡터 = ", V1)

B = np.array([[5,2,0], [2,5,0], [-3,4,6]])
w2, V2 = np.linalg.eig(B) # B의 고윳값과 고유벡터 계산

print("\nB의 고윳값 = ", w2)
print("B의 고유벡터 = ", V2)
