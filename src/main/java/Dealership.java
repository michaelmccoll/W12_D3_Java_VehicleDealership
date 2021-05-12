import javax.swing.tree.VariableHeightLayoutCache;
import java.util.ArrayList;

public class Dealership {

    private int till;
    private ArrayList<Vehicle> stock;

    public Dealership(int till){
        this.till = till;
        this.stock = new ArrayList<>();
    }

    public int getTill() {
        return till;
    }

    public void reduceTill(int till) {
        this.till -= till;
    }

    public int getStockSize() {
        return stock.size();
    }

    public void addToStock(Vehicle vehicle){
        stock.add(vehicle);
    }

    public void buyVehicle(Vehicle vehicle){
        if (this.till >= vehicle.getPrice()){
            stock.add(vehicle);
            reduceTill(vehicle.getPrice());
        }
    }

//    public Vehicle removeVehicleFromStock(Vehicle vehicle){
//        for (int j = 0; j < stock.size(); j++){
//            vehicle = stock.get(j);
//            if (vehicle.indexOf.equals(vehicle)){
//                stock.remove(stock.indexOf(vehicle));
//            }
//        }
//    }

    public void sellVehicleToCustomer(Customer customer, Vehicle vehicle){
        customer.canBuyVehicle(vehicle);

    }

}
