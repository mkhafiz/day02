package myapp.core;

import java.io.Console;
import java.util.LinkedList;
import java.util.List;

public class Wsol {

public static void main(String[] args) {

    List<String> cart = new LinkedList<>();
    Console cons = System.console();
    boolean stop = false;
    String input;
    int del;

    //add test data
    cart.add("apple");
    cart.add("orange");    
    cart.add("pear");
    cart.add("grapes");
    //main loop

while (!stop) {
    input = cons.readLine("> ");
    //add ..
    // list
    //del <idx>
    //end
    String[] terms = input.split(" ");

    switch (terms[0]) {
        case "add":
            break;

        case "list":
            if (cart.size() > 0) {
                for (int i = 0; i < cart.size(); i++) {
                    System.out.printf("%d, %s\n", (i + 1), cart.get(i));
                }
            } else {
                System.out.println("Your cart is empty");
            }
            break;

        case "del":
            del = Integer.parseInt(terms[1]) - 1;
            if(del < cart.size()) {
                cart.remove(del);
                System.out.println("Deleted");
            } else {
                System.err.println("No such item");
            }
            break;

        case "end":
        if (input.length() <= 0) {
            stop = true;
            System.out.println("\nOK. Thank you.");
            break;
    }

    System.out.printf("READ: %s\n", input);
    
}
}   
}
}
