package cse360assign2;

/**
 * Class creates an object that can add and subtract from a number.
 */
public class AddingMachine {

	/**
	 * int that keeps track of the total in the AddingMachine
	 */
	private int total;

	/**
	 * String that keeps track of the history of adding and subtracting
	 */
	private String history;

	/**
	 * Constructor that has no parameters and creates an object with the total at 0 and initializes the history string;
	 */
	public AddingMachine () {
		total = 0;  // not needed - included for clarity
		history = "0";
	}

	/**
	 * Returns the value of the total.
	 *
	 * @return total
	 */
	public int getTotal () {
		return total;
	}

	/**
	 * Adds a value to the total and updates history
	 *
	 * @param value
	 */
	public void add (int value) {
		total += value;
		history += " + " + value;
	}

	/**
	 * Subtracts a value to the total and updates history
	 *
	 * @param value
	 */
	public void subtract (int value) {
		total -= value;
		history += " - " + value;
	}

	/**
	 * Returns the process through which the AddingMachine got its value.
	 *
	 * @return
	 */
	public String toString () {
		return history;
	}

	/**
	 * Clears the value of the total and the history
	 */
	public void clear() {
		total = 0;
		history = "0";
	}
}