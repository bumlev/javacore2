package retentionAnnotationsPolicy.runtime;

import java.lang.reflect.Method;

public class RuntimeRetentionExample {

    @LogExecutionTime(description = "Logs the execution time of the method")
    public void performTask() {
        long startTime = System.currentTimeMillis();

        // Simulate some task
        for (int i = 0; i < 1000000; i++);
        long endTime = System.currentTimeMillis();

        System.out.println("Task completed in " + (endTime - startTime) + " ms.");
    }


    public static void main(String[] args) throws Exception {
        RuntimeRetentionExample example = new RuntimeRetentionExample();
        example.performTask();

        // Accessing the annotation at runtime using reflection
        Method method = RuntimeRetentionExample.class.getMethod("performTask");
        if (method.isAnnotationPresent(LogExecutionTime.class)) {
            LogExecutionTime annotation = method.getAnnotation(LogExecutionTime.class);
            System.out.println("Annotation found: " + annotation.description());
        }
    }

}
