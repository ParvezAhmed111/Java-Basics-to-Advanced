package java_classes.i_singleton_class.b_lazy_initialization;

public class DBConnection {
    private static DBConnection dbConnectionObject;
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if(dbConnectionObject==null){
            dbConnectionObject= new DBConnection();
        }
        return dbConnectionObject;
    }
}
