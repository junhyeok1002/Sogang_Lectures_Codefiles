while(True):
    a = int(input('Enter a number (negative to quit) : '))
    A = a**2
    if a < 0 :
        print('The end of the sequence generation.')
        break
    for x in range(len(str(A))):
        print((A % 10)**2)
        A = A //10

