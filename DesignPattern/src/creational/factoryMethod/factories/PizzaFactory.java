package creational.factoryMethod.factories;

import creational.factoryMethod.classes.Pizza;
import creational.factoryMethod.interfaces.Dish;
import creational.factoryMethod.interfaces.DishFactory;

public class PizzaFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Pizza();
    }
}
