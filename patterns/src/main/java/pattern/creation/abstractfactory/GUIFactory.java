package pattern.creation.abstractfactory;

//my abstract factory
public interface GUIFactory {

    Button createButton();
    TextField createTextField();
    Select createSelect();

}
