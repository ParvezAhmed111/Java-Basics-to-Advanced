package java_classes.e_generic_class.generic_method;

public class GenericMethod {
    public <K, V> void  printValue(Pair<K, V> pair1, Pair<K, V> pair2){
        if(pair1.getKey().equals(pair2.getKey())){
            //do something
        }
    }
}
