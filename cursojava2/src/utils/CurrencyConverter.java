package utils;

public class CurrencyConverter {

	private static final double IOF = 1.06;
	
	public static double converter(double price, double quantity) {
		return (price * quantity) *  IOF;
	}
}
