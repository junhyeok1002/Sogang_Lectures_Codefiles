x = float(input('Enter the square matrix size : ' ))
if x < 0:
    print('', end = '')
elif x >0:
    x = int(x)
    X =x**2
    for i in range(X):
        print('{:3d}'.format(i), end = ' ')
        if (i+1) % x == 0 :
            print()
            
print('*****Spiral Order******')


