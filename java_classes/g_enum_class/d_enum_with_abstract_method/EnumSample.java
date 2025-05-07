package java_classes.g_enum_class.d_enum_with_abstract_method;

public enum EnumSample {
    MONDAY{
        public void dummyMethod(){
            System.out.println("in Monday");
        }
    },
    TUESDAY{
        public void dummyMethod(){
            System.out.println("in Tuesday");
        }
    },
    WEDNESDAY{
        public void dummyMethod(){
            System.out.println("in Wednesday");
        }
    },
    THURSDAY{
        public void dummyMethod(){
            System.out.println("in Thursday");
        }
    },
    FRIDAY{
        public void dummyMethod(){
            System.out.println("in Friday");
        }
    },
    SATURDAY{
        public void dummyMethod(){
            System.out.println("in Saturday");
        }
    },
    SUNDAY{
        public void dummyMethod(){
            System.out.println("in Sunday");
        }
    };

    public abstract void dummyMethod();
}
