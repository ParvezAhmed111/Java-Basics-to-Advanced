package reflection.reflection_of_constructor;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, InstantiationException, IllegalAccessException {
        Class eagleClass= Eagle.class;

        Constructor[] constructors= eagleClass.getDeclaredConstructors();

        for (Constructor constructor: constructors){
            System.out.println("Modifier: " + Modifier.toString(constructor.getModifiers())); // Modifier: private
            constructor.setAccessible(true);
            Eagle eagleObject = (Eagle) constructor.newInstance(); // can fly
            eagleObject.fly();
        }
    }
}
