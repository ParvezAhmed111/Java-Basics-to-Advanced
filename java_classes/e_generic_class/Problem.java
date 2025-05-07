package java_classes.e_generic_class;
class Print {
    Object value;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
public class Problem {
    public static void main(String[] args) {
        Print print= new Print();
        print.setValue(1);
        Object printValue= print.getValue();
        if((int)printValue==1){ //Problem is -> here we have to do "type casting"
            //do something
        }
    }
}
