package models.traincar.factory;

import models.traincar.controlcar.ControlCar;
import models.traincar.traincar.TrainCar;

/**
 * Created by Администратор on 21.06.2017.
 */
public class ControlCarFactory extends TrainCarFactory{
    @Override
    public TrainCar createTrainCar() {
        return new ControlCar();
    }
}
