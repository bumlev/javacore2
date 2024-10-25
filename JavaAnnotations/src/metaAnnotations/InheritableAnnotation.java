package metaAnnotations;


import java.lang.annotation.*;

@Inherited // -> This is a meta Annotation
@Retention(RetentionPolicy.RUNTIME) // -> This is a meta Annotation
@Target(ElementType.TYPE) // -> This is a meta Annotation
public @interface InheritableAnnotation {

    // Annotation elements
}
