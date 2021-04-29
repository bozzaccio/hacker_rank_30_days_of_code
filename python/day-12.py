class Person:
	def __init__(self, firstName, lastName, idNumber):
		self.firstName = firstName
		self.lastName = lastName
		self.idNumber = idNumber
	def printPerson(self):
		print("Name:", self.lastName + ",", self.firstName)
		print("ID:", self.idNumber)

class Student(Person):
    #   Class Constructor
    #   
    #   Parameters:
    #   firstName - A string denoting the Person's first name.
    #   lastName - A string denoting the Person's last name.
    #   id - An integer denoting the Person's ID number.
    #   scores - An array of integers denoting the Person's test scores.
    #
    def __init__(self, firstName, lastName, idNumber, scores):
        super().__init__(firstName, lastName, idNumber)
        self.scores = scores

    #   Function Name: calculate
    #   Return: A character denoting the grade.
    #
    def calculate(self):
        total_score = 0
        number_of_score = 0
        grade_number = 0
        grade_char = ''
        
        for score in scores:
            number_of_score = number_of_score + 1
            total_score = total_score + score
            
        grade_number = total_score / number_of_score 
        
        if(grade_number >= 90 and grade_number <= 100):
            grade_char = 'O'
        if(grade_number >= 80 and grade_number < 90):
            grade_char = 'E'
        if(grade_number >= 70 and grade_number < 80):
            grade_char = 'A'
        if(grade_number >= 55 and grade_number < 70):
            grade_char = 'P'
        if(grade_number >= 40 and grade_number < 55):
            grade_char = 'D'
        if(grade_number < 40):
            grade_char = 'T'
    
        return grade_char;
            
        
        

line = input().split()
firstName = line[0]
lastName = line[1]
idNum = line[2]
numScores = int(input()) # not needed for Python
scores = list( map(int, input().split()) )
s = Student(firstName, lastName, idNum, scores)
s.printPerson()
print("Grade:", s.calculate())
