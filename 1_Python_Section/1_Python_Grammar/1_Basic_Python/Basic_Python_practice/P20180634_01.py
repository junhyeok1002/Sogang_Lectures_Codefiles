from time import*
start_time = time()
a = time()
h = int(a // 3600)
m = int((a % h) // 60)
s = int(a % 60)
print('{} 시각 : {} 시 {} 분 {} 초'.format(a, h, m, s))
end_time = time()
print('연산에 소요된 시간 : {}'.format(end_time - start_time))
