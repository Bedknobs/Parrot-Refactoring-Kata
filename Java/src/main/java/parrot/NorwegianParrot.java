package parrot;

public class NorwegianParrot implements Parrot {

    private double getBaseSpeed() {
        return 12.0;
    };
    
    private double NORWEGIAN_BASE_SPEED(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    };

    private final double voltage;
    private final boolean isNailed;

    public NorwegianParrot(double voltage, boolean isNailed) {
        this.voltage = voltage;
        this.isNailed = isNailed;
    };

    @Override
    public Double getSpeed() {
        return (isNailed) ? 0 : NORWEGIAN_BASE_SPEED(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }
}
