package innerClass;

public class Main {

    public static void main(String[] args) {
        OuterClass outer = new OuterClass(10);
        outer.displayOuterData();

        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.displayInnerData();
    }
}
