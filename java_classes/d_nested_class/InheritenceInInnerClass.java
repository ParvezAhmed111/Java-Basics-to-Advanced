package java_classes.d_nested_class;

class OuterClass3 {
    int instanceVariable= 10;
    static int classVariable= 20;
    class InnerClass1{
        int innerClass1= 30;
    }
    class InnerClass2 extends InnerClass1{
        int innerClass2= 40;
        public void print(){
            System.out.println(instanceVariable + classVariable + innerClass1 + innerClass2);
        }
    }
}


public class InheritenceInInnerClass {
    public static void main(String[] args) {
        OuterClass3 outerClassObj= new OuterClass3();
        OuterClass3.InnerClass2 innerClassObj= outerClassObj.new InnerClass2();
        innerClassObj.print();
    }
}
