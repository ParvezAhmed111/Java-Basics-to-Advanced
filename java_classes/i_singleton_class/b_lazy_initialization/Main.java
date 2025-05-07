package java_classes.i_singleton_class.b_lazy_initialization;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection= DBConnection.getInstance();
    }
}
