package java_classes.j_immutable_class;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Object> petNameList= new ArrayList<>();
        petNameList.add("sj");
        petNameList.add("pj");
        MyImmutableClass obj= new MyImmutableClass("myName", petNameList);
        obj.getPetNameList().add("hello");
        System.out.println(obj.getPetNameList()); // [sj, pj]
    }
}
