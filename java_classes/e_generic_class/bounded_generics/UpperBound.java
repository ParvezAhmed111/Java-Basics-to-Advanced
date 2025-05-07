package java_classes.e_generic_class.bounded_generics;
// Number can be-> Integer, Double, Float, BigInteger, BigDecimal ...
class Print<T extends Number>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class UpperBound {
    public static void main(String[] args) {
        Print<Integer> print= new Print<>();
//        Print<String> print1= new Print<String>(); // compilation error

    }
}
