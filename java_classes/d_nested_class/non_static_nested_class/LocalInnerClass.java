package java_classes.d_nested_class.non_static_nested_class;

class OuterClass1{
    int instanceVariable= 10;
    static int classVariable= 20;

    public void display(){
        int methodLocalVariable= 30;
        class LocalInnerClass{
            int localInnerVariable= 40;
            public void print(){
                System.out.println(instanceVariable + classVariable + methodLocalVariable + localInnerVariable);
            }
        }

        LocalInnerClass localInnerObj= new LocalInnerClass();
        localInnerObj.print();
    }
}

public class LocalInnerClass {
    public static void main(String[] args) {
        OuterClass1 outerClass= new OuterClass1();
        outerClass.display();
    }
}
