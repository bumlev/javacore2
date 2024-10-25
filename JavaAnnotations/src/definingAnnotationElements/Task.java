package definingAnnotationElements;


// Define the main annotation with various types of elements
public @interface Task {

    // Primitive type element
    int id();

    // String type element
    String description();

    // Class type element
    Class<?> relatedClass();

    // Enumeration type element
    Priority priority() default Priority.MEDIUM;

    // Another annotation type element
    MetaInfo metaInfo();

    // Array type element
    String[] tags() default {};
}
