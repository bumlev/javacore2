public class GarbageCollectionExample {

    public static void main(String[] args) {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        person1 = null; // Eligible for garbage collection
        System.gc(); // Requesting JVM to run garbage collection
    }
}
