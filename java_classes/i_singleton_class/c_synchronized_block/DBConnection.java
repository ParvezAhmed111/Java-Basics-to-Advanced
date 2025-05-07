package java_classes.i_singleton_class.c_synchronized_block;

public class DBConnection {
    private static DBConnection dbConnectionObject = new DBConnection();
    private DBConnection(){

    }
    synchronized public static DBConnection getInstance(){
        if(dbConnectionObject==null){
            dbConnectionObject= new DBConnection();
        }
        return dbConnectionObject;
    }
}
