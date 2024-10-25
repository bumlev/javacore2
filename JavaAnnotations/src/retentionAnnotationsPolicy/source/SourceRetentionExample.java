package retentionAnnotationsPolicy.source;

public class SourceRetentionExample {

    @ToDo("Refactor this method")
    public void someMethod() {
        System.out.println("This method needs refactoring.");
    }

    public static void main(String[] args){

        SourceRetentionExample sourceRetentionExample = new SourceRetentionExample();
        sourceRetentionExample.someMethod();
    }
}
