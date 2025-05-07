package java_classes.b_abstract_class;

public class Audi extends LuxuryCar{
    public Audi(int mileage) {
        super(mileage);
    }

    @Override
    public void pressDualBreakSystem() {
        System.out.println("Press Dual Break System");

    }

    @Override
    public void pressClutch() {
        System.out.println("Press Clutch");
    }
}
