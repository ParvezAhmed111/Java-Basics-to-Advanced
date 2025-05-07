package java_classes.e_generic_class;

class Print1 <T>{
    T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
public class Solution {
    public static void main(String[] args) {
        Print1<Integer> print= new Print1<>();
        print.setValue(1);
        Integer printValue= print.getValue();
        if(printValue==1){ //TypeCasting issue SOLVED here
            //do something
        }
    }
}

/*
Generic Type (in above example <T>) can be any non-primitive object
*/
