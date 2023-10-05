import numpy as np

a = np.zeros((2, 3)) # 2×3 영행렬
print("a =", a)

b = np.ones((2, 2)) # 모든 성분이 1인 2×2 행렬
print("b =", b)

c = np.full((3, 2), 3) # 모든 성분이 3인 3×2 행렬
print("c =", c)

d = np.eye(2) # 2×2 단위행렬
print("d =", d)
