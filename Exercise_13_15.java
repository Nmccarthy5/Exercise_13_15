package ch_13.exercise13_15;

import java.math.BigInteger;
import java.util.Scanner;
public class Exercise_13_15 {
 public static void main(String[] args) {
    try (// Prompt the user to enter two Rational numbers
	Scanner input = new Scanner(System.in)) {
		System.out.print("Enter rational number1 with numerator and denominator seperated by a space: ");
		String n1 = input.next();
		String d1 = input.next();

		System.out.print("Enter rational number2 with numerator and denominator seperated by a space: ");
		String n2 = input.next();
		String d2 = input.next();

		ch_13.exercise13_15.Rational r1 = new ch_13.exercise13_15.Rational (new BigInteger(n1), new BigInteger(d1));
		ch_13.exercise13_15.Rational r2 = new ch_13.exercise13_15.Rational (new BigInteger(n2), new BigInteger(d2));

		// Display results
		System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
		System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
		System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
		System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
		System.out.println(r2 + " is " + r2.doubleValue());
	}
  }
}