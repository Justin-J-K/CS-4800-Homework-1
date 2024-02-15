package polymorphism;

public class CruiseShip extends Ship {
    private int maximumPassengers;

    public CruiseShip(String name, String yearBuilt, int maximumPassengers) {
        super(name, yearBuilt);
        this.maximumPassengers = maximumPassengers;
    }

    public int getMaximumPassengers() {
        return maximumPassengers;
    }

    public void setMaximumPassengers(int maximumPassengers) {
        this.maximumPassengers = maximumPassengers;
    }

    @Override
    public void print() {
        System.out.printf("Cruise ship \"%s\" was built in %s and can carry %d passengers\n",
                this.getName(), this.getYearBuilt(), maximumPassengers);
    }
}
