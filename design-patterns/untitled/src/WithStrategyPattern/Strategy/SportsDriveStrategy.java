package WithStrategyPattern.Strategy;

public class SportsDriveStrategy implements DriverStrategy{

    @Override
    public void drive() {
        System.out.println("Sports Drive Capability");
    }
}
