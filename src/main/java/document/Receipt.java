package document;

import java.util.Scanner;

public class Receipt {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("What product are you buying?");
        String product = userInput.nextLine();
        System.out.println("How many " + product + "s " + "are you buying?");
        int qty = userInput.nextInt();
        System.out.println("How much is the " + product + "?");
        double price = userInput.nextDouble();
        double total = qty * price;

        System.out.print("Product" + "\t" +"Quantity" + "\t" + "Price" + "\t" + "Total" + "\n");
        System.out.print("------" + "\t" + "------" + "\t"+ "\t"+"-----" + "\t" + "-----" + "\n");
        System.out.printf(product +"\t" + "\t" + "%d" + "\t"+ "\t" +"\t" + "%.2f"  +"\t"+ "%.2f", qty,
                price, total);
    }
}
