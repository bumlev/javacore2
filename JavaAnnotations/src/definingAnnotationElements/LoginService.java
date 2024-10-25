package definingAnnotationElements;


// Example usage of the annotation
@Task(
        id = 1,
        description = "Implement the login feature",
        relatedClass = LoginService.class,
        priority = Priority.HIGH,
        metaInfo = @MetaInfo(author = "John Doe", version = "1.0"),
        tags = {"backend", "auth"}
)
public class LoginService {
}
