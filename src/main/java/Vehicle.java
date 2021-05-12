import behaviours.IVehicleType;

public class Vehicle {
    private String make;
    private String model;
    private IVehicleType type;
    private String colour;
    private Integer price;

    public Vehicle(String make, String model, IVehicleType type, String colour, Integer price){
        this.make = make;
        this.model = model;
        this.type = type;
        this.colour = colour;
        this.price = price;
    }

    public String getMake() {
        return this.make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public IVehicleType getType() {
        return type;
    }

    public void setType(IVehicleType type) {
        this.type = type;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

}
