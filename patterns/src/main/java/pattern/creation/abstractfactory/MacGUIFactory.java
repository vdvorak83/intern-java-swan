package pattern.creation.abstractfactory;

public class MacGUIFactory implements GUIFactory {
    public MacGUIFactory() {
        System.out.println("Creating gui factory for macOS");
    }

    @Override
    public Button createButton() {
        System.out.println("Creating Button for macOS");
        return new MacButton();
    }

    @Override
    public TextField createTextField() {
        System.out.println("Creating TextField for macOS");
        return new MacTextField();
    }

    @Override
    public Select createSelect() {
        System.out.println("Creating Select for macOS");
        return new MacSelect();
    }
}
