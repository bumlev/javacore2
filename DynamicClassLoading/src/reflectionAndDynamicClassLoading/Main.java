package reflectionAndDynamicClassLoading;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args){

        try{
            // Load the class dynamically at runtime
            Class<?> dynamicClass = Class.forName("classforname.DynamicClass");

            // Instantiate an object of the dynamically loaded class
            Object dynamicObject = dynamicClass.newInstance();

            // Get the method of the class (sayHello in this case)
            Method method = dynamicClass.getMethod("sayHello");
            // Invoke the method on the instance
            method.invoke(dynamicObject);

            /*String name = (String) dynamicClass.getMethod("getName")
                    .invoke(dynamicObject);
            System.out.println("The name is: " +name);*/

        }catch (ClassNotFoundException | InstantiationException |
                IllegalAccessException | NoSuchMethodException |
                InvocationTargetException e){
            e.printStackTrace();
        }
    }
}
