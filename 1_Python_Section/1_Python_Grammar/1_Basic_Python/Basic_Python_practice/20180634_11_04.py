name=[]
mid =[]
final=[]
grade=[]
while(True):
    x = int(input('메뉴 1, 2, 3, 4 번 중 하나 선택 : '))
    if x == 1:
        a,b,c=input('이름 중간 기말 성적을 입력: ').split()
        if a not in name:
            name.append(a); mid.append(b) ; final.append(c)
        elif a in name:
            print('이미 등록된 이름 입니다')
        

    elif x ==2:
        for i in range(len(name)):
            y= int(mid[i])*0.4 + int(final[i])*0.6 ; y = int(y)
            if y >= 90 :
                grade.append('A')
            elif y >= 80:
                grade.append('B')
            elif y >= 70:
                grade.append('C')
            else:
                grade.append('D')
        print('입력된 학생들에게 학점을 부여했습니다.')

        
    elif x==3:
        print('{:8s}{:8s}{:8s}{:8s}'.format('name','mid','final','grade'))
        print('-'*32)
        for z in range(len(name)):
            print('{:8s}{:8s}{:8s}{:8s}'.format(name[z],mid[z],final[z],grade[z]))

    elif x ==4 :
        print('프로그램을 종료합니다')
        break

    else:
        print('없는 번호의 명령어입니다. 다시 선택하세요.')
                    


