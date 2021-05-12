import behaviours.IVehicleType;

public class Car implements IVehicleType {

    private Engine engine;
    private Tyres tyres;

    public Car(Engine engine,Tyres tyres){
        this.engine = engine;
        this.tyres = tyres;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
