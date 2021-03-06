package models.train;

import models.traincar.controlcar.ControlCar;
import models.traincar.factory.FreightCarFactory;
import models.traincar.factory.PassengerCarFactory;
import models.traincar.factory.TrainCarFactory;
import models.traincar.freightcar.FreightCar;
import models.traincar.passangercar.ComfortLevel;
import models.traincar.passangercar.PassengerCar;
import models.traincar.traincar.TrainCar;
import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

/**
 * This class is designated for pseudo-random generation of instance of <Code>Train</Code> class.
 */
public class TrainInstanceGenerator {

    private TrainInstanceGenerator() {

    }

    /**
     * Generates an instance of <Code>Train</Code> class.
     *
     * @param numberOfCars Number of cars contained in the train.
     * @return An instance of <Code>Train</Code> class.
     */
    public static Train createTrain(int numberOfCars) {
        Train train = new Train();
        train.setTrainCars(createTrainCars(numberOfCars));
        train.setTrainID(ThreadLocalRandom.current().nextLong(System.currentTimeMillis()));

        return train;
    }

    /**
     * Generates an <Code>ArrayList</Code> of <Code>TrainCar</Code> instances.
     *
     * @param numberOfCars Required number of train cars.
     * @return An <Code>ArrayList</Code> of <Code>TrainCar</Code> instances.
     */
    private static ArrayList<TrainCar> createTrainCars(int numberOfCars) {
        ArrayList<TrainCar> trainCars = new ArrayList<>();

        ControlCar controlCar = new ControlCar();
        controlCar.setCarNumber(0);
        trainCars.add(controlCar);

        for (int index = 1; index < numberOfCars; index++) {
            if (index % 3 == 0) {
                TrainCarFactory trainCarFactory = new FreightCarFactory();
                FreightCar freightCar = (FreightCar) trainCarFactory.createTrainCar();
                freightCar.setCarNumber(index);
                initFieldsRandomly(freightCar);
                trainCars.add(freightCar);
            } else {
                TrainCarFactory trainCarFactory = new PassengerCarFactory();
                PassengerCar passengerCar = (PassengerCar) trainCarFactory.createTrainCar();
                passengerCar.setCarNumber(index);
                initFieldsRandomly(passengerCar);
                trainCars.add(passengerCar);
            }
        }

        return trainCars;
    }


    /**
     * Pseudo-randomly initialises fields of instance of <Code>TrainCar</Code>
     * @param trainCar
     */
    private static void initFieldsRandomly(TrainCar trainCar) {

        if (trainCar instanceof FreightCar) {
            int maxWeightCapacity = 10000;
            int minWeightCapacity = 1000;
            int weightCapacity = ThreadLocalRandom.current().nextInt(minWeightCapacity, maxWeightCapacity);
            trainCar.setWeightCapacity(weightCapacity);
        }

        if (trainCar instanceof PassengerCar) {
            int maxWeightCapacity = 3000;
            int minWeightCapacity = 500;
            int maxPassengersCapacity = 50;
            int minPassengersCapacity = 10;

            int weightCapacity = ThreadLocalRandom.current().nextInt(minWeightCapacity, maxWeightCapacity);
            int passengersCapacity = ThreadLocalRandom.current().nextInt(minPassengersCapacity, maxPassengersCapacity);

            trainCar.setWeightCapacity(weightCapacity);
            ((PassengerCar) trainCar).setPassengersCapacity(passengersCapacity);

            if (trainCar.getCarNumber() % 2 == 0) {
                ((PassengerCar) trainCar).setComfortLevel(ComfortLevel.MIDDLE);
            } else if (trainCar.getCarNumber() % 3 == 0) {
                ((PassengerCar) trainCar).setComfortLevel(ComfortLevel.HIGH);
            } else {
                ((PassengerCar) trainCar).setComfortLevel(ComfortLevel.LOW);
            }
        }

        if (trainCar instanceof ControlCar) {
            trainCar.setWeightCapacity(0);
        }

    }
}
