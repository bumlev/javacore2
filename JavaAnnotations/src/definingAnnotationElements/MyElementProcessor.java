package definingAnnotationElements;

import javax.annotation.processing.AbstractProcessor;
import javax.annotation.processing.RoundEnvironment;
import javax.lang.model.element.Element;
import javax.lang.model.element.TypeElement;
import java.util.Arrays;
import java.util.Set;

public class MyElementProcessor extends AbstractProcessor {


    @Override
    public boolean process(Set<? extends TypeElement> annotations , RoundEnvironment roundEnv){


        for (Element element : roundEnv.getElementsAnnotatedWith(Task.class)){

            Task taskAnnotation = element.getAnnotation(Task.class);

            int id = taskAnnotation.id();
            String description = taskAnnotation.description();
            Class<?> relatedClass = taskAnnotation.relatedClass();
            Priority priority = taskAnnotation.priority();
            MetaInfo info = taskAnnotation.metaInfo();
            String[] tags = taskAnnotation.tags();

            System.out.println("Element: " + element.getSimpleName());
            System.out.println("id value: " + id);
            System.out.println("Description value: " + description);
            System.out.println("RelatedClass value: " + relatedClass);
            System.out.println("priority value: " + priority);
            System.out.println("info value: " + info);
            System.out.println("tags value: " + Arrays.toString(tags));
        }
        return false;
    }
}
