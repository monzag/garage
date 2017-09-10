import java.util.ArrayList;

public class Garage<T> {
    
    private String address;
    private Integer space;
    private ArrayList<AbstractVehicle> vehicles;

    public Garage(String address, Integer space) {
        this.address = address;
        this.space = space;
        vehicles = new ArrayList<>();
    }

    public void addVehicle(AbstractVehicle object) throws IllegalAccessError {
        if (object instanceof AbstractVehicle) {
            vehicles.add(object);
        } else {
            throw new IllegalAccessError("Bad object!");
        }
    }

    public void displayGarage() {
        for (AbstractVehicle object : vehicles) {
            System.out.println(object);
            System.out.println("size: " + object.getSize());
            System.out.println(object.getYear());
        }
    }

    public static void main(String[] args) {
        String address = "ul. Opolska 3, Kraków";
        Integer space = 10;
        Garage garage = new Garage<AbstractVehicle>(address, space);

        Car car = new Car("BMW", "Tico", 2000, "red");
        garage.addVehicle(car);

        Van van = new Van("Opel", "Tico", 2017, "red", 1000);
        garage.addVehicle(van);

        Truck truck = new Truck("Toyota", "alfa", 2010, "black", 5000, 6);
        garage.addVehicle(truck);

        garage.displayGarage();
        
    }
    

}
