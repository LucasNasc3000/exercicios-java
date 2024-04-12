package entities;

public class Student {
   public String name;
   public double notaTri1;
   public double notaTri2;
   public double notaTri3;
   public double notaFinal;
   
   public double calcularNotaFinal() {
	   return notaFinal = notaTri1 + notaTri2 + notaTri3;
   }
}
