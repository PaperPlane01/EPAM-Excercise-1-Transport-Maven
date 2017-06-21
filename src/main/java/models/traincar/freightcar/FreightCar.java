package models.traincar.freightcar;


import models.traincar.traincar.TrainCar;
import models.traincar.traincar.TrainCarType;

public class FreightCar implements TrainCar {

    public static final TrainCarType TYPE = TrainCarType.FREIGHT_CAR;
    private int weightCapacity;
    private int carNumber;

    public FreightCar() {
    }

    public FreightCar(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }


    @Override
    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
    }

    @Override
    public TrainCarType getType() {
        return TYPE;
    }

    @Override
    public int getWeightCapacity() {
        return weightCapacity;
    }

    @Override
    public int getCarNumber() {
        return carNumber;
    }

    @Override
    public void setCarNumber(int carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public String toString() {
        return "FreightCar{" +
                "weightCapacity=" + weightCapacity +
                ", carNumber=" + carNumber +
                '}';
    }
}
