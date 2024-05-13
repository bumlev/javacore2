package creational.abstractFactory.factories;

import creational.abstractFactory.classes.OnePlusCamera;
import creational.abstractFactory.classes.OnePlusDisplay;
import creational.abstractFactory.interfaces.ICamera;
import creational.abstractFactory.interfaces.IDisplay;
import creational.abstractFactory.interfaces.IMobileComponentFactory;

public class OnePlusFactory implements IMobileComponentFactory {

    public OnePlusFactory(){
        System.out.println("🎉 Manufacturing OnePlus 🎉");
    }

    @Override
    public ICamera createCamera() {
        return new OnePlusCamera();
    }

    @Override
    public IDisplay createDisplay() {
        return new OnePlusDisplay();
    }
}
