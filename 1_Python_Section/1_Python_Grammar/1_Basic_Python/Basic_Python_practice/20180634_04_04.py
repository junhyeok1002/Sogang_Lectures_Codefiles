num = 3.1415926; x = "123"; y = "abc"
print('{0[2]}, {0[0]}, {0[1]}'.format(x))
print('{:10.2f}'.format(num))
print('{:10d}'.format(int(x)))
print(y.ljust(10) + '{:$^10}'.format(x))
