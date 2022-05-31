package myapp.core;

public class Main {
    
    public static void main (String[] args) {

    System.out.println("Good morning\n");

    // Instantiate the array
    String[] todos = new String[5];

    // Assign some values to the array
    todos[0] = "learn Java";
    todos[1] = "go jogging";
    todos[2] = "watch a movie";

    System.out.printf("index: %d: value = %s\n", 0, todos[0]);        
    System.out.printf("index: %d: value = %s\n", 0, todos[1]);      
    System.out.printf("index: %d: value = %s\n", 0, todos[2]);
    System.out.printf("index: %d: value = %s\n", 0, todos[3]);

    // Every array has poperty called length
    System.out.printf("Size of todos: %d\n", todos.length);

    //size of args
    System.out.printf("Size of args: %d\n", todos.length);
    System.out.printf("index: %d: value = %s\n", 0, args[0]);        
    System.out.printf("index: %d: value = %s\n", 0, args[1]);      
    
    }
}


