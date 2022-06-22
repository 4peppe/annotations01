public class Car {
    String modelName;
    int mileage;

    public Car(String modelName, int mileage) {
        this.modelName = modelName;
        this.mileage = mileage;
    }

    @Deprecated
    public void printCarDetails(){
        System.out.println("the car is: " + this.modelName + " and have " + this.mileage + " km");
    }

    public void getCarDetails(){
        System.out.println("the car is: " + this.modelName);
        System.out.println("the car have: " + this.mileage + " km");
    }
}
