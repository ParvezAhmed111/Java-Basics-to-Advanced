package java_classes.e_generic_class.inheritence_with_generic_class;

class Pair<K, V>{
    private K key;
    private V value;

    public void put(K key, V value){
        this.key= key;
        this.value= value;
    }
}
public class MoreThanOneGeneticTypeExample {
    public static void main(String[] args) {
        Pair<Integer, String> pair= new Pair<>();
        pair.put(1, "data");
    }
}
