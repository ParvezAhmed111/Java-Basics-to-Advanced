package java_classes.d_nested_class.non_static_nested_class;

class OuterClass {
    int instanceVariable= 10;
    static int classVariable= 20;
    class InnerClass{
        public void print(){
            System.out.println(instanceVariable + classVariable);
        }
    }
}

public class MemberInnerClass{
    public static void main(String[] args) {
        OuterClass outerClassObj= new OuterClass();
        OuterClass.InnerClass innerClassObj= outerClassObj.new InnerClass();
        innerClassObj.print();
    }

}
