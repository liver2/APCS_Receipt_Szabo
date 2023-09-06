import java.util.Scanner;

public class receipt {
    public static void main(String args[]) {
        System.out.println("Welcome to Liver's Rat Food Store!"); // welcome message

        int[][] order = new int[2][3];
        boolean ordering = true;
        Scanner menuScan = new Scanner(System.in);
        Scanner menuScan2 = new Scanner(System.in);
        int orderingCounter = 0;

        while (ordering == true && orderingCounter < 3) {
            do {
                System.out.println("Please select an item from the following menu by typing the number of the item (3 items).");
                System.out.println("1. Rat Food Pellets   || $2.20");
                System.out.println("2. Rat Ice Cream      || $4.40");
                System.out.println("3. Rat-Fil-A Sandwich || $6.60");
                System.out.println("4. Rat Fries          || $8.80");
                System.out.println("5. Rat Tea            || $11.00");
                order[0][orderingCounter] = menuScan.nextInt();
            } while (order[0][orderingCounter] < 0 && order[0][orderingCounter] > 6);
 
            do {
                System.out.println("How many would you like? (Max 9)");
                order[1][orderingCounter] = menuScan2.nextInt();
            } while (order[1][orderingCounter] < 0 && order[1][orderingCounter] > 10);

            orderingCounter++;
        } // phase 1: ordering

        double price = 0;

        for (int i = 0; i < orderingCounter; i++) {
            price += order[1][i]*order[0][i]*(2.2);
        }

        System.out.println("Thanks for shopping with Liver's Rat Food! Your total price is $" + String.format("%.2f", price) + "."); //phase 2: price charge
        System.out.println("");
        System.out.println("Here's your receipt!");
        System.out.println("");

        System.out.println("****************************************");
        
        for (int j = 0; j < orderingCounter; j++) {
            if (order[0][j] == 1) {
                System.out.println("Rat Food Pellets x " + order[1][j] + " || $" + order[1][j]*order[0][j]*(2.2) + "0");
            } else if (order[0][j] == 2) {
                System.out.println("Rat Ice Cream x " + order[1][j] + " || $" + order[1][j]*order[0][j]*(2.2) + "0");
            } else if (order[0][j] == 3) {
                System.out.println("Rat-Fil-A Sandwich x " + order[1][j] + " || $" + order[1][j]*order[0][j]*(2.2) + "0");
            } else if (order[0][j] == 4) {
                System.out.println("Rat Fries x " + order[1][j] + " || $" + order[1][j]*order[0][j]*(2.2) + "0");
            } else if (order[0][j] == 5) {
                System.out.println("Rat Tea x " + order[1][j] + " || $" + order[1][j]*order[0][j]*(2.2) + "0");
            }
        }
        System.out.println("");
        System.out.println("----------------------------------------");
        System.out.println("");
        System.out.println("Total Price: $" + String.format("%.2f", price) + "");
        System.out.println("****************************************");
        
    }
}