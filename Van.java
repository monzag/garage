public class Van extends AbstractVehicle {

    private static Integer size = 2;
    private Integer maxCapacity;

    public Van(String company, String model, Integer year, String color, Integer maxCapacity) {
        super(company, model, year, color);
        this.maxCapacity = maxCapacity;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(", max capacity: %d kg", maxCapacity);
    }

    @Override
    public Integer getSize() { return size; } 
}