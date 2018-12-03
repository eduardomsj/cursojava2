package application;

import java.util.Locale;
import java.util.Scanner;

import utils.CurrencyConverter;

public class Application {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("What is the dollar price? ");
		double price = sc.nextDouble();
		System.out.print("How many dollar will be bought? ");
		double quantity = sc.nextDouble();
		System.out.println("Amount to be paid in reais = " + CurrencyConverter.converter(price, quantity));
		
		sc.close();
	}

}
