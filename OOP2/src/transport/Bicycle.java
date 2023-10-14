package transport;

public class Bicycle extends Transport {

    private final static int WHEELS_COUNT = 2;

    public Bicycle(String modelName) {
        super(modelName, WHEELS_COUNT);
    }

    @Override
    public void check() {
        System.out.println("Началось обслуживание велосипеда " + getModelName());
        super.check();
    }
}
