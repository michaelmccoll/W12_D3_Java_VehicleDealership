public class Tyres {

    private String make;
    private int size;
    private int numberOfTyres;

    public Tyres(String make, int size,int numberOfTyres){
        this.make = make;
        this.size = size;
        this.numberOfTyres = numberOfTyres;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getNumberOfTyres() {
        return numberOfTyres;
    }

    public void setNumberOfTyres(int numberOfTyres) {
        this.numberOfTyres = numberOfTyres;
    }
}
