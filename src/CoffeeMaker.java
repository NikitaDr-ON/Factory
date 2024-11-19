public class CoffeeMaker {

    public void makeSomeCoffee(CoffeeType coffeeType){
        CoffeeFactory factory = new CoffeeFactory();
        Coffee coffee = factory.getCoffee(coffeeType);
        coffee.makeCoffee();
    }
}
