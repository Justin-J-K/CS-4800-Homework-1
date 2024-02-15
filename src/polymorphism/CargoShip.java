package polymorphism;

public class CargoShip extends Ship {
    private int capacityInTons;

    public CargoShip(String name, String yearBuilt, int capacityInTons) {
        super(name, yearBuilt);
        this.capacityInTons = capacityInTons;
    }

    public int getCapacityInTons() {
        return capacityInTons;
    }

    public void setCapacityInTons(int capacityInTons) {
        this.capacityInTons = capacityInTons;
    }

    @Override
    public void print() {
        System.out.printf("Cargo ship \"%s\" was built in %s and can hold %d tons of cargo",
                this.getName(), this.getYearBuilt(), capacityInTons);
    }
}
