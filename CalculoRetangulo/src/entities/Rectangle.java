package entities;

public class Rectangle {
	
   public double height;
   public double width;
   
   public double area() {
	   return height * width;
   }
   
   public double perimetro() {
	   return 2*(width + height);
   }
   
   public double diagonal() {
	   return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
   }
}
