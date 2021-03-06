package views;

import models.traincar.passangercar.PassengerCar;
import models.traincar.traincar.TrainCar;

/**
 * Class designated for visual representation of instance of <Class>PassengerCar</Class>.
 */
public class PassengerCarView extends TrainCarView implements View {

    /**
     * Data structure to be displayed.
     */
    private PassengerCar model;

    public PassengerCarView() {
        model = new PassengerCar();
    }

    public PassengerCarView(PassengerCar model) {
        this.model = model;
    }

    @Override
    public PassengerCar getModel() {
        return model;
    }

    @Override
    public void setModel(TrainCar model) {
        try {
            this.model = (PassengerCar) model;
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Train car type: Passenger car").append("   ");
        stringBuilder.append("Train car number: ").append(model.getCarNumber()).append("   ");
        stringBuilder.append("Weight capacity: ").append(model.getWeightCapacity()).append("   ");
        stringBuilder.append("Passengers capacity: ").append(model.getPassengersCapacity()).append("    ");
        stringBuilder.append("Comfort level: ");

        switch (model.getComfortLevel()) {
            case LOW:
                stringBuilder.append("low");
                break;
            case MIDDLE:
                stringBuilder.append("middle");
                break;
            case HIGH:
                stringBuilder.append("high");
                break;
        }

        showMessage(stringBuilder.toString());
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
