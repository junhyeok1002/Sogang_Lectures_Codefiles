fruit = {'pear':[2,1000],'apple':[1,2000],'melon':[1,8000],'plum':[6,800]}
a = input('which fruit do you want? : ')
if a in fruit :
    print('{} :good taste!'.format(a))
    fruit[a][0] -= 1
elif a not in fruit :
    print('{} :sorry, not yet'.format(a))
    
if  fruit['pear'][0] <= 5 :
    aa = 5  - fruit['pear'][0]
else :
    aa = 0
if  fruit['apple'][0] <= 5 :
    bb = 5- fruit['apple'][0]
else :
    bb = 0
if  fruit['melon'][0] <= 5 :
    cc = 5  - fruit['melon'][0]
else :
    cc = 0
if  fruit['plum'][0] <= 5 :
    dd = 5  - fruit['plum'][0]
else :
    dd = 0
tc = aa*fruit['pear'][1] + bb*fruit['apple'][1] + \
     cc*fruit['melon'][1] + dd*fruit['plum'][1]
print('Total charges : {}원'.format(tc))
