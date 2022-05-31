package myapp.core;

import java.util.List;
import java.util.ArrayList;
import java.lang.String;
import java.io.Console;

public class Workshop {

    public static void main(String[] args) {

        Console cons = System.console();

        System.out.println("Welcome to your shopping cart");

        // Variales to hold the result
        String input = "";

        //creation  and initialization of list
        List<String> list=new ArrayList<>();
        
        boolean stop = false;

        while (!stop) {
            input = cons.readLine("List/ add/ delete? ");

        if (input.equals("list"))  {
            for (int i=0; i < list.size(); i++) {
                System.out.printf("%d = %d\n", i, list.get(i));
            }        
            //System.out.println("Your cart is empty. \n");

        }else if (input.contains("add")) {
            list.add(input.substring(4));
            System.out.printf( "%s added to cart\n", input.substring(4));

        //}else if (input.contains("delete")) {

        }else if (input.length() <= 0) {
            stop = true;
            System.out.println("\nOK. Thank you.");
        }
    }
    // split
}
}