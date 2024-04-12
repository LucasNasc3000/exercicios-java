package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class mainClass {

	public static void main(String[] args) {
     Locale.setDefault(Locale.US);
     
	 Scanner sc = new Scanner(System.in);
	 Student student = new Student();
	 
	 double resto = 60;
	 
	 student.name = sc.nextLine();
	 student.notaTri1 = sc.nextDouble();
	 student.notaTri2 = sc.nextDouble();
	 student.notaTri3 = sc.nextDouble();
	 student.calcularNotaFinal();
	 
	 if(student.notaFinal < 60) {
		 resto -= student.notaFinal;
		 System.out.printf("Final grade = %.2f%nFAILED%nMISSING %.2f POINTS", student.notaFinal, resto);
	 }
	 
	 if(student.notaFinal >= 60) {
		 System.out.printf("Final grade = %.2f%nPASS", student.notaFinal);
	 }
	 
	 sc.close();
     
	}

}
