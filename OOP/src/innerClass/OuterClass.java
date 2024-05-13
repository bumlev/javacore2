package innerClass;

public class OuterClass {

    private final int outerData;

    public OuterClass(int data) {
        this.outerData = data;
    }

    public void displayOuterData() {
        System.out.println("Outer Data: " + outerData);
    }

    // Inner class
    public class InnerClass {
        public void displayInnerData() {
            System.out.println("Inner Data: " + outerData); // Inner class can access outer class data
        }
    }

}
