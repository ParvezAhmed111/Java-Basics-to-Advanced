package java_classes.b_abstract_class;

public abstract class Car {
    int mileage;
    Car(int mileage){
        this.mileage= mileage;
    }
    public abstract void pressBreak();
    public abstract void pressClutch();
    public int getNoOfWheels(){
        return 4;
    }
}
