package reapeatingAnnotations;

import java.lang.annotation.Repeatable;

@Repeatable(MyRepeatedAnnotations.class)
public @interface MyRepeatedAnnotation {
    String value();
}
