package _01_double._1_change_calculator;

import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain.
 */

public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickels = JOptionPane.showInputDialog(null, "How many nickels do you have?");
		// Convert their answer to an int.   Hint: Integer.parseInt()  
		int NickelsAsInt = Integer.parseInt(nickels);
		double Nickels = NickelsAsInt*0.05;
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog(null, "How many dimes do you have?");
		int DimesAsInt = Integer.parseInt(dimes);
		double Dimes = DimesAsInt*0.10;
		// Ask the user how many quarters they have, and convert their answer
		String quarters = JOptionPane.showInputDialog(null, "How many quarters do you have?");
		int QuartersAsInt = Integer.parseInt(quarters);
		double Quarters = QuartersAsInt*0.25;
		// Calculate how much money the user has.  Hint: Use a double variable 
		double money = Nickels+Dimes+Quarters;
		// Tell the user how much money they have in dollars and cents format (e.g. $6.75)
		JOptionPane.showMessageDialog(null, "you have $" +money+ "");
	}
}

