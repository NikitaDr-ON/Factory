public class Main {
    public static void main(String[] args) {
        CoffeeMaker coffeeMaker = new CoffeeMaker();
        coffeeMaker.makeSomeCoffee(CoffeeType.ESPRESSO);
        coffeeMaker.makeSomeCoffee(CoffeeType.AMERICANO);
    }
}