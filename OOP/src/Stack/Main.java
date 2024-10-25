package Stack;

import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        // Pushing new items onto the stack
        stack.push("Java");
        stack.push("Python");
        stack.push("C++");

        System.out.println("Stack: " + stack);

        // Popping the top item from the stack
        String topLanguage = stack.pop();
        System.out.println("Popped: " + topLanguage);
        System.out.println("Current Stack: " + stack);

        // Peeking at the top item without removing it
        String nextLanguage = stack.peek();
        System.out.println("Next up: " + nextLanguage);

        System.out.println("Stack after peek: " + stack);
    }
}
