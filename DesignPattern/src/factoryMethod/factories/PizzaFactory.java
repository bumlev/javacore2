package factoryMethod.factories;

import factoryMethod.classes.Pizza;
import factoryMethod.interfaces.Dish;
import factoryMethod.interfaces.DishFactory;

public class PizzaFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Pizza();
    }
}
