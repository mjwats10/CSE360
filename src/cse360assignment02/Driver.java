package cse360assignment02;

public class Driver
{
    public static void main(String[] args)
    {
        AddingMachine machine1 = new AddingMachine();

        machine1.add(7);
        machine1.add(3);
        machine1.subtract(5);

        System.out.println("Transaction history: " + machine1.toString());
        int total = machine1.getTotal();
        System.out.println("Total = " + total);

        machine1.clear();

        System.out.println("Transaction history: " + machine1.toString());
        total = machine1.getTotal();
        System.out.println("Total = " + total);
    }
}
