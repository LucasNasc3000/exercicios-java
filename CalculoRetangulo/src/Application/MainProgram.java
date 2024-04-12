package Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class MainProgram {

	public static void main(String[] args) {
		
	   Locale.setDefault(Locale.US);
       Scanner sc = new Scanner(System.in);
       
       Rectangle retangulo = new Rectangle();
       System.out.println("Enter rectangle width and height: ");
       retangulo.width = sc.nextDouble();
       retangulo.height = sc.nextDouble();
       
       System.out.printf("Area = %.2f%nPerimeter = %.2f%nDiagonal = %.2f%n", retangulo.area(), retangulo.perimetro(), retangulo.diagonal());
       
       sc.close();
	}

}