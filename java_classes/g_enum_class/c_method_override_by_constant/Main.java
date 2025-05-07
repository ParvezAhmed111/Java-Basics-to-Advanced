package java_classes.g_enum_class.c_method_override_by_constant;

public class Main {
    public static void main(String[] args) {
        EnumSample fridayEnumSample= EnumSample.FRIDAY;
        fridayEnumSample.dummyMethod(); // default dummy method

        EnumSample mondayEnumSample= EnumSample.MONDAY;
        mondayEnumSample.dummyMethod(); // Monday dummy method
    }
}
