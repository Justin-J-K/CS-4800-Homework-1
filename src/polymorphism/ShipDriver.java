package polymorphism;

public class ShipDriver {
    public static void main(String[] args) {
        Ship[] ships = {
                new Ship("The Ship", "2020"),
                new CruiseShip("The Big Cruise", "2002", 5000),
                new CargoShip("The Cargo Ship", "2014", 10000)
        };

        for (Ship ship : ships) {
            ship.print();
        }
    }
}
