package pattern.creation.abstractfactory;

public class Application {
    private OrderCoffeeForm orderCoffeeForm;

    public void drawOrderCoffeeForm() {
        // Определим имя операционной системы, получив значение системной проперти через System.getProperty
        String osName = System.getProperty("os.name").toLowerCase();
        GUIFactory guiFactory;

        if (osName.startsWith("win")) { // Для windows
            guiFactory = new WindowsGUIFactory();
        } else if (osName.startsWith("mac")) { // Для mac
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