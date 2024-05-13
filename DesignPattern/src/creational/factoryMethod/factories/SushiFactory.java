package creational.factoryMethod.factories;

import creational.factoryMethod.classes.Sushi;
import creational.factoryMethod.interfaces.Dish;
import creational.factoryMethod.interfaces.DishFactory;

public class SushiFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Sushi();
    }
}
