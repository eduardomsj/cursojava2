package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Student student = new Student();

		student.name = sc.nextLine();
		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();

		double result = student.result(nota1, nota2, nota3);

		System.out.println("FINAL GRADE = " + result);

		if (result >= 60) {
			System.out.println("PASS");
		} else {
			System.out.println("FAILED");
			result = 60 - result;
			System.out.println("MISSING " + result + " POINTS");
		}

		sc.close();
	}

}
