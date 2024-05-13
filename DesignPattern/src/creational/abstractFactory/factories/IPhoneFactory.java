package creational.abstractFactory.factories;

import creational.abstractFactory.classes.IPhoneCamera;
import creational.abstractFactory.classes.IPhoneDisplay;
import creational.abstractFactory.interfaces.ICamera;
import creational.abstractFactory.interfaces.IDisplay;
import creational.abstractFactory.interfaces.IMobileComponentFactory;

public class IPhoneFactory implements IMobileComponentFactory {

    public IPhoneFactory(){
        System.out.println("🎉 Manufacturing IPhone 🎉");
    }

    @Override
    public ICamera createCamera() {
        return new IPhoneCamera();
    }

    @Override
    public IDisplay createDisplay() {
        return new IPhoneDisplay();
    }
}
