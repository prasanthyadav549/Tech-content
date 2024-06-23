import WithStrategyPattern.Strategy.DriverStrategy;

public class Vehicle {
    private DriverStrategy driverStrategy;

    public Vehicle(DriverStrategy driverStrategy) {
        this.driverStrategy = driverStrategy;
    }

    public void drive() {
        driverStrategy.drive();
    }
}
