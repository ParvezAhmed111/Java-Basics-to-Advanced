package java_classes.e_generic_class.inheritence_with_generic_class;

class Print1 <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

class ColorPrint1<T> extends Print<T>{ // we can directly pass T in case of generic sub class

}
public class GenericSubClass {
    public static void main(String[] args) {
        ColorPrint1<String> colorPrint= new ColorPrint1<>(); //here we have to pass the type at the time of creation of object
        colorPrint.setValue("Color Print");
    }
}
