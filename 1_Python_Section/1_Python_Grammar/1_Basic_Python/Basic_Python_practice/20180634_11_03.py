def swap(x):
    x=list(x)
    for i in range(len(x)):
        if x[i].islower()==True:
            x[i] = x[i].upper()
        elif x[i].isupper()==True:
            x[i] = x[i].lower()
    x = ''.join(x)
    return(x)

x = input('Enter sting: ')
print(swap(x))
