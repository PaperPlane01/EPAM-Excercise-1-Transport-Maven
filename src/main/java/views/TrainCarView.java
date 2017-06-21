package views;

import models.traincar.traincar.TrainCar;


public abstract class TrainCarView implements View {

    public abstract TrainCar getModel();

    public abstract void setModel(TrainCar model);
}
