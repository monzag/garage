public abstract class AbstractVehicle {

    private String company;
    private String model;
    private Integer year;
    private String color;

    public AbstractVehicle(String company, String model, Integer year, String color) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.color = color;
    }

    public String toString() {
        return String.format("%s %s %s, from %d", color, company, model, year);
    }

    public abstract Integer getSize();

    public Integer getYear() { return year; }
}