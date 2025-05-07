package java_classes.d_nested_class.static_nested_class;

public class OuterClass {
    int instanceVariable= 10;
    static int classVariable= 20;

    static class NestedClass{
        public void print(){
//            System.out.println(classVariable+ instanceVariable); //cannot add instanceVariable as its not static
            System.out.println(classVariable);
        }
    }

    private static class PrivateNestedClass{
        public  void print(){
            System.out.println(classVariable);
        }
    }

    public void display(){
        NestedClass nestedObj= new NestedClass();
        nestedObj.print();

        PrivateNestedClass privateNestedObj= new PrivateNestedClass();
        privateNestedObj.print();
    }
}
