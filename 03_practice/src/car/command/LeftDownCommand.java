package car.command;

import car.Car;
import car.CarServer;

public class LeftDownCommand extends MoveCommand{

    public LeftDownCommand(Car car, int count){
        super(car, count, CarServer.Direction.LEFTDOWN);
    }
}
