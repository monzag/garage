public class Truck extends Van {

    private static Integer size = 3;
    private Integer wheelCount;

    public Truck(String company, String model, Integer year, String color, Integer maxCapacity, Integer wheelCount) {
        super(company, model, year, color, maxCapacity);
        this.wheelCount = wheelCount;
    }
    
    @Override
    public String toString() {
        return String.format("%d-wheels, ", wheelCount) + super.toString();
    }

    @Override
    public Integer getSize() { return size; } 
}