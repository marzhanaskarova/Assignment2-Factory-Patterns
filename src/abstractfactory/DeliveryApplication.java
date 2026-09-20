import abstractfactory.Button;
import abstractfactory.Checkbox;
import abstractfactory.GUIFactory;
import factorymethod.Logistics;

public class DeliveryApplication {

    private Logistics logistics;
    private GUIFactory guiFactory;

    public DeliveryApplication(Logistics logistics, GUIFactory guiFactory) {
        this.logistics = logistics;
        this.guiFactory = guiFactory;
    }

    public void run(String cargo, String destination) {
        Button button = guiFactory.createButton();
        Checkbox checkbox = guiFactory.createCheckbox();

        button.render();
        checkbox.render();

        logistics.planDelivery(cargo, destination);
    }
}