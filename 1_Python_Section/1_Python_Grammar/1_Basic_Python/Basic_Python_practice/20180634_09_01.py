for x in range(10):
    a = int(input('Enter a number : '))
    if a == 0 :
        print('입력 받은 수가 0 입니다')
        break

    if a < 0 :
        b = '음수'
    elif a > 0 :
        b = '양수'

    if a % 2 ==0:
        c = '짝수'
    elif a % 2 != 0:
        c = '홀수'
    print('{} : {}, {}'.format(a,b,c))
print('프로그램을 종료합니다')
