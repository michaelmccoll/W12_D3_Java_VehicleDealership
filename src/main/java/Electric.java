import behaviours.IVehicleType;

public class Electric implements IVehicleType {

    private Tyres tyres;

    public Electric(Tyres tyres){
        this.tyres = tyres;
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }
}
