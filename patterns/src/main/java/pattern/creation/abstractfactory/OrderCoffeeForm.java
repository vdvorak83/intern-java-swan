package pattern.creation.abstractfactory;

public class OrderCoffeeForm {
    private final TextField customerNameTextField;
    private final Select coffeTypeSelect;
    private final Button orderButton;

    public OrderCoffeeForm(GUIFactory factory) {
        System.out.println("Creating order coffee form");
        customerNameTextField = factory.createTextField();
        coffeTypeSelect = factory.createSelect();
        orderButton = factory.createButton();
    }
}
