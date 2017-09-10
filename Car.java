public class Car extends AbstractVehicle {

    private static Integer size = 1;
    public Car(String company, String model, Integer year, String color) {
        super(company, model, year, color);
    }

    @Override
    public Integer getSize() { return size; } 
}