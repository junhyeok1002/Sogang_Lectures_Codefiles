def password_check(x):
    password = True
    if x.isalnum() == True:
        password = True
    else :
        password = False
        print('error! 영문자, 숫자로만 구성되어야 함')
        
    if x.isnumeric() == True:
        password = False
        print('error! 영문자도 포함되어야 함')
    elif x.isalpha() == True:
        password = False
        print('error! 숫자도 포함되어야 함')

    if len(x) < 8 :
        password = False
        print('error! 8 글자 이상이어야 함')

# 숫자사 2개 이상일 경우도 적어야 함
    c = 0
    for i in range(len(x)):
        if x[i].isnumeric()==True:
            c = c+1
    if 0 < c < 2:
        password = False
        print('error! 최소한 2개의 숫자를 가지고 있어야 함')             

    if password == True :
        return 'Valid password'
    elif password == False :
        return 'Invalid password'
    
     
for i in range(5):
    x = input('Enter password: ')
    print(password_check(x))
