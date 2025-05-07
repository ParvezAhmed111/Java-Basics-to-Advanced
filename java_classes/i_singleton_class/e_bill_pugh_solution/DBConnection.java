package java_classes.i_singleton_class.e_bill_pugh_solution;

public class DBConnection {
    private DBConnection(){

    }
    private static class DBConnectionHelper{
        private static final DBConnection INSTANCE_OBJECT= new DBConnection();
    }

    public static DBConnection getInstance(){
        return DBConnectionHelper.INSTANCE_OBJECT;
    }
}
