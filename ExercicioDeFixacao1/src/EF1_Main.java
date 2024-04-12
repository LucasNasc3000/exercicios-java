import java.util.Locale;
public class EF1_Main {

	public static void main(String[] args) {
		String product1 = "Computer";
		String product2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char gender = 'F';
		
		double price1 = 2100.0;
		double price2 = 650.50;
		double measure = 53.234567;
		
		Locale.setDefault(Locale.US);
		
		System.out.printf("Products:%n Computer, with price is $ %.2f%n Office desk, which price is $ %.2f%n%n Record: %d years old"
			+ ", code %d and gender: %s %n%n Measue with eight decimal places: %f%n"
			+ "Rouded (three decimal places): %.3f%n US decimal point: %.3f%n", price1, price2, age, code, gender, measure, measure, measure);
		
	}

}
