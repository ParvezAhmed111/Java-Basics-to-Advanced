package java_classes.g_enum_class.a_normal_enum_class;

public class Main {
    public static void main(String[] args) {
        /*
        Common functions which is used
        - values() - getting each enum in an array form
        - ordinal() - to know the default value that is automatically assigned
        - valueOf() - to get the value value via the string
        - name() - return name of the constant
        */

        // 1. usage of values() and ordinal()
        for (EnumSample sample: EnumSample.values()){
            System.out.println(sample.ordinal());
        }
        /* OUTPUT
            0
            1
            2
            3
            4
            5
            6
         */

        // 2. usage of value() and name()
        EnumSample enumVariable= EnumSample.valueOf("FRIDAY"); // enumVariable = 4
        System.out.println(enumVariable.name()); // FRIDAY
    }
}
