package models.traincar.factory;


import models.traincar.passangercar.PassengerCar;
import models.traincar.traincar.TrainCar;

public class PassengerCarFactory extends TrainCarFactory {

    @Override
    public TrainCar createTrainCar() {
        return new PassengerCar();
    }
}
