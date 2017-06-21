package models.traincar.traincar;


public interface TrainCar  {

    TrainCarType getType();

    int getWeightCapacity();

    void setWeightCapacity(int weightCapacity);

    int getCarNumber();

    void setCarNumber(int number);

}
