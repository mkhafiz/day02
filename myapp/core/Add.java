package myapp.core;

import java.io.Console;

public class Add {

    public static void main(String[] args) {

        Console cons = System.console();

        /*int input = 0;
        int result = 0;
        for (int i =0; i < args.length; i++) {
            System.out.printf("Enter a number. Blank to end: %s\n", args[(i)]);
            input = Integer.parseInt(args[i]);
            result += input;

        }
        System.out.printf("The sum is %d\n", result); */

        // Variales to hold the result
        int result = 0;
        int opnd = 0;
        String input = "";
        
        // Controls the loop
        boolean stop = false;
        
        while (!stop) {
            input = cons.readLine("Enter a number; return to end ");
            if (input.length() > 0) {
                opnd = Integer.parseInt(input);
                result += opnd;
            } else 
            stop = true;

        }
        System.out.printf("The result is %d\n", result);
    }
    
}
