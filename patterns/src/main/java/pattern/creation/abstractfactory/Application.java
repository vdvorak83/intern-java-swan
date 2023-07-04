package pattern.creation.abstractfactory;

public class Application {
    private OrderCoffeeForm orderCoffeeForm;

    private enum OperatingSystem {
        WINDOWS, MAC, UNKNOWN;

        public static OperatingSystem getCurrent() {
            String osName = System.getProperty("os.name").toLowerCase();
            if (osName.contains("win")) {
                return WINDOWS;
            } else if (osName.contains("mac")) {
                return MAC;
            } else {
                return UNKNOWN;
            }
        }
    }

    public void drawOrderCoffeeForm() {
        GUIFactory guiFactory = null;
        switch (OperatingSystem.getCurrent()) {
            case WINDOWS:
                guiFactory = new WindowsGUIFactory();
                break;
            case MAC:
                guiFactory = new MacGUIFactory();
                break;
            case UNKNOWN:
                System.out.println("Unknown OS, can't draw form :(");
                break;
            default:
                throw new IllegalStateException("Unknown operating system.");
        }

        if (guiFactory != null) {
            orderCoffeeForm = new OrderCoffeeForm(guiFactory);
        }
    }

    public static void main(String[] args) {
        Application application = new Application();
        application.drawOrderCoffeeForm();
    }
}