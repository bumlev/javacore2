package abstractFactory.factories;

import abstractFactory.classes.OnePlusCamera;
import abstractFactory.classes.OnePlusDisplay;
import abstractFactory.interfaces.ICamera;
import abstractFactory.interfaces.IDisplay;
import abstractFactory.interfaces.IMobileComponentFactory;

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
