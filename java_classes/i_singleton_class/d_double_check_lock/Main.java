package java_classes.i_singleton_class.d_double_check_lock;

public class Main {
    public static void main(String[] args) {
        DBConnection dbConnection= DBConnection.getInstance();
    }
}
