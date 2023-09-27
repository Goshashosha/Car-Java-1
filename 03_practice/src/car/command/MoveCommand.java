package car.command;

import car.Car;
import car.CarServer;
import car.FieldMatrix;
import car.Position;

public abstract class MoveCommand implements Command{
    private final Car car;
    private final int count;
    private final CarServer.Direction direction;

    protected MoveCommand(Car car, int count, CarServer.Direction direction){
        this.car = car;
        this.count = count;
        this.direction = direction;
    }

    @Override
    public boolean execute(){
        for(int i = 0; i < count; i++) {
            System.out.println(car.getPosition());
            System.out.println(car.getSpeed());
            if (!car.moveTo(direction)) return false;
        }
        return true;
    }

}
