package runner;

import models.train.Train;
import models.train.TrainInstanceGenerator;
import models.trainmanager.TrainManager;
import views.TrainManagerView;

public class App {

    public static void main(String[] args) {
        Train train = TrainInstanceGenerator.createTrain(10);

       TrainManager trainManager = new TrainManager(train);
       TrainManagerView trainManagerView = new TrainManagerView(trainManager);

       trainManagerView.show();
       trainManagerView.showListOfPassengerCarsSortedByComfortLevel(false);
       trainManagerView.showListOfPassengerCarsWithPassengersCapacityWithinRange(20, 30);
    }
}
