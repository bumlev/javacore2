package Students;

public class Student {

    private int age;
    private final String name;

    public Student(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    @Deprecated
    public String getName(){
        return name;
    }
}
