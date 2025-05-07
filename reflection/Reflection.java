package reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

class Bird{
    private String color;
    boolean canFly;
}

public class Reflection {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException, NoSuchFieldException {
//        1. using ".forName()" method
        Class birdClass= Class.forName("reflection.Bird");

//        2. using ".cass" method
        Class birdClass2= Bird.class;

//        3. using "getClass()" method
        Bird birdObj = new Bird();
        Class birdClass3= birdObj.getClass();

        //HOW TO DO REFLECTION OF CLASSES
        Class eagleClass = Eagle.class;
        System.out.println(eagleClass.getName()); // reflection.Eagle
        System.out.println(Modifier.toString(eagleClass.getModifiers())); // public

        //REFLECTION OF METHODS
        Method[] publicMethodsOnly= eagleClass.getMethods(); //all public methods will be returned only
        for (Method method: publicMethodsOnly){
            System.out.println("********************");
            System.out.println("Method name: " + method.getName());
            System.out.println("Return Type: " + method.getReturnType());
            System.out.println("Class Name: "+ method.getDeclaringClass());
        }

        Method[] allMethods= eagleClass.getDeclaredMethods(); //all public and private methods will be returned
        for (Method method: allMethods){
            System.out.println("********************");
            System.out.println("Method name: " + method.getName());
        }

        // INVOKING METHODS USING REFLECTION
        Class eagleClass1= Class.forName("reflection.Eagle");
        Object eagleObject = eagleClass1.newInstance();
        Method flyMethod = eagleClass1.getMethod("flyWithParam", int.class, boolean.class, String.class);
        flyMethod.invoke(eagleObject, 1, true, "hello"); // fly intParam: 1 boolParam: true strParam: hello

        // GETTING FIELDS USING REFLECTION
        Field[] publicFields= eagleClass1.getFields(); //all public fields will be returned only
        Field[] allFields= eagleClass1.getFields(); //all public and private methods will be returned
        for (Field field: publicFields){
            System.out.println("********************");
            System.out.println("FieldName: "+ field.getName());
            System.out.println("Type: "+ field.getType());
            System.out.println("Modifier: " + Modifier.toString(field.getModifiers()));
        }


        // CHANGING FIELD VALUES
        // SETTING THE VALUE OF PUBLIC FIELD
        Class eagleClass2= Eagle.class;
        Eagle eagleObject2= new Eagle();
        Field field= eagleClass2.getDeclaredField("bread"); // get both public and privatefields with this
        field.set(eagleObject2, "eagleBrownBread");
        System.out.println(eagleObject2.bread); // eagleBrownBread

        // SETTING THE VALUE OF PUBLIC FIELD
        Field field1 = eagleClass2.getDeclaredField("canSwim");
        field1.setAccessible(true);
        field1.set(eagleObject2, true);
        if (field1.getBoolean(eagleObject2)){
            System.out.println("value is set to true");
        }



    }
}
