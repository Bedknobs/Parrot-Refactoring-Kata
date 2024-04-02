package parrot;

public class AfricanParrot implements Parrot {

    public static final double AFRICAN_BASE_SPEED = 12.0;
    public static final double AFRICAN_LOAD_FACTOR = 9.0;
    private final int numberOfCoconuts;

    public AfricanParrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }


    @Override
    public Double getSpeed() {
        return Math.max(0, AFRICAN_BASE_SPEED - AFRICAN_LOAD_FACTOR * numberOfCoconuts);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }

}