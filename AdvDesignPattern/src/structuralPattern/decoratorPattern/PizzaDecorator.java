package structuralPattern.decoratorPattern;

abstract class PizzaDecorator implements Pizza{

    protected Pizza decoratedPizza;

    public PizzaDecorator(Pizza pizza) {
        this.decoratedPizza = pizza;
    }
}
