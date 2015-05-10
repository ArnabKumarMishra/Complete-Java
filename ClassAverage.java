// ClassAverage.java
// Average score of a class of 10 people has to be calculated after knowing all the ten scores
import java.util.Scanner;

public class ClassAverage{

	// main starts the execution of Java applications
	public static void main(String[] args){

		// create Scanner object to get user inputs
		Scanner input = new Scanner(System.in);

		int total = 0;
		int counter = 1;
		int grade = 0;

		// Take the class grades
		while(counter <= 10){

			System.out.println("Please enter the student number "+counter+"'s grade: ");
			grade = input.nextInt();
			total = total + grade;
			counter++;

		}

		// Calculate the class average
		float average = (total / (counter - 1));
		System.out.println("The class average is: "+average);

	} // end of main

} // end of class ClassAverage