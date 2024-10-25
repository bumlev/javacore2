package classforname;

import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args){

        try {
            Class<?> dynamicClass = Class.forName("classforname.DynamicClass");

            // Instantiate an object of the dynamically loaded class
            Object dynamicObject = dynamicClass.newInstance();

            // Invoke a method on the dynamically loaded object
            dynamicClass.getMethod("getName")
                        .invoke(dynamicObject);

            // Get the string value from DynamicClass's method that returns a string
            String name = (String) dynamicClass.getMethod("getName")
                    .invoke(dynamicObject);

            System.out.println("The name is: " + name);

        } catch (ClassNotFoundException | InstantiationException |
                 IllegalAccessException | NoSuchMethodException |
                 InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
