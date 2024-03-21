package parrot;

public class EuropeanParrot implements Parrot {

    public static final double EUROPEAN_PARROT_SPEED = 12.0;

    @Override
    public Double getSpeed() {
        return EUROPEAN_PARROT_SPEED;
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }


}