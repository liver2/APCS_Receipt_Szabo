import java.util.Scanner;

public class receipt {
    public static void main(String args[]) {
        boolean ordering = true;
        Scanner menuScan = new Scanner(System.in);

        System.out.println("Welcome to Liver's Rat Food Store!"); // welcome message
        while (ordering == true) {
            System.out.println("Please select an item from the following menu by typing the number or the name of the item.");
            System.out.println("1. Rat Food Pellets   || $2.00");
            System.out.println("2. Rat Ice Cream      || $4.50");
            System.out.println("3. Rat-Fil-A Sandwich || $6.00");
            System.out.println("4. Rat Fries          || $3.00");
            System.out.println("5. Rat Tea            || $1.50");
        }
        
        
    }
}