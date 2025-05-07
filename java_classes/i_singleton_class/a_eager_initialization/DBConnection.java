package java_classes.i_singleton_class.a_eager_initialization;

public class DBConnection {
    private static DBConnection dbConnectionObject = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        return dbConnectionObject;
    }
}
