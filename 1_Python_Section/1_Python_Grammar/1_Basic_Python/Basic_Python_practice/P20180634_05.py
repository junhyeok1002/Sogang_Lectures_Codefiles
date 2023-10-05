TimeData = ['23 10 140', '23 30 140','3 10 260','22 25 0','5 30 195']
i = 0
for x in range(len(TimeData)) :
    h,m,d = TimeData[x].split()
    h = int(h) ; m = int(m); d = int(d)
    dh = d // 60 ; dm = d % 60
    ph = h - dh ; pm = m - dm
    if pm < 0 :
        ph -= 1 ; pm += 60
    if ph < 0 :
        ph += 24

    i += 1
    print('Test{:3d}: The Past Time = {:2d}:{:2d}'.format(i,ph,pm))
                                                        

        


