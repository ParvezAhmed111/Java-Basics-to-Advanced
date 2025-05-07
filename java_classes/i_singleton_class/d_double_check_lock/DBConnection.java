package java_classes.i_singleton_class.d_double_check_lock;

public class DBConnection {
    private static volatile DBConnection dbConnectionObject = new DBConnection();
    private DBConnection(){

    }
    public static DBConnection getInstance(){
        if (dbConnectionObject==null){ // check 1
            synchronized (DBConnection.class){
                if(dbConnectionObject==null){ // check 2
                    dbConnectionObject= new DBConnection();
                }
            }
        }
        return dbConnectionObject;
    }
}
