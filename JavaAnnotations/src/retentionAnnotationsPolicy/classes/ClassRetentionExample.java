package retentionAnnotationsPolicy.classes;


// Usage example
class ClassRetentionExample {

    @Encrypted(encryptionMethod = "RSA")
    private String sensitiveData;

    public static void main(String[] args) {
        ClassRetentionExample example = new ClassRetentionExample();
        example.sensitiveData = "Secret";
        System.out.println("Sensitive data set.");
    }
}
