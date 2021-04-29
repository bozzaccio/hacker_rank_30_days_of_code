import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class Student extends Person{
	private int[] testScores;

    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    Student(String firstName, String lastName, int identification, int[] testScores){
        super(firstName, lastName, identification);
        this.testScores = testScores;
    }
    
    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    public char calculate(){
        
        int totalScore = 0;
        int numberOfScore = 0;
        
        for (numberOfScore = 0; numberOfScore < testScores.length; numberOfScore++){
            
            totalScore = totalScore + testScores[numberOfScore];
        }
        
        int gradeNumber = totalScore / numberOfScore;
        char gradeChar = 'n';
        
        if(gradeNumber >= 90 && gradeNumber <= 100)
            gradeChar = 'O';
        if(gradeNumber >= 80 && gradeNumber < 90)
            gradeChar = 'E';
        if(gradeNumber >= 70 && gradeNumber < 80)
            gradeChar = 'A';
        if(gradeNumber >= 55 && gradeNumber < 70)
            gradeChar = 'P';
        if(gradeNumber >= 40 && gradeNumber < 55)
            gradeChar = 'D';
        if(gradeNumber < 40)
            gradeChar = 'T';
        
        return gradeChar;
    }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		Student s = new Student(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}
