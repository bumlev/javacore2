public class Person {

    String name;

    Person(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        // This method is called just before the object is garbage collected
        System.out.println("Garbage collected: " + this.name);
    }
}
