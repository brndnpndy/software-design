package pandaybr;

import java.util.Scanner;

/**
 * An inventory management program used to store item id, name, quantity,
 * re-order points, and price. Uses Scanners for user input, as well as methods
 * with some try catch to verify information.
 * 
 * @author pandaybr
 */

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Inventory invent = new Inventory();

		/**
		 * Method used to validate item id is in the format ABC-1234.
		 */
		int x = 0;
		while (x != 8) {
			x = 0;
			System.out.print("Enter Item ID: ");
			String itemId = input.nextLine();
			int idLength = itemId.length();
			if (idLength == 8 && itemId.charAt(3) == ('-')) {
				x += 1;
				for (int i = 0; i < 3; i++) {
					char test = itemId.charAt(i);
					if (Character.isLetter(test) == true)
						x += 1;
				}
				for (int e = 4; e < 8; e++) {
					char test = itemId.charAt(e);
					if (Character.isDigit(test) == true)
						x += 1;
				}
			}
			if (x == 8) {
				invent.setId(itemId);
				break;
			} else {
				System.out.println("Error: Item ID must be format ABC-1234.");
			}

		}

		/**
		 * Method to verify name is not empty string or null.
		 */
		boolean nameTrue = false;
		while (!nameTrue) {
			System.out.print("Enter Item Name: ");
			String itemName = input.nextLine();
			if (itemName == null || itemName.trim().length() == 0) {
				System.out.println("Error: you must enter an item name.");
				continue;
			} else {
				invent.setName(itemName);
				nameTrue = true;
			}
		}

		/**
		 * Quantity on hand, uses try / catch.
		 * 
		 * @throws IllegalArgumentException if the quantity on hand is invalid.
		 */
		boolean qohTrue = false;
		while (!qohTrue) {
			System.out.print("Qty On Hand: ");
			int itemQoh = input.nextInt();
			try {
				if (itemQoh >= 0) {
					invent.setQoh(itemQoh);
					qohTrue = true;
				} else {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Error: QOH must be greater than 0");
			}
		}

		/**
		 * sets Re-orderpoint.
		 * 
		 * @throws IllegalArgumentException if the ROP is invalid.
		 */
		boolean ropTrue = false;
		while (!ropTrue) {
			System.out.print("Re-Order Point: ");
			int itemRop = input.nextInt();
			try {
				if (itemRop >= 0) {
					invent.setRop(itemRop);
					ropTrue = true;
				} else {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				System.out.println("Error: ROP must be greater than 0");
			}
		}

		/**
		 * Validate price as double using try catch.
		 * 
		 * @throws IllegalArgumentException if the price entered is invalid.
		 */
		boolean priceTrue = false;
		while (!priceTrue) {
			System.out.print("Selling Price: ");
			double itemPrice = input.nextDouble();
			try {
				if (itemPrice >= 0) {
					invent.setSellPrice(itemPrice);
					priceTrue = true;
				} else {
					throw new IllegalArgumentException();
				}
			} catch (IllegalArgumentException e) {
				System.out
						.println("Error: Selling price must be greater than 0");
			}
		}

		/**
		 * Calls toString method that has been formatted.
		 */
		System.out.println(invent.toString());

	}

}
