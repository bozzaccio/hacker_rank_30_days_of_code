class Difference:
    def __init__(self, a):
        self.__elements = a
        self.maximumDifference = 0
	# Add your code here
    def computeDifference(self):
        for n in self.__elements:
            for i in range(len(self.__elements)):
                localDiff = abs(n - self.__elements[i])

                if localDiff > self.maximumDifference:
                    self.maximumDifference = localDiff
            
# End of Difference class

_ = input()
a = [int(e) for e in input().split(' ')]

d = Difference(a)
d.computeDifference()

print(d.maximumDifference)
