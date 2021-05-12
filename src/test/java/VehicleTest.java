import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class VehicleTest {

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
    public void canGetMake(){
        assertEquals("BMW",vehicle1.getMake());
    }
}
