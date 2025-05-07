package java_classes.d_nested_class.non_static_nested_class;

abstract class Car{
    public abstract void pressBreak();
}
public class AnnonymousInnerClass {
    public static void main(String[] args) {
        Car audiCarObj= new Car() {
            @Override
            public void pressBreak() {
                System.out.println("Audi specific break changes");
            }
        };
        audiCarObj.pressBreak();
    }
}


/*
2 things happened behind the scene
- Sub class is created, name decided by the compiler
- Creates an object of subclass and assign its reference to object "audiCarObj"

Similarly for interface also, it works in the same way...
*/