package java_classes.g_enum_class.b_enum_with_custom_values;

public enum EnumSample {
    MONDAY(101, "1st day of the week"),
    TUESDAY(102, "2nd day of the week"),
    WEDNESDAY(103, "3rd day of the week"),
    THURSDAY(104, "4th day of the week"),
    FRIDAY(105, "5th day of the week"),
    SATURDAY(106, "6th day of the week"),
    SUNDAY(107, "7th day of the week");

    private int val;
    private String comment;

    // CONSTRUCTOR is always private (here in default case also, when bytecode is generated, the constructor is private only)
    // you can check in .class file
    EnumSample(int val, String comment){
        this.val = val;
        this.comment= comment;
    }

    public int getVal() {
        return val;
    }

    public String getComment() {
        return comment;
    }

    public static EnumSample getEnumFromValue(int value){
        for (EnumSample sample : EnumSample.values()){
            if (sample.val == value){
                return sample;
            }
        }
        return null;
    }
}
