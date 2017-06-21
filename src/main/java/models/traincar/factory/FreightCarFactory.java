package models.traincar.factory;

import models.traincar.freightcar.FreightCar;
import models.traincar.traincar.TrainCar;

/**
 * Created by Администратор on 21.06.2017.
 */
public class FreightCarFactory extends TrainCarFactory {

    @Override
    public TrainCar createTrainCar() {
        return new FreightCar();
    }
}
