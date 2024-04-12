import java.util.Locale;
import java.util.Scanner;

public class ExerciciosArrays {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantos números você vai digitar? ");
		int n = sc.nextInt();
		
		int[] vectNumeros = new int[n];
		
		
		for(int i=0; i<vectNumeros.length; i++) {
			vectNumeros[i] = sc.nextInt();
		}
		
		System.out.println("negativos: ");
		
		for(int i=0; i<vectNumeros.length; i++) {
			if(vectNumeros[i]<0) {;
			  System.out.println(vectNumeros[i]);
			}
		}
		
		sc.close();
		
		
	}

}
