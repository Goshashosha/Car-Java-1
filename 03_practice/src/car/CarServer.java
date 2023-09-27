package car;

public interface CarServer {
    enum Direction{
        UP,DOWN,LEFT,RIGHT, RIGHTUP, LEFTUP, RIGHTDOWN, LEFTDOWN
    }

    Car createCar();
    void destroyCar(Car car);
    boolean moveCarTo(Car car, Direction direction);

}
