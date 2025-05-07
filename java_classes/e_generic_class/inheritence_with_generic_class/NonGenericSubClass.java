package java_classes.e_generic_class.inheritence_with_generic_class;

class Print <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class ColorPrint extends Print<String>{ // as its non generic sub class sowe have to pass the type of "T" here. (String in this case)

}
public class NonGenericSubClass {
    public static void main(String[] args) {
        ColorPrint colorPrint= new ColorPrint();
        colorPrint.setValue("Color Print");

    }
}
