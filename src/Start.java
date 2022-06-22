public class Start {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Car bmw = new Car("320d", 155000);

        bmw.printCarDetails();

        bmw.getCarDetails();
    }
}
