package models.traincar.controlcar;


import models.traincar.traincar.TrainCar;
import models.traincar.traincar.TrainCarType;

/**
 * Class representing a control car of the train.
 */
public class ControlCar  implements TrainCar {

    /**
     * Type of the train car.
     */
    public static final TrainCarType TYPE = TrainCarType.CONTROL_CAR;
    /**
     * Weight capacity of the control car.
     */
    private int weightCapacity;
    /**
     * The number of the train car (it's position in the train)
     */
    private int carNumber;

    public ControlCar() {
    }

    /**
     * Constructor with specified weight capacity and car number parameters.
     * @param weightCapacity Weight capacity of the
     * @param carNumber
     */
    public ControlCar(int weightCapacity, int carNumber) {
        this.weightCapacity = weightCapacity;
        this.carNumber = carNumber;
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
    public void setWeightCapacity(int weightCapacity) {
        this.weightCapacity = weightCapacity;
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
        return "ControlCar{" +
                "weightCapacity=" + weightCapacity +
                ", carNumber=" + carNumber +
                '}';
    }
}
