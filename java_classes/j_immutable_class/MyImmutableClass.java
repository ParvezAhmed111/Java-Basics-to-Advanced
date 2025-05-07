package java_classes.j_immutable_class;

import java.util.ArrayList;
import java.util.List;

public final class MyImmutableClass {
    private final String name;
    private final List<Object> petNameList;

    MyImmutableClass(String name, List<Object> petNameList){
        this.name= name;
        this.petNameList= petNameList;
    }

    public String getName() {
        return name;
    }

    public List<Object> getPetNameList() {
        //this is required because making list final means you can not now point it to new list,
        // but still can add, delete values in it
        // so thats why we send the copy of it
        return new ArrayList<>(petNameList);
    }
}
