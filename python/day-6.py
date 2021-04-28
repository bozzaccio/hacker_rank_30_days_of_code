# Enter your code here. Read input from STDIN. Print output to STDOUT
wordCounter = int(input())

for i in range(wordCounter):
    word = input()
    result = ""
    oddString = ""
    evenString = ""
    
    chars = list(word)
    
    i = 0
    for c in chars:
        
        if(i == 0 or i % 2 == 0):
            evenString = evenString + c
        else:
            oddString = oddString + c
        i = i +1
            
    result = evenString + " " + oddString
    print(result)
