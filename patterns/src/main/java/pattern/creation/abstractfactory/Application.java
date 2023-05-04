package pattern.creation.abstractfactory;

public class Application {
    private OrderCoffeeForm orderCoffeeForm;

    public void drawOrderCoffeeForm() {
        // choosing os name, got value of system property through System.getProperty
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) { // for windows
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) { // for mac
            guiFactory = new MacGUIFactory();
        } else {
            System.out.println("Unknown OS, can't draw form :( ");
            return;
        }
        orderCoffeeForm = new OrderCoffeeForm(guiFactory);
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderCoffeeForm();
    }
}