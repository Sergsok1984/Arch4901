package OCP;

public class Car extends Vehicle {
    public Car(int maxSpeed) {
        super((int) (maxSpeed * 0.8));
    }
}
