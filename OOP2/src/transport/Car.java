package transport;

public class Car extends EngineTransport {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        System.out.println("Началось обслуживание легкового авто " + getModelName());
        super.check();
    }
}
