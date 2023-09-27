package car;

import car.command.*;

import java.awt.*;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 * @author : Alex
 **/
public class Main {
    public static void main(String[] args) throws Exception{
        FieldMatrix fm = new FieldMatrix(45,45);
        CarPainter p = new CarPainter(fm);
        BasicCarServer carServer = new BasicCarServer(fm, p);
        Car car = carServer.createCar();

//        car.setColor(Color.YELLOW);
//        car.setName("Simp");
//        car.moveTo(CarServer.Direction.DOWN);
//        car.moveTo(CarServer.Direction.RIGHT);
//        car.moveTo(CarServer.Direction.DOWN);
//
//        ColorCommand ccommand = new ColorCommand(car, Color.GREEN);
//        ccommand.execute();
//        new NameCommand(car, "Class").execute();
//        MoveCommand command;
//        command = new DownCommand(car, 4);
//        command.execute();
//        command = new UpCommand(car, 4);
//        command.execute();

        Script script = new Script();
        script.add(new ColorCommand(car, Color.BLUE));
        script.add(new NameCommand(car,"乒乓球"));
        script.add(new SpeedCommand(car, 10));
        script.add(new DownCommand(car, 220));
        for (int j = 1; j <= 5; j++) {
            script.add(new SpeedCommand(car, j * 4));
            script.add(new RightDownCommand(car, 2000));
            script.add(new RightUpCommand(car, 2000));
            script.add(new LeftUpCommand(car, 2000));
            script.add(new LeftDownCommand(car, 2000));
        }
        script.add(new DownCommand(car, 22));

        script.execute();

    }
}
