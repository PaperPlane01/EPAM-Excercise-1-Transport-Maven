package views;

import models.train.Train;
import models.traincar.controlcar.ControlCar;
import models.traincar.freightcar.FreightCar;
import models.traincar.passangercar.PassengerCar;
import models.traincar.traincar.TrainCar;
import models.trainmanager.TrainManager;

import java.util.ArrayList;

/**
 * Class designated for visual representation of instance of <Class>Train</Class>.
 */
public class TrainView implements View {


    /**
     * Data structure to be displayed.
     */
    private Train model;
    /**
     * Visual representations of train's cars.
     */
    private ArrayList<TrainCarView> trainCarViews;

    public TrainView() {
        this.trainCarViews = new ArrayList<>();
    }

    public TrainView(Train model) {
        this.model = model;
        this.trainCarViews = new ArrayList<>();
        initTrainCarViews();
    }

    public Train getModel() {
        return model;
    }

    public void setTrain(Train train) {
        this.model = model;
    }

    @Override
    public void show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Train ID: " + model.getTrainID() + "   ");
        stringBuilder.append("Passengers capacity: " + (new TrainManager(model)).getPassengersCapacity() + "   ");
        stringBuilder.append("Weight capacity: " + (new TrainManager(model)).getPassengersCapacity());
        showMessage(stringBuilder.toString());
        showTrainCarsViews();
    }

    private void initTrainCarViews() {
        for (TrainCar trainCar : model.getTrainCars()) {
            switch (trainCar.getType()) {
                case CONTROL_CAR:
                    trainCarViews.add(new ControlCarView((ControlCar) trainCar));
                    break;
                case FREIGHT_CAR:
                    trainCarViews.add(new FreightCarView((FreightCar) trainCar));
                    break;
                case PASSENGER_CAR:
                    trainCarViews.add(new PassengerCarView((PassengerCar) trainCar));
                    break;
            }
        }
    }

    private void showTrainCarsViews() {
        for (TrainCarView trainCarView : trainCarViews) {
            trainCarView.show();
        }
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
