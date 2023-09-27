package car.command;

import car.Car;
import car.CarServer;

public class RightDownCommand extends MoveCommand{

    public RightDownCommand(Car car, int count){
        super(car, count, CarServer.Direction.RIGHTDOWN);
    }
}
