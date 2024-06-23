package WithStrategyPattern.Strategy;

public class NormalDriveStrategy implements DriverStrategy{


    @Override
    public void drive() {
        System.out.println("Normal Drive Capability");
    }
}
