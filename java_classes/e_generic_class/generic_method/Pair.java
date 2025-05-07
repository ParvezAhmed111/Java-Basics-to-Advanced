package java_classes.e_generic_class.generic_method;

public class Pair<K, V> {
    private K key;
    private V value;

    public void put(K key, V value){
        this.key= key;
        this.value= value;
    }

    //getter and setters
    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
