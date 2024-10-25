package workingAnnotationElements;


import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define a custom annotation with two elements: value and count
@Retention(RetentionPolicy.RUNTIME)  // Make the annotation available at runtime
@Target(ElementType.TYPE)
public @interface MyCustomAnnotation {

    String value(); // annotation element 'value'
    int count();    // annotation element 'count'
}
