import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Dealership dealership1;
    Customer customer1;
    Vehicle vehicle1;
    Vehicle vehicle2;
    Vehicle vehicle3;
    Vehicle vehicle4;
    Car car1;
    Hybrid hybrid1;
    Motorcycle motorcycle1;
    Electric electric1;
    Engine engine1;
    Engine engine2;
    Tyres tyres1;
    Tyres tyres2;

    @Before
    public void setUp(){
        dealership1 = new Dealership(100000);
        customer1 = new Customer(29000);
        engine1 = new Engine("Fuel");
        engine2 = new Engine("Hybrid");
        tyres1 = new Tyres("Bridgestone",18,4);
        tyres2 = new Tyres("Michelin",14,2);
        car1 = new Car(engine1, tyres1);
        hybrid1 = new Hybrid(engine2,tyres1);
        motorcycle1 = new Motorcycle(engine1,tyres2);
        electric1 = new Electric(tyres1);
        vehicle1 = new Vehicle("BMW","Series 3",car1,"Red",30000);
        vehicle2 = new Vehicle("Hyundai","Zen",hybrid1,"Blue",25000);
        vehicle3 = new Vehicle("Honda","Z3",motorcycle1,"White",22000);
        vehicle4 = new Vehicle("Tesla","Model 3",electric1,"Black",35000);
    }

    @Test
    public void canAddVechicle(){
        customer1.addVehicle(vehicle4);
        assertEquals(1,customer1.getOwnedVehicles());
    }

    @Test
    public void canBuyVehicle(){
        customer1.canBuyVehicle(vehicle3);
        assertEquals(1,customer1.getOwnedVehicles());
        assertEquals(7000,customer1.getMoney());
    }

    @Test
    public void cantBuyVehicle(){
        customer1.canBuyVehicle(vehicle4);
        assertEquals(0,customer1.getOwnedVehicles());
        assertEquals(29000,customer1.getMoney());
    }
}
