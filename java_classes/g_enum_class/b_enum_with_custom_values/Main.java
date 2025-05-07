package java_classes.g_enum_class.b_enum_with_custom_values;

public class Main {
    public static void main(String[] args) {
        EnumSample sampleVar= EnumSample.getEnumFromValue(107);
        System.out.println(sampleVar.getComment()); // 7th day of the week
    }
}
