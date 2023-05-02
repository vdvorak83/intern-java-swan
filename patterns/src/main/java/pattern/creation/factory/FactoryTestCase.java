package pattern.creation.factory;

public class FactoryTestCase {
    public static void main(String[] args) {
        AnimalFactory dogFactory = new DogFactory();
        AnimalFactory catFactory = new CatFactory();

        Animal dog = dogFactory.createAnimal();
        Animal cat = catFactory.createAnimal();

        dog.speak();
        cat.speak();
    }
}