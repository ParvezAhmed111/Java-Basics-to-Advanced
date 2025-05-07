package reflection;

public class Eagle {
    public String bread;
    private boolean canSwim;

    public void fly(){
        System.out.println("fly");
    }

    public void flyWithParam(int intParam, boolean boolParam, String strParam){
        System.out.println("fly intParam: "+ intParam + " boolParam: " + boolParam + " strParam: " + strParam);
    }

    private void eat(){
        System.out.println("eat");
    }
}
