package java_classes.e_generic_class.bounded_generics;
interface Interface1{

}
interface Interface2{

}
class ParentClass{

}

class A extends ParentClass implements Interface1, Interface2{

}

//MultiBound
//Lets see the similar functionality of above class A with multibound

//When using multiple bounds in a generic type:
//The first type must be a class (only one allowed),
//Followed by any number of interfaces.
class Print1<T extends ParentClass & Interface1 & Interface2>{ //first one should be a concrete class then any no of interfaces
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}

public class MultiBound {
    public static void main(String[] args) {
        A obj= new A();
        Print1<A> print= new Print1<>();

    }
}
