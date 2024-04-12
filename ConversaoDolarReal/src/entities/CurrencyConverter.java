package entities;

public class CurrencyConverter {
   public static double dollarPrice;
   public static double dollars;
   public static double iofTax = 0.06;
   public static double auxVar;
   
   public static double moneyConverter() {
	  dollars *= dollarPrice;
	  auxVar = dollars * iofTax;
	  return dollars + auxVar;
   }
}
