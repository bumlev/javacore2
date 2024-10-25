package retentionAnnotationsPolicy.source;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


// Annotation definition
@Retention(RetentionPolicy.SOURCE)
@Target(ElementType.METHOD)
public @interface ToDo {

    String value();
}

