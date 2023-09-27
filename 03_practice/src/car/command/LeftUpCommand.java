package car.command;

import car.Car;
import car.CarServer;

public class LeftUpCommand extends MoveCommand{

    public LeftUpCommand(Car car, int count){
        super(car, count, CarServer.Direction.LEFTUP);
    }
}
