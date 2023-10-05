a = int(input('Enter # of lines : '))
if a % 2 == 0 :
    print('N must be >= 1 and odd!')
else :
    j= 1
    while(j < (a+1)/2):
        i = 1
        while(i <= j):
            print('*', end='')
            i = i+ 1
        j = j+1
        print()
    j = (a+1)/2
    while(j > 0):
        i = 1
        while(i <= j):
            print('*', end='')
            i = i+ 1
        j = j-1
        print()

