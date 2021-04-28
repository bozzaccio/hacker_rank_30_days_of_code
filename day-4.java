import java.io.*;
import java.util.*;

public class Person {
    
    private int age;	
  
	public Person(int initialAge) {
        
        if(isAgeNotNegative(initialAge)){
            this.age = initialAge;               
        } else {
            print("Age is not valid, setting age to 0.");
            this.age = 0;
        }
    }

	public void amIOld() {
		if(this.age < 13){
		    print("You are young.");
		} else if(this.age >= 13 && this.age < 18){
		    print("Your are a teenager.");
		} else {
		    print("You are old.");
		}
	}

	public void yearPasses() {
	 	this.age = this.age + 1;
	}

    private boolean isAgeNotNegative(int age){
        return age > 0;
    }
    
    private void print(String message){
        System.out.println(message);
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
