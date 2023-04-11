package org.intern;

public class DogFactory implements AnimalFactory{
    @Override
    public Animal createAnimal()
    {
        return new Dog();
    }
}
