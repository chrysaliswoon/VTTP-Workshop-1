package workshop.core;

import java.io.Console;
import java.util.ArrayList; // import the ArrayList class
import java.util.LinkedList;

public class ShoppingCart {
    public static void main(String[] args) {
        // ? Get the console
        Console cons = System.console();

        // ? Create a list
        LinkedList<String> cart = new LinkedList<String>();
        boolean stop = false;
        String input;
        int delIndex;

        // ? Add Test Data
        cart.add("apple");
        cart.add("pear");
        cart.add("lemon");

        // ? Main Loop
        while (!stop) {
            input = cons.readLine("> ");
            String[] terms = input.split(" "); // ? Split returns an array of string
            String command = terms[0];

            switch (command) {
                case "add":
                    for (int i = 1; i < terms.length; i++) {
                        boolean found = false;
                        for (int j = 0; j < cart.size(); j++) {
                            if (terms[i].equals(cart.get(j))) {
                                found = true;
                                System.out.printf("%s exists in the cart\n", terms[i]);
                                break;
                            }
                        }
                        if (!found) {
                            cart.add(terms[i]);
                            System.out.printf("Added %s to cart\n", terms[i]);
                        }
                    }
                    break;
                // if (!cart.contains(terms)) {
                //     cart.add(terms);
                // } else {
                //     System.err.println("You have this in your cart");
                // }
                //     break;

                case "list":
                    if (cart.size() > 0) {
                        for (int i = 0; i < cart.size(); i++) {
                            System.out.printf("%d. %s\n", (i + 1), cart.get(i));
                        }
                    } else {
                        System.out.println("Your cart is empty");
                    }
                    break;

                case "del":
                    if (terms.length < 2) {
                        System.err.println("Please provide an index to delete");
                    } else {
                        delIndex = Integer.parseInt(terms[1]) - 1;
                        if (delIndex < cart.size())
                            cart.remove(delIndex);
                        System.out.printf("Deleted");
                    }
                    break;

                case "end":
                stop = true;
                    break;

                default:
            }
            // System.out.printf("READ: %s\n", input);

        }

        // // // ? Convert String into Integer
        // // // Integer itemIndex = Integer.parseInt(deleteItem);

        // // // ? Create an ArrayList object
        // // ArrayList<String> ShoppingCart = new ArrayList<String>();

        // // // ? Conditional Statements
        // // boolean useCart = true;
        // // System.out.println("Welcome to your shopping cart");

        // // while (useCart) {
        // // String userInput = cons.readLine().trim().toLowerCase();

        // // if (userInput.contains("list") && ShoppingCart.isEmpty()) {
        // // System.out.println("Your cart is empty.");
        // // } else if (userInput.equals("list")) {
        // // for (int i = 1; i < ShoppingCart.size(); i++) {
        // // System.out.printf("%d = %s \n", i, ShoppingCart.get(i));
        // // }
        // // } else if (userInput.contains("list")) {
        // // System.out.printf("You have %s in your cart \n", userInput);
        // // } else if (userInput.contains("delete")) {
        // // Integer cartIndex = Integer.parseInt(userInput);
        // // System.out.printf("%s is added to cart \n", userInput);
        // // } else {
        // // System.out.printf("End");
        // // }
        // // }
        // // System.out.println("Thank you for using the shopping cart!");

        // // if (userInput.equals("list") && (list == true)) {
        // // System.out.println("Your cart is empty \n");

        // // } else if (userInput.equals("list") && list == false) {
        // // for (int i = 0; i < ShoppingCart.size(); i++)
        // // System.out.printf("%d: %s \n", i, ShoppingCart.get(i));

        // // } else if (userInput.equals("add") && !ShoppingCart.contains(addItem)) {
        // // ShoppingCart.add(addItem);
        // // System.out.printf("%s is added to cart \n", addItem);

        // // } else if (userInput.equals("add") && ShoppingCart.contains(addItem)) {
        // // System.out.printf("You have %s in your cart \n", addItem);

        // // } else if (userInput.equals("delete") && ShoppingCart.contains(itemIndex))
        // {
        // // ShoppingCart.remove(itemIndex);
        // // System.out.printf("%s removed from cart \n", itemIndex);

        // // } else {
        // // System.out.printf("Incorrect item index");
        // // }
    }

}