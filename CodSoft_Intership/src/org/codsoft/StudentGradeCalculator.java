package org.codsoft;

import java.util.Scanner;

public class StudentGradeCalculator {
	public static void main(String[] args) {
		Scanner vaibhao = new Scanner(System.in);

		// Input the number of subjects
		System.out.print("Enter the number of subjects In MCA : \n");
		int numSubjects = vaibhao.nextInt();

		int totalMarks = 0;

		// Input the marks obtained in each subject and calculate total marks
		for (int i = 1; i <= numSubjects; i++) {
			System.out.print("Enter marks obtained in subject " + i + " (out of 100): ");
			int subjectMarks = vaibhao.nextInt();
			totalMarks += subjectMarks;
		}
		System.out.println("=============================================================");

		// Calculate average percentage
		double averagePercentage = (double) totalMarks / (numSubjects * 100) * 100;

		// Calculate the final grade
		String finalGrade = calculateGrade(averagePercentage);

		// Display results
		System.out.println("Total Marks: " + totalMarks);
		System.out.println("Average Percentage: " + String.format("%.2f%%", averagePercentage));
		System.out.println("Final Grade: " + finalGrade);
		System.out.println("_______________________________________________________________");

	}

	// Function to calculate the final grade based on average percentage
	public static String calculateGrade(double averagePercentage) {
		if (averagePercentage >= 90) {
			return "A+";
		} else if (averagePercentage >= 80) {
			return "A";
		} else if (averagePercentage >= 70) {
			return "A-";
		} else if (averagePercentage >= 60) {
			return "B+";
		} else if (averagePercentage >= 50) {
			return "B";
		} else if (averagePercentage >= 40) {
			return "C";
		} else {
			return "F";
		}
	}
}