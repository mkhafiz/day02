package myapp.core;

public class ForLoop {

    public static void main(String[] args) {

        /* Get acces to all the numbers
        int operand =0;
        for (int i =0; i < args.length; i++) {
            System.out.printf("%s\n", args[(i)]);
            operand = Integer.parseInt(args[i]);
            result = result + operand;

        }
        System.ot.printf("The result is %d\n", result);
        */

        int num =0;
        // for loop
        for (int idx = 0; idx < args.length; idx++) {
            System.out.printf("idx =%d\n", idx);
            num+= Integer.parseInt(args[idx]);
        }

    System.out.println("The sum is " + num);

    }
    
}
