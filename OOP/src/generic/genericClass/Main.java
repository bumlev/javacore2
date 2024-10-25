package generic.genericClass;

public class Main {

    public static void main(String[] args) {

        Stack<Integer> integerStack = new Stack<Integer>();
        //integerStack.push(10);
        //integerStack.push(20);
        //integerStack.push(30);

        System.out.println("Size of the stack: " + integerStack.size());
        try {
            System.out.println("Top item of the stack: " + integerStack.peek());
        }catch(IllegalStateException e) {
            System.out.println(e.getMessage());
            System.exit(0);
        }


    }
}
