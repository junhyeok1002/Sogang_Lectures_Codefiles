# countWords() 함수는 인수로 받은 문자열에서 단어들의 사용횟수 정보를 추출하는 함수
# 반환값은 단어 : 사용횟수가 저장되어 있는 사전
def countWords(String) :
    wordsDict = dict()
    L = list(String.split())
    for x in L:
        a = L.count(x)
        wordsDict[x]=a
    return wordsDict


    

  

# sortWords() 함수는 사전 정보를 (사용횟수, 단어) 튜플을 원소로 하는 리스트로 변환하여 내림차순으로 정렬하는 함수
# 입력 wDict: 사전(단어:사용회수)
# 출력 wList: 정렬된 리스트 [(사용회수,단어)]
def sortWords(wordsDict) :
    a = list(wordsDict.items())
    for x in range(len(a)):
        i,j= a[x]
        a[x] = j,i
    wList = sorted(a, reverse = True)
    return wList
    

   




        

######  main  #######

inData = """She was such a little girl, and she was only seven. She had lived a long-long time."""

# 위의 데이터에서 단어를 제외한 문자들을 다 제거할것 & 대소문자 구분 없음 & 단어 구분을 위해서 공백은 제거하면 안됨

x = list(inData)
L = []
for i in range(len(x)):
    if not x[i].isalpha():
        x[i]= ' '

        L.append(x[i])
inData = ''.join(L)
print(inData)



wordsDict = countWords(inData)   # 반환받은 wordsDict는 단어:사용횟수가 저장되어 있는 사전
print(wordsDict)

wList = sortWords(wordsDict)  # 사전의 정보를 (사용횟수, 단어) 튜플을 원소로 하는 리스트로 변환하여 내림차순으로 정렬하는 함수
print("\n\n***********************************************")
print("사용된 단어의 개수 : {:,}\n".format(len(wList)))
print("단어별 사용회수(내림차순)")
for freq, word in wList :
    print("{}\t{:,}".format(word,freq))
