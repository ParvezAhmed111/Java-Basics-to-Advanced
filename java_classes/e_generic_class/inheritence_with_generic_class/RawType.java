package java_classes.e_generic_class.inheritence_with_generic_class;

class Print3 <T> {
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class RawType {
    public static void main(String[] args) {
        Print3<String> parameterizedTypePrintObj= new Print3<>();
        parameterizedTypePrintObj.setValue("data");

        //raw type
        Print3 rawTypePrintObj= new Print3();
        rawTypePrintObj.setValue(1);
        rawTypePrintObj.setValue("data");
    }
}
