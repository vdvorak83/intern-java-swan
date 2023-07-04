package pattern.creation.decorator;

public class DecoratorTestCase {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        Coffee coffeeWithMilk = new MilkDecorator(simpleCoffee);
        Coffee coffeeWithMilkAndSugar = new SugarDecorator(coffeeWithMilk);

        System.out.println("Description: " + coffeeWithMilkAndSugar.getDescription());
        System.out.println("Cost: $" + coffeeWithMilkAndSugar.getCost());
    }
}
