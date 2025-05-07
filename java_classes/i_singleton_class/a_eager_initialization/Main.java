package java_classes.i_singleton_class.a_eager_initialization;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection= DBConnection.getInstance();
    }
}
