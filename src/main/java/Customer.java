import java.util.ArrayList;

public class Customer {

    private int money;
    private ArrayList<Vehicle> ownedVehicles;

    public Customer(int money){
        this.money = money;
        this.ownedVehicles = new ArrayList<>();
    }

    public int getMoney() {
        return money;
    }

    public void removeMoney(int money) {
        this.money -= money;
    }

    public int getOwnedVehicles() {
        return ownedVehicles.size();
    }

    public void addVehicle(Vehicle vehicle){
        this.ownedVehicles.add(vehicle);
    }

    public void canBuyVehicle(Vehicle vehicle){
        if (this.money >= vehicle.getPrice()){
            addVehicle(vehicle);
            removeMoney(vehicle.getPrice());
        }
    }
}
