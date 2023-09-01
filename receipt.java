import java.util.Scanner;

public class receipt {
    public static void main(String args[]) {
        boolean ordering = true;
        Scanner menuScan = new Scanner(System.in);
        Scanner keepOrderingScan = new Scanner(System.in);
        int order[][];
        int orderingCounter = 0;
        String keepOrdering;
        double price;

        System.out.println("Welcome to Liver's Rat Food Store!"); // welcome message

        while (ordering == true) {
            System.out.println("Please select an item from the following menu by typing the number of the item.");
            System.out.println("1. Rat Food Pellets   || $2.20");
            System.out.println("2. Rat Ice Cream      || $4.40");
            System.out.println("3. Rat-Fil-A Sandwich || $6.60");
            System.out.println("4. Rat Fries          || $8.80");
            System.out.println("5. Rat Tea            || $11.00");
            order[i][0] = menuScan.nextInt();

            System.out.println("How many would you like?");
            order[i][1] = menuScan.nextInt();
            
            System.out.println("Would you like to keep ordering? (y/n)");
            do {
                keepOrdering = keepOrderingScan.nextLine();
                if (keepOrdering == "y") {
                    ordering = true;
                } else if (keepOrdering == "n") {
                    ordering = false;
                }
            } while (keepOrdering != "y" && keepOrdering != "n");    

            orderingCounter++;
        } // phase 1: ordering

        for (int b = 0; b <= orderingCounter; b++) {
            price += order[b][1]*order[b][0]*(2.2);
        }

        System.out.println("Thanks for shopping with Liver's Rat Food! Your total price is $")
        
        
    }
}