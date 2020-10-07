package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    /**
     * Constructor
     */
    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * Returns the 'total' member variable
     */
    public int getTotal () {
        return total;
    }

    /**
     * Adds parameter to 'total' member variable
     */
    public void add (int value) {
        total += value;
        history += (" + " + value);
    }

    /**
     * Subtracts parameter from 'total' member variable
     */
    public void subtract (int value) {
        total -= value;
        history += (" - " + value);
    }

    /**
     * Prints transaction history
     */
    public String toString () {
        return history;
    }

    /**
     * Resets AddingMachine instance
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}