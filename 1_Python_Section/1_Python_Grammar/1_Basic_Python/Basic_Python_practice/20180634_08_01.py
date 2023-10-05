s1 = {'종민','세윤','시우','고수','준호','우종','보검','태현','공유','두준'}
sl = {'우종','보검'}
sab = {'우종','종민','두준','보검'}
sl_sab = sl.union(sab)
sbonus= s1.difference(sl_sab)
print('전체 사원 명단 : {}'.format(s1))
print('지각자 명단 : {}'.format(sl))
print('결근자 명단 : {}'.format(sab))
print('보너스 지급 대상자 명단 : {}'.format(sbonus))
slnsab= sl.intersection(sab)
print('야근 대상자 명단 : {}'.format(slnsab))
a = input('신입사원 명단 입력 : ').split()
a = set(a)
x = s1.intersection(a)
if x != set() :
      print('신입사원의 이름이 기존 사원의 이름과 중복')
s1_a = s1.union(a)
print('전체 사원 명단 : {}'.format(s1_a))


