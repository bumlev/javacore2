package factoryMethod.factories;

import factoryMethod.classes.Sushi;
import factoryMethod.interfaces.Dish;
import factoryMethod.interfaces.DishFactory;

public class SushiFactory implements DishFactory {

    @Override
    public Dish createDish() {
        return new Sushi();
    }
}
