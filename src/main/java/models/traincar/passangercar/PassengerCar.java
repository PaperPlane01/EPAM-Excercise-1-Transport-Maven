package models.traincar.passangercar;


import models.traincar.traincar.TrainCar;
import models.traincar.traincar.TrainCarType;


/**
 * Class representing a passenger car.
 */
public class PassengerCar implements TrainCar {
    /**
     * Type of the train car.
     */
    public static final TrainCarType TYPE = TrainCarType.PASSENGER_CAR;
    /**
     * Passengers capacity of the passenger car.
     */
    private int passengersCapacity;
    /**
     * Weight capacity of the passenger car (in kg).
     */
    private int weightCapacity;
    /**
     * Comfort level of the passenger car.
     */
    private ComfortLevel comfortLevel;
    /**
     * Car number of the passenger car.
     */
    private int carNumber;

    public PassengerCar() {
    }

    /**
     * Creates in instance of passenger car with specified parameters.
     * @param passengersCapacity Passengers capacity.
     * @param weightCapacity Weight capacity of the passenger car (in kg).
     * @param comfortLevel Comfort level of the passenger car.
     */
    public PassengerCar(int passengersCapacity, int weightCapacity, ComfortLevel comfortLevel) {
        this.passengersCapacity = passengersCapacity;
        this.comfortLevel = comfortLevel;
    }

    public int getPassengersCapacity() {
        return passengersCapacity;
    }

    public void setPassengersCapacity(int passengersCapacity) {
        this.passengersCapacity = passengersCapacity;
    }

    public ComfortLevel getComfortLevel() {
        return comfortLevel;
    }

    public void setComfortLevel(ComfortLevel comfortLevel) {
        this.comfortLevel = comfortLevel;
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
        return "PassengerCar{" +
                "passengersCapacity=" + passengersCapacity +
                ", weightCapacity=" + weightCapacity +
                ", comfortLevel=" + comfortLevel +
                ", carNumber=" + carNumber +
                '}';
    }

}
