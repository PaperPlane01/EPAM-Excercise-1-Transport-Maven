package models.train;


import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;
import models.traincar.passangercar.PassengerCar;
import models.traincar.traincar.TrainCar;
import models.traincar.traincar.TrainCarType;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Train {
    /**
     * Cars of the train.
     */
    private ArrayList<TrainCar> trainCars;
    /**
     * ID of the train.
     */
    private long trainID;
    /**
     * Passengers capacity of the train.
     */
    private int passengersCapacity;
    /**
     * Weight capacity of the train.
     */
    private int weightCapacity;


    public Train() {
        trainCars = new ArrayList<>();
    }

    public Train(ArrayList<TrainCar> trainCars) {
        this.trainCars = trainCars;
    }

    public Train(TrainCar[] trainCarsArray) {
        this.trainCars = (ArrayList<TrainCar>) Arrays.asList(trainCarsArray);
    }
    public ArrayList<TrainCar> getTrainCars() {
        return trainCars;
    }

    public void setTrainCars(ArrayList<TrainCar> trainCars) {
        this.trainCars = trainCars;
    }

    public long getTrainID() {
        return trainID;
    }

    public void setTrainID(long trainID) {
        this.trainID = trainID;
    }


    /**
     * Returns a train car with a specified number (position in the train)
     * @param trainCarNumber Number of the train car.
     * @return A train car with a specified number (position in the train)
     */
    public TrainCar getTrainCarByNumber(int trainCarNumber) {
        return trainCars.get(trainCarNumber);
    }

    public void setTrainCarByNumber(int trainCarNumber, TrainCar trainCar) {
        trainCars.set(trainCarNumber, trainCar);
    }

    public void addTrainCar(TrainCar trainCar) {
        trainCars.add(trainCar);

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Train train = (Train) o;

        if (getTrainID() != train.getTrainID()) return false;
        if (passengersCapacity != train.passengersCapacity) return false;
        if (weightCapacity != train.weightCapacity) return false;
        return getTrainCars().equals(train.getTrainCars());
    }

    @Override
    public int hashCode() {
        int result = getTrainCars().hashCode();
        result = 31 * result + (int) (getTrainID() ^ (getTrainID() >>> 32));
        result = 31 * result + passengersCapacity;
        result = 31 * result + weightCapacity;
        return result;
    }

    @Override
    public String toString() {
        return "Train{" +
                "trainID=" + trainID +
                ", passengersCapacity=" + passengersCapacity +
                ", weightCapacity=" + weightCapacity +
                '}';
    }

    public int getNumberOfTrainCars() {
        return trainCars.size();
    }
}
