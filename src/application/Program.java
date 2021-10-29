package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		
		student.scoreOne = sc.nextDouble();
		
		if (student.scoreOne < 0) {
			System.out.println("It is not allowed to enter negative notes.");
			System.out.println("Enter a new score: ");
			student.scoreOne = sc.nextDouble();
		} else {
			if(student.scoreOne > 30) {
				System.out.println("The maximum score is 30 points.");
				System.out.println("Enter a new score: ");
				student.scoreOne = sc.nextDouble();
			}
		}
			
		student.scoreTwo = sc.nextDouble();
		
		if (student.scoreTwo < 0) {
			System.out.println("It is not allowed to enter negative notes.");
			System.out.println("Enter a new score: ");
			student.scoreTwo = sc.nextDouble();
		} else {
			if(student.scoreTwo > 50) {
				System.out.println("The maximum score is 35 points.");
				System.out.println("Enter a new score: ");
				student.scoreTwo = sc.nextDouble();
			}
		}
		
		student.scoreThree = sc.nextDouble();
		
		if (student.scoreThree < 0) {
			System.out.println("It is not allowed to enter negative notes.");
			System.out.println("Enter a new score: ");
			student.scoreThree = sc.nextDouble();
		} else {
			if(student.scoreThree > 35) {
				System.out.println("The maximum score is 35 points.");
				System.out.println("Enter a new score: ");
				student.scoreThree = sc.nextDouble();
			}
		}
		
		
		if (student.calculateTotalScore() > 60) {
			System.out.println("FINAL GRADE = " + student.calculateTotalScore());
			System.out.println("PASS");
		} else {
			System.out.println("FINAL GRADE = " + student.calculateTotalScore());
			System.out.println("FAILED");
			System.out.println("MISSING " + student.missingScore() + " POINTS");
		}
		
		sc.close();

	}

}
