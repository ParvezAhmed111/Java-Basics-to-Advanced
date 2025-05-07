package java_classes.c_super_and_sub_class;

import java_classes.a_concrete_class.Person;
import java_classes.b_abstract_class.Audi;

public class ObjectTest {
    public static void main(String[] args) {
        ObjectTest obj= new ObjectTest();
        Object obj1= new Person(10);
        Object obj2= new Audi(10);
        System.out.println(obj.getClass());
        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
    }
}



//class java_classes.c_super_and_sub_class.ObjectTest
//class java_classes.a_concrete_class.Person
//class java_classes.b_abstract_class.Audi
