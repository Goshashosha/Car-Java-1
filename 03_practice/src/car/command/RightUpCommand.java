package car.command;

import car.Car;
import car.CarServer;

public class RightUpCommand extends MoveCommand{

    public RightUpCommand(Car car, int count){
        super(car, count, CarServer.Direction.RIGHTUP);
    }
}
