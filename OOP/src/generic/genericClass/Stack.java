package generic.genericClass;

import java.util.ArrayList;

public class Stack<T> {

    private ArrayList<T> stack;

    public Stack() {
        this.stack = new ArrayList<T>();
    }

    public void push(T item) {
        stack.add(item);
    }

    public T pop() {

        if (isEmpty())
            throw new IllegalStateException("Stack is empty");

        return stack.get(stack.size() - 1);
    }

    public T peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty");
        }
        return stack.get(stack.size() - 1);
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public int size() {
        return stack.size();
    }

}
