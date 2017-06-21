package views;

import models.traincar.freightcar.FreightCar;
import models.traincar.traincar.TrainCar;
import models.traincar.traincar.TrainCarType;

/**
 * Class designated for visual representation of instance of <Class>FreightCar</Class>.
 */
public class FreightCarView extends TrainCarView implements View {

    /**
     * Data structure to be displayed.
     */
    private FreightCar model;

    public FreightCarView() {
        this.model = new FreightCar();
    }

    public FreightCarView(FreightCar model) {
        this.model = model;
    }

    @Override
    public FreightCar getModel() {
        return model;
    }

    @Override
    public void setModel(TrainCar model) {

        if (model.getType() != TrainCarType.FREIGHT_CAR) {
            try {
                this.model = (FreightCar) model;
            } catch (IllegalArgumentException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public void show() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Train car type: Freight car").append("   ");
        stringBuilder.append("Train car number: ").append(model.getCarNumber()).append("   ");
        stringBuilder.append("Weight capacity: ").append(model.getWeightCapacity());
        showMessage(stringBuilder.toString());
    }

    @Override
    public void showMessage(String message) {
        System.out.println(message);
    }
}
