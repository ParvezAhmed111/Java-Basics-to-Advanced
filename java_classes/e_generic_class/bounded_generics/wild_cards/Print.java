package java_classes.e_generic_class.bounded_generics.wild_cards;

import java.util.List;

public class Print {

    //wild card method
    public void computeList(List<? extends Number> source, List<? extends Number> destination){

    }

    //generic type method
    public <T extends Number> void computeList1(List<T> source, List<T> destination){

    }
}
