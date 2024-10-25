package workingAnnotationElements;

public class AnnotationExample {

    public static void main(String[] args) {

        // Retrieve the annotation applied to MyClass
        MyCustomAnnotation annotation = MyClass.class.getAnnotation(MyCustomAnnotation.class);

        // Access and print the annotation elements
        if (annotation != null) {
            System.out.println("Value: " + annotation.value());
            System.out.println("Count: " + annotation.count());
        }

        // Create an instance of MyClass and call its method
        MyClass obj = new MyClass();
        obj.display();
    }
}
